package com.btea.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.project.common.convention.result.Result;
import com.btea.shortlink.project.common.convention.result.Results;
import com.btea.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkUpdateRepDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkGroupCountQueryRespDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import com.btea.shortlink.project.service.ShortLinkService;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/25 10:50
 * @Description: 短链接控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    @GetMapping("/{short-uri}")
    public void restoreUrl(@PathVariable("short-uri") String shortUri, ServletRequest request, ServletResponse response) {
        shortLinkService.restoreUrl(shortUri, request, response);
    }

    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }

    @PostMapping("/api/short-link/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateRepDTO requestParam) {
        shortLinkService.updateShortLink(requestParam);
        return Results.success();
    }

    @GetMapping("/api/short-link/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return Results.success(shortLinkService.pageShortLink(requestParam));
    }

    @GetMapping("/api/short-link/v1/count")
    public Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(@RequestParam("requestParam") List<String> requestParam) {
        return Results.success(shortLinkService.listGroupShortLinkCount(requestParam));
    }
}
