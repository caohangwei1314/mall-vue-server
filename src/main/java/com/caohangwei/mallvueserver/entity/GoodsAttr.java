package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品套餐
 *
 * @author PinuoC
 */
@Data
@TableName(value = "goods_attr")
public class GoodsAttr {

    @TableId(value = "id")
    private int id;

    // 该配置信息
    @TableField(value = "attr_title")
    private String attrTitle;

    // 该配置商品小图
    @TableField(value = "attr_img_url")
    private String attrImgUrl;

    // 该配置商品编号（每一个属性都有一个独特的商品编号）
    @TableField(value = "goods_code")
    private String goodsCode;

    // 该配置商品价格
    @TableField(value = "attr_price")
    private BigDecimal attrPrice;

    // 该配置商品是否已上架
    @TableField(value = "on_sale")
    private Boolean onSale;
}
