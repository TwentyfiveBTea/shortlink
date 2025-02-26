package com.btea.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.btea.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/26 13:26
 * @Description: 短链接分页请求参数
 */
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识
     */
    private String gid;
}
