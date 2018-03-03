package com.gfs.ams.service.admin.impl;

import com.gfs.ams.dao.admin.ScheduleJobLogDao;
import com.gfs.ams.entity.admin.ScheduleJobLogEntity;
import com.gfs.ams.service.admin.ScheduleJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 简   述：定时任务日志实现类
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
@Service("scheduleJobLogService")
public class ScheduleJobLogServiceImpl implements ScheduleJobLogService {
    private ScheduleJobLogDao scheduleJobLogDao;

    public ScheduleJobLogDao getScheduleJobLogDao() {
        return scheduleJobLogDao;
    }
    @Autowired
    public void setScheduleJobLogDao(ScheduleJobLogDao scheduleJobLogDao) {
        this.scheduleJobLogDao = scheduleJobLogDao;
    }

    /**
     * 根据ID，查询定时任务日志
     */
    @Override
    public ScheduleJobLogEntity queryObject(Long jobId) {
        return scheduleJobLogDao.queryObject(jobId);
    }

    /**
     * 查询定时任务日志列表
     */
    @Override
    public List<ScheduleJobLogEntity> queryList(Map<String, Object> map) {
        return scheduleJobLogDao.queryList(map);
    }

    /**
     * 查询总数
     */
    @Override
    public int queryTotal(Map<String, Object> map) {
        return scheduleJobLogDao.queryTotal(map);
    }

    /**
     * 保存定时任务日志
     */
    @Override
    public void save(ScheduleJobLogEntity log) {
        scheduleJobLogDao.save(log);
    }
}