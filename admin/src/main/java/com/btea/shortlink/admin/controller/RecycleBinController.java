package com.btea.shortlink.admin.controller;

import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.common.convention.result.Results;
import com.btea.shortlink.admin.dto.req.RecycleBinSaveReqDTO;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 10:24
 * @Description: 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };


    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        shortLinkRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }
}
