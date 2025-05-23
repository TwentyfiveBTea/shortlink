package com.btea.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.btea.shortlink.admin.common.database.BaseDO;
import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 15:00
 * @Description: 用户持久层实体
 */
@Data
@TableName("t_user")  // 解决表名与类名不一致问题
public class UserDO extends BaseDO {
    // ID
    private Long id;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 真实姓名
    private String realName;

    // 手机号
    private String phone;

    // 邮箱
    private String mail;

    // 注销时间戳
    private Long deletionTime;
}
