package com.btea.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.project.common.convention.result.Result;
import com.btea.shortlink.project.common.convention.result.Results;
import com.btea.shortlink.project.dto.req.ShortLinkGroupStatsReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkStatsAccessRecodeReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkStatsAccessRecodeRespDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkStatsRespDTO;
import com.btea.shortlink.project.service.ShortLinkStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/14 12:41
 * @Description: 短链接监控控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkStatsController {

    private final ShortLinkStatsService shortLinkStatsService;

    @GetMapping("/api/short-link/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return Results.success(shortLinkStatsService.oneShortLinkStats(requestParam));
    }

    @GetMapping("/api/short-link/v1/stats/gruop")
    public Result<ShortLinkStatsRespDTO> groupShortLinkStats(ShortLinkGroupStatsReqDTO requestParam) {
        return Results.success(shortLinkStatsService.groupShortLinkStats(requestParam));
    }

    @GetMapping("/api/short-link/v1/stats/access-record")
    public Result<IPage<ShortLinkStatsAccessRecodeRespDTO>> shortLinkStatsAccessRecode(ShortLinkStatsAccessRecodeReqDTO requestParam) {
        return Results.success(shortLinkStatsService.shortLinkStatsAccessRecode(requestParam));
    }
}
