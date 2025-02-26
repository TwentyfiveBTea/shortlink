package com.btea.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/26 13:26
 * @Description: 短链接分页请求参数
 */
@Data
public class ShortLinkPageReqDTO extends Page {

    /**
     * 分组标识
     */
    private String gid;
}
