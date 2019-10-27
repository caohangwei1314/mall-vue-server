package com.caohangwei.mallvueserver.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@TableName(value = "second_kill")
public class SecondKill {

    // 唯一标识 ID
    @TableId(value = "id")
    private int id;

    // 秒杀推广图片
    @TableField("sk_img")
    private String skImg;

    // 秒杀价格
    @TableField("sk_price")
    private BigDecimal skPrice;

    // 秒杀结束时间
    @TableField("ended_at")
    private Date endedAt;
}
