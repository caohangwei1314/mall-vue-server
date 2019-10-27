package com.caohangwei.mallvueserver.controller;

import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.ShoppingCart;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/cartList")
    public BaseResponse cartList(HttpServletRequest request){
        User user = (User) request.getAttribute("tokenData");
        return BaseResponse.createSuccess(shoppingCartService
                .lambdaQuery()
                .eq(ShoppingCart::getUserId,user.getUserid())
                .list());
    }

    @PostMapping("/cartAdd")
    public BaseResponse cartAdd(@RequestBody ShoppingCart shoppingCart,
                                HttpServletRequest request){
        User user = (User) request.getAttribute("tokenData");
        shoppingCart.setUserId(user.getUserid());
        return BaseResponse.createSuccess(shoppingCartService.save(shoppingCart));
    }

    @PostMapping("/cartDel")
    public BaseResponse cartDel(@RequestBody List<ShoppingCart> shoppingCart){
        shoppingCartService.cartDel(shoppingCart);
        return BaseResponse.createSuccess();
    }
}
