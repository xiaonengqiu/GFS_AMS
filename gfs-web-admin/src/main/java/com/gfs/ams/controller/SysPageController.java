package com.gfs.ams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 简   述：系统页面视图
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
@Controller
public class SysPageController {
    @RequestMapping("sys/{url}.html")
    public String page(@PathVariable("url") String url) {
        return "sys/" + url + ".html";
    }
}

