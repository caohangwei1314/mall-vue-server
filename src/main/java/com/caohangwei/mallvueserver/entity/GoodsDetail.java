package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品信息
 *
 * 商品信息是商品的多个键值对关系
 * 如 重量： 30kg, 功能： 防水
 *
 * @author PinuoC
 */
@Data
@TableName(value = "goods_detail")
public class GoodsDetail {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 商品详细信息的 Key
    @TableField(value = "detail_key")
    private String detailKey;

    // 商品详细信息的 Value
    @TableField(value = "detail_value")
    private String detailValue;
}
