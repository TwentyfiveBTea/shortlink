package com.btea.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.common.convention.result.Results;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkBatchCreateReqDTO;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkUpdateRepDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkBaseInfoRespDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkBatchCreateRespDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.btea.shortlink.admin.toolkit.EasyExcelWebUtil;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/26 15:19
 * @Description: 短链接后管控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    @PostMapping("/api/short-link/admin/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return shortLinkRemoteService.createShortLink(requestParam);
    }

    @PostMapping("/api/short-link/admin/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateRepDTO requestParam) {
        shortLinkRemoteService.updateShortLink(requestParam);
        return Results.success();
    }

    @GetMapping("/api/short-link/admin/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return shortLinkRemoteService.pageShortLink(requestParam);
    }

    @SneakyThrows
    @PostMapping("/api/short-link/admin/v1/create/batch")
    public void batchCreateShortLink(@RequestBody ShortLinkBatchCreateReqDTO requestParam, HttpServletResponse response) {
        Result<ShortLinkBatchCreateRespDTO> shortLinkBatchCreateRespDTOResult = shortLinkRemoteService.batchCreateShortLink(requestParam);
        if (shortLinkBatchCreateRespDTOResult.isSuccess()) {
            List<ShortLinkBaseInfoRespDTO> baseLinkInfos = shortLinkBatchCreateRespDTOResult.getData().getBaseLinkInfos();
            EasyExcelWebUtil.write(response, "批量创建短链接-SaaS短链接系统", ShortLinkBaseInfoRespDTO.class, baseLinkInfos);
        }
    }
}
