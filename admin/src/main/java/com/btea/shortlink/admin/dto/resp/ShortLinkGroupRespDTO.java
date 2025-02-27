package com.btea.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/24 17:03
 * @Description: 短链接分组返回实体
 */
@Data
public class ShortLinkGroupRespDTO {
    // 分组标识
    private String gid;

    // 分组名称
    private String name;

    //分组排序
    private Integer sortOrder;
}
