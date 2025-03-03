package com.btea.shortlink.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: TwentyFiveBTea
 * @Date: 2025/3/3 19:34
 * @Description: 短链接不存在跳转控制器
 */
@Controller
public class ShortLinkNotFoundController {

    /**
     * 短链接不存在跳转页面
     */
    @RequestMapping("/page/notfound")
    public String notfound() {
        return "notfound";
    }
}
