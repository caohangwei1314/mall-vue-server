package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.*;
import com.caohangwei.mallvueserver.exception.LoginException;
import com.caohangwei.mallvueserver.exception.QueryException;
import com.caohangwei.mallvueserver.mapper.GoodsMapper;
import com.caohangwei.mallvueserver.response.GoodsListResponse;
import com.caohangwei.mallvueserver.response.GoodsResponse;
import com.caohangwei.mallvueserver.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    private MerchantService merchantService;

    @Autowired
    private GoodsCatService goodsCatService;

    @Autowired
    private GoodsGroupService goodsGroupService;

    @Autowired
    private GoodsAttrService goodsAttrService;

    @Autowired
    private GoodsDetailService goodsDetailService;

    @Autowired
    private GoodsCommentService goodsCommentService;

    @Override
    public GoodsListResponse goodsList(String goodsName, Integer merchantId, Integer page, Integer pageSize) {
        LambdaQueryChainWrapper<Goods> wrapper = this.lambdaQuery();
        if(!StringUtils.isEmpty(goodsName)){
            GoodsCat goodsCat = goodsCatService
                    .lambdaQuery()
                    .eq(GoodsCat::getCatName,goodsName)
                    .one();
            if(goodsCat != null){
                wrapper.eq(Goods::getGoodsCatId,goodsCat.getId());
            }else {
                wrapper.like(Goods::getGoodsName,goodsName);
            }
        }
        if(merchantId != null){
            wrapper.eq(Goods::getMerchantId,merchantId);
        }
        IPage<Goods> goodsIPage = wrapper.page(new Page<>(page == null ? 1 : page,pageSize == null ? 16 : pageSize));
        List<GoodsResponse> goodsResponseList = new ArrayList<>();
        goodsIPage.getRecords().forEach(obj -> {
            GoodsResponse goodsResponse = new GoodsResponse();
            BeanUtils.copyProperties(obj,goodsResponse);
            copyGoods(goodsResponse,obj);
            goodsResponseList.add(goodsResponse);
        });
        GoodsListResponse goodsListResponse = GoodsListResponse
                .builder()
                .data(goodsResponseList)
                .goodsSum((int) goodsIPage.getTotal())
                .build();
        return goodsListResponse;
    }

    @Override
    public GoodsResponse getDetail(Integer goodsId) {
        Goods goods = this
                .lambdaQuery()
                .eq(Goods::getId,goodsId)
                .one();
        if(goods == null){
            throw new QueryException("查询失败");
        }
        GoodsResponse goodsResponse = new GoodsResponse();
        BeanUtils.copyProperties(goods,goodsResponse);
        copyGoods(goodsResponse,goods);
        return goodsResponse;
    }

    private void copyGoods(GoodsResponse goodsResponse,Goods obj){
        goodsResponse
                .setMerchant(merchantService
                        .lambdaQuery()
                        .eq(Merchant::getId,obj.getMerchantId())
                        .one())
                .setGoodsCat(goodsCatService
                        .lambdaQuery()
                        .eq(GoodsCat::getId,obj.getGoodsCatId())
                        .one())
                .setGoodsGroups(goodsGroupService
                        .lambdaQuery()
                        .eq(GoodsGroup::getGoodsName,obj.getGoodsName())
                        .list())
                .setGoodsAttrs(goodsAttrService
                        .lambdaQuery()
                        .in(GoodsAttr::getGoodsId,obj.getId())
                        .list())
                .setGoodsDetails(goodsDetailService
                        .lambdaQuery()
                        .eq(GoodsDetail::getId,obj.getId())
                        .list())
                .setGoodsComments(goodsCommentService
                        .lambdaQuery()
                        .eq(GoodsComment::getGoodsId,obj.getId())
                        .list());
    }
}
