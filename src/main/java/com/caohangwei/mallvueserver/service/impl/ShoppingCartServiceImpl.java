package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.ShoppingCart;
import com.caohangwei.mallvueserver.mapper.ShoppingCartMapper;
import com.caohangwei.mallvueserver.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Override
    public void cartDel(List<ShoppingCart> shoppingCart) {
        shoppingCart.forEach(obj -> {
            this
                    .lambdaUpdate()
                    .eq(ShoppingCart::getId,obj.getId())
                    .remove();
        });
    }
}
