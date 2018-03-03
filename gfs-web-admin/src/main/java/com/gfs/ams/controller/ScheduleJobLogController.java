package com.gfs.ams.controller;

import com.gfs.ams.common.PageUtils;
import com.gfs.ams.common.R;
import com.gfs.ams.entity.admin.ScheduleJobLogEntity;
import com.gfs.ams.service.admin.ScheduleJobLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 简   述：定时任务日志
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
@RestController
@RequestMapping("/sys/scheduleLog")
public class ScheduleJobLogController {
    @Autowired
    private ScheduleJobLogService scheduleJobLogService;

    /**
     * 定时任务日志列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schedule:log")
    public R list(Integer page, Integer limit, Integer jobId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("jobId", jobId);
        map.put("offset", (page - 1) * limit);
        map.put("limit", limit);

        // 查询列表数据
        List<ScheduleJobLogEntity> jobList = scheduleJobLogService.queryList(map);
        int total = scheduleJobLogService.queryTotal(map);

        PageUtils pageUtil = new PageUtils(jobList, total, limit, page);

        return R.ok().put("page", pageUtil);
    }

    /**
     * 定时任务日志信息
     */
    @RequestMapping("/info/{logId}")
    public R info(@PathVariable("logId") Long logId) {
        ScheduleJobLogEntity log = scheduleJobLogService.queryObject(logId);

        return R.ok().put("log", log);
    }
}

