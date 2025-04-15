package com.btea.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.btea.shortlink.project.dao.entity.LinkAccessLogsDO;
import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/14 12:45
 * @Description: 短链接监控访问记录请求参数
 */
@Data
public class ShortLinkStatsAccessRecodeReqDTO extends Page<LinkAccessLogsDO> {

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 开始日期
     */
    private String startDate;

    /**
     * 结束日期
     */
    private String endDate;
}
