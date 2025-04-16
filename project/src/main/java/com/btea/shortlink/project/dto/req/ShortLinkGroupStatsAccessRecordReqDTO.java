package com.btea.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.btea.shortlink.project.dao.entity.LinkAccessLogsDO;
import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/16 10:26
 * @Description: 分组短链接监控访问记录请求参数
 */
@Data
public class ShortLinkGroupStatsAccessRecordReqDTO extends Page<LinkAccessLogsDO> {

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

