package com.gfs.ams.service.admin.impl;

import com.gfs.ams.common.Constant;
import com.gfs.ams.dao.admin.ScheduleJobDao;
import com.gfs.ams.entity.admin.ScheduleJobEntity;
import com.gfs.ams.service.admin.ScheduleJobService;
import com.gfs.ams.service.admin.impl.schedule.ScheduleUtils;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 简   述：
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
@Service("scheduleJobService")
public class ScheduleJobServiceImpl implements ScheduleJobService {
    @Autowired
    private Scheduler scheduler;
    private ScheduleJobDao schedulerJobDao;

    public ScheduleJobDao getSchedulerJobDao() {
        return schedulerJobDao;
    }
    @Autowired
    public void setSchedulerJobDao(ScheduleJobDao schedulerJobDao) {
        this.schedulerJobDao = schedulerJobDao;
    }

    /**
     * 项目启动时，初始化定时器
     */
    @PostConstruct
    public void init() {
        List<ScheduleJobEntity> scheduleJobList = schedulerJobDao.queryList(new HashMap<String, Object>());
        for (ScheduleJobEntity scheduleJob : scheduleJobList) {
            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
            // 如果不存在，则创建
            if (cronTrigger == null) {
                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
            } else {
                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
            }
        }
    }

    /**
     * 根据ID，查询定时任务
     */
    @Override
    public ScheduleJobEntity queryObject(Long jobId) {
        return schedulerJobDao.queryObject(jobId);
    }

    /**
     * 查询定时任务列表
     */
    @Override
    public List<ScheduleJobEntity> queryList(Map<String, Object> map) {
        return schedulerJobDao.queryList(map);
    }

    /**
     * 查询总数
     */
    @Override
    public int queryTotal(Map<String, Object> map) {
        return schedulerJobDao.queryTotal(map);
    }

    /**
     * 保存定时任务
     */
    @Override
    @Transactional
    public void save(ScheduleJobEntity scheduleJob) {
        scheduleJob.setCreateTime(new Date());
        scheduleJob.setStatus(Constant.ScheduleStatus.NORMAL.getValue());
        schedulerJobDao.save(scheduleJob);

        ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
    }

    /**
     * 更新定时任务
     */
    @Override
    @Transactional
    public void update(ScheduleJobEntity scheduleJob) {
        ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);

        schedulerJobDao.update(scheduleJob);
    }

    /**
     * 批量删除定时任务
     */
    @Override
    @Transactional
    public void deleteBatch(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.deleteScheduleJob(scheduler, jobId);
        }

        // 删除数据
        schedulerJobDao.deleteBatch(jobIds);
    }

    /**
     * 批量更新定时任务状态
     */
    @Override
    public int updateBatch(Long[] jobIds, int status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", jobIds);
        map.put("status", status);
        return schedulerJobDao.updateBatch(map);
    }

    /**
     * 立即执行
     */
    @Override
    @Transactional
    public void run(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.run(scheduler, queryObject(jobId));
        }
    }

    /**
     * 暂停运行
     */
    @Override
    @Transactional
    public void pause(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.pauseJob(scheduler, jobId);
        }

        updateBatch(jobIds, Constant.ScheduleStatus.PAUSE.getValue());
    }

    /**
     * 恢复运行
     */
    @Override
    @Transactional
    public void resume(Long[] jobIds) {
        for (Long jobId : jobIds) {
            ScheduleUtils.resumeJob(scheduler, jobId);
        }

        updateBatch(jobIds, Constant.ScheduleStatus.NORMAL.getValue());
    }
}

