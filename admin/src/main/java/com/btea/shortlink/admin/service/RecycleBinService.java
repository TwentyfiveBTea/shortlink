package com.btea.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 11:13
 * @Description: URL 回收站接口层
 */
public interface RecycleBinService {

    /**
     * 分页查询回收站短链接
     *
     * @param requestParam 请求参数
     * @return 返回参数
     */
    Result<Page<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
