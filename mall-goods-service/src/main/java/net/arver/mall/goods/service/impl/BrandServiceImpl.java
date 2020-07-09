package net.arver.mall.goods.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import net.arver.mall.common.model.PageResult;
import net.arver.mall.goods.dto.BrandParam;
import net.arver.mall.goods.mapper.BrandMapper;
import net.arver.mall.goods.model.Brand;
import net.arver.mall.goods.model.BrandExample;
import net.arver.mall.goods.service.BrandService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

@DubboService
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findList(final BrandParam brandParam) {
        final BrandExample example = createExample(brandParam);
        return brandMapper.selectByExample(example);
    }


    @Override
    public PageResult<Brand> findPage(final BrandParam brandParam, final int pageNum, final int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        final BrandExample example = createExample(brandParam);
        final Page<Brand> result = (Page<Brand>) brandMapper.selectByExample(example);
        return new PageResult(result.getTotal(), result.getResult());
    }

    @Override
    public Brand findById(final Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(final Brand brand) {
        return brandMapper.insertSelective(brand);
    }

    @Override
    public int update(final Brand brand) {
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int delete(final Integer id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    private BrandExample createExample(final BrandParam brandParam) {
        final BrandExample example = new BrandExample();
        final BrandExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(brandParam.getName())) {
            criteria.andNameLike("%" + brandParam.getName() + "%");
        }
        if (!StringUtils.isEmpty(brandParam.getLetter())) {
            criteria.andLetterLike("%" + brandParam.getLetter() + "%");
        }
        return example;
    }

}
