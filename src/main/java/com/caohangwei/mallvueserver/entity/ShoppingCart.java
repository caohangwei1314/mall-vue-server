package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "shopping_cart")
public class ShoppingCart {

    @TableId(value = "id")
    private int id; // 购物车id
    // 商品图片
    @TableField(value = "img")
    private String img;
    // 商品ID
    @TableField(value = "goods_id")
    private int goodsId;
    @TableField(value = "user_id")
    private int userId;
    // 商户ID
    @TableField(value = "merchant_id")
    private int merchantId;
    // 套餐ID
    @TableField(value = "attr_id")
    private int attrId;
    // 商品价格
    @TableField(value = "price")
    private BigDecimal price;
    // 商品个数
    @TableField(value = "count")
    private int count;
    // 商品描述
    @TableField(value = "title")
    private String title;
    // 套餐描述
    @TableField(value = "attr_title")
    private String attrTitle;
    // 商品code
    @TableField(value = "goods_code")
    private String goodsCode;
}
