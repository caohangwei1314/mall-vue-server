package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author PinuoC
 */
@Data
@Accessors(chain = true)
@TableName(value = "orders")
public class Order {

    // 唯一标识 ID
    @TableId(value = "order_id")
    private Integer orderid;

    // 姓名
    @TableField(value = "name")
    private String name;

    // 地址
    @TableField(value = "address")
    private String address;

    // 地址ID
    @TableField(value = "address_id")
    private int addressId;

    // 价钱
    @TableField(value = "price")
    private BigDecimal price;

    // 用户id
    @TableField(value = "user_id")
    private int userid;

    // 订单状态
    @TableField(value = "status")
    private int status;
}
