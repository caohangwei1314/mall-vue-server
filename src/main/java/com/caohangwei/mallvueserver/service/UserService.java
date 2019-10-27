package com.caohangwei.mallvueserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.request.IsExistRequest;
import com.caohangwei.mallvueserver.request.LoginRequest;
import com.caohangwei.mallvueserver.response.IsExistResponse;
import com.caohangwei.mallvueserver.response.LoginResponse;

public interface UserService extends IService<User> {

    IsExistResponse isExist(IsExistRequest isExistRequest);

    void regist(User user);

    LoginResponse login(LoginRequest loginRequest);
}
