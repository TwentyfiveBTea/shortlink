package com.btea.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.btea.shortlink.project.dao.entity.ShortLinkDO;
import com.btea.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/2/25 10:42
 * @Description: 短链接接口层
 */
public interface ShortLinkService extends IService<ShortLinkDO> {

    /**
     * 创建短链接
     *
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建信息
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);
}
