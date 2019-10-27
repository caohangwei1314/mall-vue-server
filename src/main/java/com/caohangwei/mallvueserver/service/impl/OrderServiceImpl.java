package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.Order;
import com.caohangwei.mallvueserver.entity.OrderDetail;
import com.caohangwei.mallvueserver.entity.ShoppingCart;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.exception.BusinessException;
import com.caohangwei.mallvueserver.mapper.OrderMapper;
import com.caohangwei.mallvueserver.request.OrderAddRequest;
import com.caohangwei.mallvueserver.request.OrderRequest;
import com.caohangwei.mallvueserver.response.OrderResponse;
import com.caohangwei.mallvueserver.service.OrderDetailService;
import com.caohangwei.mallvueserver.service.OrderService;
import com.caohangwei.mallvueserver.service.ShoppingCartService;
import com.caohangwei.mallvueserver.util.UserContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailService orderDetailService;

    @Override
    @Transactional
    public boolean submit(OrderAddRequest orderAddRequest) {
        OrderRequest orderRequest = orderAddRequest.getOrder();
        if(orderRequest == null){
            throw new BusinessException("订单为空");
        }
        User user = UserContextHolder.getUser();
        shoppingCartService
                .lambdaUpdate()
                .in(ShoppingCart::getId,orderAddRequest.getCart())
                .remove();
        Order order = new Order();
        BeanUtils.copyProperties(orderAddRequest.getOrder(),order);
        order.setUserid(user.getUserid());
        orderService.save(order);
        orderRequest.getOrderDetail().forEach(obj -> {
            orderDetailService.save(obj);
        });
        return true;
    }

    @Override
    public List<OrderResponse> getOrderList() {
        User user = UserContextHolder.getUser();
        List<Order> orderList = this
                .lambdaQuery()
                .eq(Order::getUserid,user.getUserid())
                .list();
        List<OrderResponse> orderResponseList = new ArrayList<>();
        orderList.forEach(obj -> {
            OrderResponse orderResponse = new OrderResponse();
            BeanUtils.copyProperties(obj,orderResponse);
            orderResponse.setOrderDetail(orderDetailService
                    .lambdaQuery()
                    .eq(OrderDetail::getOrderId,obj.getOrderid())
                    .list());
            orderResponseList.add(orderResponse);
        });
        return orderResponseList;
    }
}
