package com.btea.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/05 14:11
 * @Description: 用户返回无脱敏参数响应
 */
@Data
public class UserActualRespDTO {
    // ID
    private Long id;

    // 用户名
    private String username;

    // 真实姓名
    private String realName;

    // 手机号
    private String phone;

    // 邮箱
    private String mail;
}
