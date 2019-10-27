package com.caohangwei.mallvueserver.request;

import com.caohangwei.mallvueserver.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderRequest {

    private String address;

    private int addressId;

    private String name;

    private List<OrderDetail> orderDetail;

    private int orderid;

    private BigDecimal price;
}
