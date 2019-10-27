package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "order_detail")
public class OrderDetail {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 套餐ID
    @TableField(value = "attr_id")
    private int attrId;

    // 套餐名称
    @TableField(value = "attr_title")
    private String attrTitle;

    // 商品名称
    @TableField(value = "goods_name")
    private String goodsName;

    // 商品图片
    @TableField(value = "img")
    private String img;

    // 套餐code
    @TableField(value = "goods_code")
    private String goodsCode;

    // 商家ID
    @TableField(value = "merchant_id")
    private int merchantId;

    // 购买数量
    @TableField(value = "count")
    private int count;

    @TableField(value = "goods_id")
    private int goodsId;

    @TableField(value = "order_id")
    private int orderId;
}
