package com.btea.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.btea.shortlink.project.dao.entity.ShortLinkDO;
import com.btea.shortlink.project.dto.req.RecycleBinSaveReqDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 10:29
 * @Description: 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     * @param requestParam 保存参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);
}
