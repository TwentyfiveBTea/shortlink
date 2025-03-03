package com.btea.shortlink.project.controller;

import com.btea.shortlink.project.common.convention.result.Result;
import com.btea.shortlink.project.common.convention.result.Results;
import com.btea.shortlink.project.service.UrlTitleService;
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

    private final UrlTitleService urlTitleService;

    @GetMapping("/api/short-link/v1/title")
    public Result<String> getTitleByUrl(@RequestParam("url") String url) {
        return Results.success(urlTitleService.getTitleByUrl(url));
    }
}
