package com.btea.shortlink.project.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/26 13:27
 * @Description: 短链接分页返回参数
 */
@Data
public class ShortLinkPageRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 短链接
     */
    private String shortUri;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 网站标识
     */
    private String favicon;

    /**
     * 有效期类型 0：永久有效 1：自定义
     */
    private Integer validDateType;

    /**
     * 有效期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "GMT+8")
    private Date validDate;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 描述
     */
    private String describe;

    /**
     * 历史PV
     */
    private String totalPv;

    /**
     * 今日PV
     */
    private String todayPv;

    /**
     * 历史UV
     */
    private String totalUv;

    /**
     * 今日UV
     */
    private String todayUv;

    /**
     * 历史UIP
     */
    private String totalUip;

    /**
     * 今日UIP
     */
    private String todayUip;
}
