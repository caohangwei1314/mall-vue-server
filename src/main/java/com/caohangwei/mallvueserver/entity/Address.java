package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author PinuoC
 */
@Data
@TableName("address")
public class Address {

    @TableId(value = "address_id")
    private int address_id;

    // 姓名
    @TableField(value = "name")
    private String name;

    // 省
    @TableField(value = "province")
    private String province;

    // 市
    @TableField(value = "city")
    private String city;

    // 区
    @TableField(value = "area")
    private String area;

    // 详细地址
    @TableField(value = "address")
    private String address;

    // 手机
    @TableField(value = "phone")
    private String phone;

    // 邮政编码
    @TableField(value = "postal_code")
    private String postalcode;

    @TableField(value = "user_id")
    private int userid;
}
