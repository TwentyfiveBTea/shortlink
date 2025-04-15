package com.btea.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.btea.shortlink.project.dto.req.ShortLinkGroupStatsReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkStatsAccessRecodeReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkStatsReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkStatsAccessRecodeRespDTO;
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

    /**
     * 获取分组短链接监控数据
     *
     * @param requestParam 获取分组短链接监控数据入参
     * @return 分组短链接监控数据
     */
    ShortLinkStatsRespDTO groupShortLinkStats(ShortLinkGroupStatsReqDTO requestParam);

    /**
     * 访问单个短链接指定时间内访问记录监控数据
     *
     * @param requestParam 获取短链接监控访问记录数据入参
     * @return 访问记录监控数据
     */
    IPage<ShortLinkStatsAccessRecodeRespDTO> shortLinkStatsAccessRecode(ShortLinkStatsAccessRecodeReqDTO requestParam);
}
