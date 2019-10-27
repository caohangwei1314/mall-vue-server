package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.entity.User;
import com.caohangwei.mallvueserver.exception.LoginException;
import com.caohangwei.mallvueserver.mapper.UserMapper;
import com.caohangwei.mallvueserver.request.IsExistRequest;
import com.caohangwei.mallvueserver.request.LoginRequest;
import com.caohangwei.mallvueserver.response.IsExistResponse;
import com.caohangwei.mallvueserver.response.LoginResponse;
import com.caohangwei.mallvueserver.service.UserService;
import com.caohangwei.mallvueserver.util.SignUtils;
import com.caohangwei.mallvueserver.util.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author PinuoC
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User user = this
                .lambdaQuery()
                .eq(User::getPhone,loginRequest.getPhone())
                .one();
        if(user == null){
            throw new LoginException("未查找到有效用户");
        }
        if(user.getPassword().equals(loginRequest.getPassword())){
            LoginResponse loginResponse = new LoginResponse()
                    .setUsername(user.getUsername())
                    .setPhone(user.getPhone())
                    .setMail(user.getMail())
                    .setToken(TokenUtils.createToken(user, 3600 * 60))
            ;
            return loginResponse;
        }
        throw new LoginException("账号密码错误");
    }

    @Override
    public void regist(User user) {
        Date date = new Date();
        user
                .setPassword(SignUtils.md5(user.getPassword()))
                .setCreateAt(date)
                .setUpdateAt(date)
        ;
        this.save(user);
    }

    @Override
    public IsExistResponse isExist(IsExistRequest isExistRequest) {
        Integer count = this
                .lambdaQuery()
                .eq(User::getPhone,isExistRequest.getPhone())
                .count();
        IsExistResponse isExistResponse = new IsExistResponse()
                .setIsExist(count>0)
                .setCheckNum("123456")
                ;
        return isExistResponse;
    }
}
