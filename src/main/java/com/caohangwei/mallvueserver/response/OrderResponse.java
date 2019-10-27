package com.caohangwei.mallvueserver.response;

import com.caohangwei.mallvueserver.entity.Order;
import com.caohangwei.mallvueserver.entity.OrderDetail;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponse extends Order {

    private List<OrderDetail> orderDetail;
}
