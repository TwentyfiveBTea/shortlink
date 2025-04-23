package com.btea.shortlink.project.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.btea.shortlink.project.common.convention.result.Result;
import com.btea.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.btea.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/4/23 10:40
 * @Description: 自定义流控策略
 */
public class CustomBlockHandler {

    public static Result<ShortLinkCreateRespDTO> createShortLinkBlockHandlerMethod(ShortLinkCreateReqDTO requestParam, BlockException exception) {
        return new Result<ShortLinkCreateRespDTO>().setCode("B100000").setMessage("当前访问网站人数过多，请稍后再试...");
    }
}