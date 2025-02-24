package com.btea.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/24 21:38
 * @Description: 短链接排序参数
 */
@Data
public class ShortLinkGroupSortReqDTO {
    // 分组ID
    private String gid;

    // 排序
    private Integer sortOrder;
}
