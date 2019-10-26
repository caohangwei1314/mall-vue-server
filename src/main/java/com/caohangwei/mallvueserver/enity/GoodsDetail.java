package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
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
