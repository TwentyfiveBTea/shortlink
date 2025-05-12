package com.btea.shortlink.aggregation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/05/12 13:51
 * @Description: 启动类
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "com.btea.shortlink.admin",
        "com.btea.shortlink.project"
})
@MapperScan(value = {
        "com.btea.shortlink.project.dao.mapper",
        "com.btea.shortlink.admin.dao.mapper"
})
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}
