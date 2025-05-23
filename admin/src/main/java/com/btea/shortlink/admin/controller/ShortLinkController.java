package com.btea.shortlink.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.common.convention.result.Results;
import com.btea.shortlink.admin.remote.ShortLinkActualRemoteService;
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
@RestController(value = "shortLinkControllerByAdmin")
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkActualRemoteService shortLinkActualRemoteService;

    @PostMapping("/api/short-link/admin/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return shortLinkActualRemoteService.createShortLink(requestParam);
    }

    @PostMapping("/api/short-link/admin/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateRepDTO requestParam) {
        shortLinkActualRemoteService.updateShortLink(requestParam);
        return Results.success();
    }

    @GetMapping("/api/short-link/admin/v1/page")
    public Result<Page<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return shortLinkActualRemoteService.pageShortLink(requestParam.getGid(), requestParam.getOrderTag(), requestParam.getCurrent(), requestParam.getSize());
    }

    @SneakyThrows
    @PostMapping("/api/short-link/admin/v1/create/batch")
    public void batchCreateShortLink(@RequestBody ShortLinkBatchCreateReqDTO requestParam, HttpServletResponse response) {
        Result<ShortLinkBatchCreateRespDTO> shortLinkBatchCreateRespDTOResult = shortLinkActualRemoteService.batchCreateShortLink(requestParam);
        if (shortLinkBatchCreateRespDTOResult.isSuccess()) {
            List<ShortLinkBaseInfoRespDTO> baseLinkInfos = shortLinkBatchCreateRespDTOResult.getData().getBaseLinkInfos();
            EasyExcelWebUtil.write(response, "批量创建短链接-SaaS短链接系统", ShortLinkBaseInfoRespDTO.class, baseLinkInfos);
        }
    }
}
