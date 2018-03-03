package com.gfs.ams.dao.admin;

import com.gfs.ams.dao.BaseDao;
import com.gfs.ams.entity.admin.ScheduleJobEntity;

import java.util.Map;

/**
 * 简   述：定时任务
 * 功   能：用于创建、修改、更新定时任务
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}
