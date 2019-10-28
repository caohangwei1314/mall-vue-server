package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "admin_user")
public class AdminUser {

    @TableId(value = "user_id")
    private int userid;

    @TableField(value = "user_name")
    private String username;

    @TableField(value = "password")
    private String password;

    @TableField(value = "is_admin")
    private Boolean isAdmin;

    @TableField(value = "email")
    private String email;

    @TableField(value = "create_at")
    private Date createdAt;

    @TableField(value = "updated_at")
    private Date updatedAt;

    @TableField(value = "merchant_id")
    private Integer merchantId;
}
