package com.caohangwei.mallvueserver.enity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author PinuoC
 */
@Data
@TableName("admin_group")
public class AdminGroup {

    @TableId(value = "id")
    private int id;

    @TableField(value = "group_name")
    private String groupName;

    @TableField(value = "create_at")
    private Date createdAt;

    @TableField(value = "update_at")
    private Date updatedAt;
}
