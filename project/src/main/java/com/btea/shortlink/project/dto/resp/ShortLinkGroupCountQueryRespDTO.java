package com.btea.shortlink.project.dto.resp;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/27 17:35
 * @Description: 端链接分组查询返回参数
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;
}
