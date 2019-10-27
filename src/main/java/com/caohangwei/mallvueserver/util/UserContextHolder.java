package com.caohangwei.mallvueserver.util;

import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class UserContextHolder {

    @Autowired
    private static UserService userService;

    public static User getUser(){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        User user = (User) request.getAttribute("tokenData");
        return user;
    }
}
