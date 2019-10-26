package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
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
