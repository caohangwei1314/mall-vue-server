package com.caohangwei.mallvueserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caohangwei.mallvueserver.entity.Order;
import com.caohangwei.mallvueserver.request.OrderAddRequest;
import com.caohangwei.mallvueserver.response.OrderResponse;

import java.util.List;

public interface OrderService extends IService<Order> {

    boolean submit(OrderAddRequest orderAddRequest);

    List<OrderResponse> getOrderList();
}
