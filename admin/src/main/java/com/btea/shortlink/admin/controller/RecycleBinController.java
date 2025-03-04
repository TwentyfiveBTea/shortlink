package com.btea.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.common.convention.result.Results;
import com.btea.shortlink.admin.dto.req.RecycleBinSaveReqDTO;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import com.btea.shortlink.admin.remote.dto.req.RecycleBinRecoverReqDTO;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.btea.shortlink.admin.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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

    private final RecycleBinService recycleBinService;

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    @PostMapping("/api/short-link/admin/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        shortLinkRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }

    @GetMapping("/api/short-link/admin/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return recycleBinService.pageRecycleBinShortLink(requestParam);
    }

    @PostMapping("/api/short-link/admin/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody RecycleBinRecoverReqDTO requestParam) {
        shortLinkRemoteService.recoverRecycleBin(requestParam);
        return Results.success();
    }
}
