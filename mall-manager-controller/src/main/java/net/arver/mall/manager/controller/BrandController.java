package net.arver.mall.manager.controller;

import net.arver.mall.common.model.PageResult;
import net.arver.mall.common.model.ServiceResult;
import net.arver.mall.goods.dto.BrandParam;
import net.arver.mall.goods.model.Brand;
import net.arver.mall.goods.service.BrandService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @DubboReference(url = "127.0.0.1:28000")
    private BrandService brandService;

    @GetMapping("/findList")
    public ServiceResult<List<Brand>> findAll(final BrandParam brandParam) {
        final List<Brand> brandList = brandService.findList(brandParam);
        return new ServiceResult<>(brandList);
    }

    @GetMapping("/findPage")
    public PageResult<Brand> findPage(final BrandParam brandParam, final int pageNum, final int pageSize) {
        return brandService.findPage(brandParam, pageNum, pageSize);
    }

    @GetMapping("findById")
    public ServiceResult<Brand> findById(final Integer id) {
        final Brand brand = brandService.findById(id);
        return new ServiceResult<>(brand);
    }

    @PostMapping("/add")
    public ServiceResult<Brand> add(final Brand brand) {
        brandService.add(brand);
        return new ServiceResult<>(brand);
    }

    @PostMapping("/update")
    public ServiceResult<Brand> update(final Brand brand) {
        brandService.update(brand);
        return new ServiceResult<>(brand);
    }

    @PostMapping("/delete")
    public ServiceResult delete(final Integer id) {
        brandService.delete(id);
        return new ServiceResult();
    }
}
