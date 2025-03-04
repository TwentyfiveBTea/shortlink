package com.btea.shortlink.project.controller;

import com.btea.shortlink.project.common.convention.result.Result;
import com.btea.shortlink.project.common.convention.result.Results;
import com.btea.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import com.btea.shortlink.project.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/4 10:24
 * @Description: 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private RecycleBinService recycleBinService;

    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }
}
