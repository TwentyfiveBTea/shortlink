package com.btea.shortlink.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.btea.shortlink.admin.common.biz.user.UserContext;
import com.btea.shortlink.admin.common.convention.exception.ServiceException;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.dao.entity.GroupDO;
import com.btea.shortlink.admin.dao.mapper.GroupMapper;
import com.btea.shortlink.admin.remote.ShortLinkRemoteService;
import com.btea.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.btea.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.btea.shortlink.admin.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 11:13
 * @Description: URL 回收站接口层实现类
 */
@Service
@RequiredArgsConstructor
public class RecycleBinServiceImpl implements RecycleBinService {

    private final GroupMapper groupMapper;

    /**
     * 后续重构为 SpringCloud Feign 调用
     */
    private final ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {
    };

    @Override
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getDelFlag, 0);
        List<GroupDO> groupDOList = groupMapper.selectList(queryWrapper);
        if(CollUtil.isEmpty(groupDOList)){
            throw new ServiceException("用户无分组信息");
        }
        return shortLinkRemoteService.pageRecycleBinShortLink(requestParam);
    }
}
