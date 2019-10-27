package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "goods_comment")
public class GoodsComment {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 评价内容
    @TableField(value = "comment_content")
    private String commentContent;

    // 评价等级：星星数量
    @TableField(value = "comment_level")
    private int commentLevel;

    // 评论标签 例:"好用,不错,货美价廉" 前台写死规定几个标签供选择
    @TableField(value = "tags")
    private String tags;

    // 用户名
    @TableField(value = "user_name")
    private String username;

    // 用户id
    @TableField(value = "user_id")
    private int userid;

    // 商品Id # 外键
    @TableField(value = "goods_id")
    private int goodsId;

    // 套餐描述
    @TableField(value = "attr_title")
    private String attrTitle;

    // 评论时间
    @TableField(value = "create_at")
    private Date createAt;

    // 订单号
    @TableField(value = "order_id")
    private String orderId;
}
