package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 首页推广
 *
 * @author PinuoC
 */
@Data
@TableName(value = "home_extend")
public class HomeExtend {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 推广标题
    @TableField(value = "extend_title")
    private String extendTitle;

    // 推广图片地址
    @TableField(value = "extend_img_url")
    private String extendImgUrl;
}
