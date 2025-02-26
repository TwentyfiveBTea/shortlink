package com.btea.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.remote.dto.ShortLinkRemoteService;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/api/short-link/admin/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return shortLinkRemoteService.pageShortLink(requestParam);
    }
}
