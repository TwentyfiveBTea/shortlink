package com.btea.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/24 17:50
 * @Description: 短链接分组修改参数
 */
@Data
public class ShortLinkGroupUpdateReqDTO {
    // 分组标识
    private String gid;

    // 分组名
    private String name;
}
