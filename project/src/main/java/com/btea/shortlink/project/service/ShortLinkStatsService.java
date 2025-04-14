package com.btea.shortlink.project.service;

import com.btea.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkStatsRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/14 12:50
 * @Description: 短链接监控接口层
 */
public interface ShortLinkStatsService {

    /**
     * 获取单个短链接监控数据
     *
     * @param requestParam 获取短链接监控数据入参
     * @return 短链接监控数据
     */
    ShortLinkStatsRespDTO oneShortLinkStats(ShortLinkStatsReqDTO requestParam);
}
