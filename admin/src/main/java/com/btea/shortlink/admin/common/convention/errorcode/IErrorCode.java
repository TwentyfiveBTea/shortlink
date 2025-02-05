package com.btea.shortlink.admin.common.convention.errorcode;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 18:15
 * @Description: 平台错误码
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}