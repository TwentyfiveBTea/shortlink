package com.btea.shortlink.project.service;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/3 19:51
 * @Description: URL标题接口层
 */
public interface UrlTitleService {

    /**
     * 根据 URL 获取标题
     *
     * @param url 目标网站地址
     * @return 网站标题
     */
    String getTitleByUrl(String url);
}
