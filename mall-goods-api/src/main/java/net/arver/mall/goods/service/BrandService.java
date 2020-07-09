package net.arver.mall.goods.service;

import net.arver.mall.common.model.PageResult;
import net.arver.mall.goods.dto.BrandParam;
import net.arver.mall.goods.model.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> findList(BrandParam brandParam);

    PageResult<Brand> findPage(BrandParam brandParam, int pageNum, final int pageSize);

    Brand findById(Integer id);

    int add(Brand brand);

    int update(Brand brand);

    int delete(Integer id);

}
