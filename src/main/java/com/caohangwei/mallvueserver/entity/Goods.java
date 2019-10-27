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
@TableName(value = "goods")
public class Goods {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 商品名称
    @TableField("goods_name")
    private String goodsName;

    // 商品图片多张使用 `,` 分割，限制最多五张
    @TableField("goods_imgs")
    private String goodsImgs;

    // 商品描述（只能使用图片，规则和商品图片相同）
    @TableField("goods_desc")
    private String goodsDesc;

    // 基础价格，套餐价格在此基础上变化
    @TableField("basic_price")
    private BigDecimal basicPrice;

    // 商品销售总数
    @TableField("sales_num")
    private int salesNum;

    // 库存总数
    @TableField("sku_num")
    private int skuNum;
}
