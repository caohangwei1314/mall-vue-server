package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品分组
 *
 * 商品分组提供给商家自己归类商品
 *
 * @author PinuoC
 */
@Data
@TableName(value = "goods_group")
public class GoodsGroup {

    @TableId(value = "id")
    private int id;

    @TableField(value = "goods_name")
    private String goodsName;
}
