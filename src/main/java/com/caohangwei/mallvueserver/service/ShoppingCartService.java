package com.caohangwei.mallvueserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caohangwei.mallvueserver.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService extends IService<ShoppingCart> {

    void cartDel(List<ShoppingCart> shoppingCart);
}
