package com.caohangwei.mallvueserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caohangwei.mallvueserver.base.BaseResponse;
import com.caohangwei.mallvueserver.entity.AdminUser;

public interface AdminUserService extends IService<AdminUser> {

    BaseResponse login(AdminUser user);
}
