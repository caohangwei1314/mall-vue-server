package com.caohangwei.mallvueserver.controller;

import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.Order;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.request.OrderAddRequest;
import com.caohangwei.mallvueserver.service.OrderService;
import com.caohangwei.mallvueserver.util.UserContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderAdd")
    public BaseResponse orderAdd(@RequestBody OrderAddRequest orderAddRequest){
        return BaseResponse.createSuccess(orderService.submit(orderAddRequest));
    }

    @PostMapping("/order/list")
    public BaseResponse orderList(){
        return BaseResponse.createSuccess(orderService.getOrderList());
    }
}
