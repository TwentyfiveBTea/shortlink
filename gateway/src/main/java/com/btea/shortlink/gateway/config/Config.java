package com.btea.shortlink.gateway.config;

import lombok.Data;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/5/8 11:19
 * @Description: 过滤器配置
 */
@Data
public class Config {

    /**
     * 白名单前置路径
     */
    private List<String> whitePathList;
}