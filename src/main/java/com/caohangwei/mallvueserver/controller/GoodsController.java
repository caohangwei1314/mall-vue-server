package com.caohangwei.mallvueserver.controller;

import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.request.GoodsListRequest;
import com.caohangwei.mallvueserver.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public BaseResponse goodsList(@RequestParam(value = "goodsName",required = false) String goodsName,
                                  @RequestParam(value = "merchantId",required = false) Integer merchantId,
                                  @RequestParam(value = "page",required = false) Integer page,
                                  @RequestParam(value = "pageSize",required = false) Integer pageSize){
        return BaseResponse.createSuccess(goodsService.goodsList(goodsName,merchantId,page,pageSize));
    }

    @PostMapping("/admin/list")
    public BaseResponse goodsList(@RequestBody GoodsListRequest goodsListRequest){
        return BaseResponse.createSuccess(goodsService.goodsList(goodsListRequest));
    }

    @GetMapping("/detail/{goodsId}")
    public BaseResponse goodsDetail(@PathVariable("goodsId") Integer goodsId){
        return BaseResponse.createSuccess(goodsService.getDetail(goodsId));
    }
}
