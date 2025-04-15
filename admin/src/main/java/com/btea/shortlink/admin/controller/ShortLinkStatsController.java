package com.btea.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.dto.req.ShortLinkStatsAccessRecodeReqDTO;
import com.btea.shortlink.admin.dto.resp.ShortLinkStatsAccessRecodeRespDTO;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import com.btea.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkStatsRespDTO;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/15 10:01
 * @Description: 短链接监控控制层
 */
public class ShortLinkStatsController {

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkStatsService = new ShortLinkRemoteService() {
    };

    @GetMapping("/api/short-link/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return shortLinkStatsService.oneShortLinkStats(requestParam);
    }

    @GetMapping("/api/short-link/v1/stats/access-record")
    public Result<IPage<ShortLinkStatsAccessRecodeRespDTO>> shortLinkStatsAccessRecode(ShortLinkStatsAccessRecodeReqDTO requestParam) {
        return shortLinkStatsService.shortLinkStatsAccessRecode(requestParam);
    }
}
