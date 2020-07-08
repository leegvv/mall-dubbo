package net.arver.mall.manager.controller;

import net.arver.mall.goods.service.GoodsService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @DubboReference(url = "127.0.0.1:12345")
    private GoodsService goodsService;

    @GetMapping("/test")
    public String test() {
        return "Hello world!";
    }

    @GetMapping("/testDubbo")
    public String testDubbo() {
        return goodsService.testDubbo();
    }
}
