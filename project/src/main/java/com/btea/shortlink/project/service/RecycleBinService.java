package com.btea.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.btea.shortlink.project.dao.entity.ShortLinkDO;
import com.btea.shortlink.project.dto.req.RecycleBinRecoverReqDTO;
import com.btea.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.btea.shortlink.project.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 10:29
 * @Description: 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     *
     * @param requestParam 保存参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);

    /**
     * 分页查询短链接
     *
     * @param requestParam 分页查询短链接请求参数
     * @return 短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkRecycleBinPageReqDTO requestParam);

    /**
     * 恢复短链接
     *
     * @param requestParam 请求参数
     */
    void recoverRecycleBin(RecycleBinRecoverReqDTO requestParam);
}
