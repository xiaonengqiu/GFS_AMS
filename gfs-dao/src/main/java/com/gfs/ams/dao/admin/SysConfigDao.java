package com.gfs.ams.dao.admin;

import com.gfs.ams.dao.BaseDao;
import com.gfs.ams.entity.admin.SysConfigEntity;
import org.apache.ibatis.annotations.Param;

/**
 * 简   述：系统配置信息
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysConfigDao extends BaseDao<SysConfigEntity> {
    /**
     * 根据key，查询value
     */
    String queryByKey(String paramKey);

    /**
     * 根据key，更新value
     */
    int updateValueByKey(@Param("key") String key, @Param("value") String value);
}