package com.btea.shortlink.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/25 10:47
 * @Description: 启动类
 */
@SpringBootApplication
@MapperScan("com.btea.shortlink.project.dao.mapper")
public class ShortLinkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkApplication.class, args);
    }
}
