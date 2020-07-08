package net.arver.mall.goods.service.impl;

import net.arver.mall.goods.service.GoodsService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class GoodsServiceImpl implements GoodsService {
    @Override
    public String testDubbo() {
        return "test dubbo";
    }
}
