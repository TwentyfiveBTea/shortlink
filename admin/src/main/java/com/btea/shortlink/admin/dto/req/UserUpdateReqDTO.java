package com.btea.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 14:09
 * @Description: 修改用户请求参数
 */
@Data
public class UserUpdateReqDTO {
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
}
