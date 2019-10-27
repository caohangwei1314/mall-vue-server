package com.caohangwei.mallvueserver.controller;

import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.ShoppingCart;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.request.IsExistRequest;
import com.caohangwei.mallvueserver.request.LoginRequest;
import com.caohangwei.mallvueserver.response.IsExistResponse;
import com.caohangwei.mallvueserver.service.ShoppingCartService;
import com.caohangwei.mallvueserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author PinuoC
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/isExist")
    public BaseResponse isExist(@RequestBody IsExistRequest isExistRequest){
        return BaseResponse.createSuccess(userService.isExist(isExistRequest));
    }

    @PostMapping("/signUp")
    public BaseResponse signUp(@RequestBody User user){
        userService.regist(user);
        return BaseResponse.createSuccess();
    }

    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginRequest loginRequest){
        return BaseResponse.createSuccess(userService.login(loginRequest));
    }

    @PostMapping("cartList")
    public BaseResponse cartList(HttpServletRequest request){
        User user = (User) request.getAttribute("tokenData");
        return BaseResponse.createSuccess(shoppingCartService
                .lambdaQuery()
                .eq(ShoppingCart::getUserId,user.getUserid())
                .list());
    }
}
