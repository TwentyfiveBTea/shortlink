package com.btea.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btea.shortlink.admin.dao.entity.GroupDO;
import com.btea.shortlink.admin.dao.mapper.GroupMapper;
import com.btea.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 17:50
 * @Description: 短链接分组接口实现层
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {
}
