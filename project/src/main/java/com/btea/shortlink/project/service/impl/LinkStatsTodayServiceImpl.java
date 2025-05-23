package com.btea.shortlink.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.btea.shortlink.project.dao.entity.LinkStatsTodayDO;
import com.btea.shortlink.project.dao.mapper.LinkStatsTodayMapper;
import com.btea.shortlink.project.service.LinkStatsTodayService;
import org.springframework.stereotype.Service;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/17 13:53
 * @Description: 短链接今日统计接口实现层
 */
@Service
public class LinkStatsTodayServiceImpl extends ServiceImpl<LinkStatsTodayMapper, LinkStatsTodayDO> implements LinkStatsTodayService {
}
