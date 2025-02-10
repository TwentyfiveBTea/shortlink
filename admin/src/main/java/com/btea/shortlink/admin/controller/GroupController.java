package com.btea.shortlink.admin.controller;

import com.btea.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/10 17:52
 * @Description: 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


}
