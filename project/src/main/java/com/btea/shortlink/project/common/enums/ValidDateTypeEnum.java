package com.btea.shortlink.project.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/27 21:28
 * @Description: 有效期类型
 */
@RequiredArgsConstructor
public enum ValidDateTypeEnum {

    /**
     * 永久有效期
     */
    PERMANENT(0),

    /**
     * 自定义有效期
     */
    CUSTOM(1);

    @Getter
    private final int type;
}
