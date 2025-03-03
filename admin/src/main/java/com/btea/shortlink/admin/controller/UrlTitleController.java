package com.btea.shortlink.admin.controller;

import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/3 19:48
 * @Description: URL标题控制层
 */
@RestController
@RequiredArgsConstructor
public class UrlTitleController {

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    @GetMapping("/api/short-link/admin/v1/title")
    public Result<String> getTitleByUrl(@RequestParam("url") String url) {
        return shortLinkRemoteService.getTitleByUrl(url);
    }
}
