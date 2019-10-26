package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author PinuoC
 */
@TableName(value = "goods_cat")
@Data
public class GoodsCat {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 父 ID
    @TableField(value = "parent_id")
    private int parentId;

    // 分类名称
    @TableField(value = "cat_name")
    private String catName;
}
