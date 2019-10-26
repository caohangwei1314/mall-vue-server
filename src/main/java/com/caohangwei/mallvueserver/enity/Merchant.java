package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "merchant")
public class Merchant {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 商家名称
    @TableField(value = "merchant_name")
    private String merchantName;

    // 店铺地址
    @TableField(value = "merchant_place")
    private String merchantPlace;

    // 店铺描述
    @TableField(value = "merchant_desc")
    private String merchantDesc;

    // 后台登陆密码
    @TableField(value = "admin_pass")
    private String adminPass;

    @TableField(value = "created_at")
    private Date createdAt;

    @TableField(value = "updated_at")
    private Date updatedAt;
}
