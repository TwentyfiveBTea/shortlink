package com.btea.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 17:47
 * @Description: 短链接分组实体
 */
@Data
@TableName("t_group")
public class GroupDO {
    // id
    private Long id;

    // 分组标识
    private String gid;

    // 分组名称
    private String name;

    // 创建分组用户名
    private String username;

    //分组排序
    private Integer sortOrder;

    // 创建时间
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    // 修改时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    // 删除标识  0：未删除 1：已删除
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}
