package com.btea.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 15:42
 * @Description: 用户返回参数响应
 */
@Data
public class UserRespDTO {
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
