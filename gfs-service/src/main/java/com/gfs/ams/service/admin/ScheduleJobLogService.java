package com.gfs.ams.service.admin;

import com.gfs.ams.entity.admin.ScheduleJobLogEntity;

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
public interface ScheduleJobLogService {
    /**
     * 根据ID，查询定时任务日志
     */
    ScheduleJobLogEntity queryObject(Long jobId);

    /**
     * 查询定时任务日志列表
     */
    List<ScheduleJobLogEntity> queryList(Map<String, Object> map);

    /**
     * 查询总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 保存定时任务日志
     */
    void save(ScheduleJobLogEntity log);
}
