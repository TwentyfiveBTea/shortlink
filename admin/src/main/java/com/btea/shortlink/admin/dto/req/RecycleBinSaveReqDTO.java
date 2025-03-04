package com.btea.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 10:27
 * @Description: 回收站保存功能
 */
@Data
public class RecycleBinSaveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
