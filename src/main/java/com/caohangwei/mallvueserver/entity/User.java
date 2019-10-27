package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.caohangwei.mallvueserver.util.SignUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "user")
public class User {

    @TableId(value = "user_id")
    private int userid; // 用户id

    @TableField(value = "user_name")
    private String username; // 用户名

    @TableField(value = "password")
    private String password; // 密码

    @TableField(value = "mail")
    private String mail; // 邮箱

    @TableField(value = "phone")
    private String phone; // 手机

    @TableField(value = "status")
    private int status; // 状态

    @TableField(value = "create_at")
    private Date createAt; // 创建时间

    @TableField(value = "update_at")
    private Date updateAt; // 修改时间
}
