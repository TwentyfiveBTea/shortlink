package com.btea.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 14:19
 * @Description: 用户登录请求参数
 */
@Data
public class UserLoginReqDTO {
    // 用户名
    private String username;
    // 密码
    private String password;
}
