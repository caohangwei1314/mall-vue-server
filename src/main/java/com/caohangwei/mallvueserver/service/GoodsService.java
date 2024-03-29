package com.caohangwei.mallvueserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caohangwei.mallvueserver.entity.Goods;
import com.caohangwei.mallvueserver.request.GoodsListRequest;
import com.caohangwei.mallvueserver.response.GoodsListResponse;
import com.caohangwei.mallvueserver.response.GoodsResponse;

public interface GoodsService extends IService<Goods> {

    GoodsListResponse goodsList(String goodsName, Integer merchantId, Integer page, Integer pageSize);

    GoodsListResponse goodsList(GoodsListRequest goodsListRequest);

    GoodsResponse getDetail(Integer goodsId);
}
