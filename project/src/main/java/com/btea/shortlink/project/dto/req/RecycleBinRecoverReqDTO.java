package com.btea.shortlink.project.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 11:59
 * @Description: 回收站回复功能
 */
@Data
public class RecycleBinRecoverReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
