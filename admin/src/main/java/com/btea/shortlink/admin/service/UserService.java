package com.btea.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.btea.shortlink.admin.dao.entity.UserDO;
import com.btea.shortlink.admin.dto.resp.UserRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 15:21
 * @Description: 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);
}
