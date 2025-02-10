package com.btea.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.btea.shortlink.admin.dao.entity.GroupDO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 17:50
 * @Description: 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

}
