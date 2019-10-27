package com.caohangwei.mallvueserver.request;

import lombok.Data;

import java.util.List;

@Data
public class OrderAddRequest {

    private List<Integer> cart;

    private OrderRequest order;
}
