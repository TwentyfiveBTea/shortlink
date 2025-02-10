package com.btea.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 14:17
 * @Description: 用户登录接口返回相应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {
    // 用户 Token
    private String token;
}
