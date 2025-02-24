package com.btea.shortlink.admin.common.biz.user;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/24 17:34
 * @Description: 用户配置自动装配
 */
@Configuration
public class UserConfiguration {

    /**
     * 用户信息传递过滤器
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter(StringRedisTemplate stringRedisTemplate) {
        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransmitFilter(stringRedisTemplate));
        registration.addUrlPatterns("/*");
        registration.addInitParameter("Login", "/api/short-link/admin/v1/user/login");
        registration.setOrder(0);
        return registration;
    }
}
