package com.caohangwei.mallvueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.AdminUser;
import com.caohangwei.mallvueserver.exception.BusinessException;
import com.caohangwei.mallvueserver.mapper.AdminUserMapper;
import com.caohangwei.mallvueserver.response.admin.LoginResponse;
import com.caohangwei.mallvueserver.service.AdminUserService;
import com.caohangwei.mallvueserver.util.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements AdminUserService {

    @Override
    public BaseResponse login(AdminUser user) {
        AdminUser adminUser = this
                .lambdaQuery()
                .eq(AdminUser::getUsername,user.getUsername())
                .eq(AdminUser::getPassword,user.getPassword())
                .one();
        if(adminUser == null){
            throw new BusinessException("账号密码错误");
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse
                .setName(adminUser.getUsername())
                .setToken(TokenUtils.createToken(adminUser, 3600 * 60));
        return BaseResponse.createSuccess(loginResponse);
    }
}
