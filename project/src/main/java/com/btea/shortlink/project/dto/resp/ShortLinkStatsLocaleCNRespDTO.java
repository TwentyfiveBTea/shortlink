package com.btea.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/14 12:47
 * @Description: 短链接地区监控响应参数
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkStatsLocaleCNRespDTO {

    /**
     * 统计
     */
    private Integer cnt;

    /**
     * 地区
     */
    private String locale;

    /**
     * 占比
     */
    private Double ratio;
}