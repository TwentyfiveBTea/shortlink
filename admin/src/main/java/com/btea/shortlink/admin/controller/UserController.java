package com.btea.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.btea.shortlink.admin.common.convention.result.Result;
import com.btea.shortlink.admin.common.convention.result.Results;
import com.btea.shortlink.admin.dto.req.UserLoginReqDTO;
import com.btea.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.btea.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.btea.shortlink.admin.dto.resp.UserActualRespDTO;
import com.btea.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.btea.shortlink.admin.dto.resp.UserRespDTO;
import com.btea.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/02/04 15:31
 * @Description: 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/short-link/admin/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    @GetMapping("/api/short-link/admin/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hashUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }

    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    @PutMapping("/api/short-link/admin/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }

    @PostMapping("/api/short-link/admin/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    @GetMapping("/api/short-link/admin/v1/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }
}