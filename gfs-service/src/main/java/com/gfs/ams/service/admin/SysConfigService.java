package com.gfs.ams.service.admin;

import com.gfs.ams.entity.admin.SysConfigEntity;

import java.util.List;
import java.util.Map;

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
public interface SysConfigService {
    /**
     * 保存配置信息
     */
    void save(SysConfigEntity config);

    /**
     * 更新配置信息
     */
    void update(SysConfigEntity config);

    /**
     * 根据key，更新value
     */
    void updateValueByKey(String key, String value);

    /**
     * 删除配置信息
     */
    void deleteBatch(Long[] ids);

    /**
     * 获取List列表
     */
    List<SysConfigEntity> queryList(Map<String, Object> map);

    /**
     * 获取总记录数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 根据ID，获取系统配置信息
     *
     * @param id 配置信息ID
     * @return
     */
    SysConfigEntity queryObject(Long id);

    /**
     * 根据key，获取配置的value值
     *
     * @param key          key
     * @param defaultValue 缺省值
     */
    String getValue(String key, String defaultValue);

    /**
     * 根据key，获取value的Object对象
     *
     * @param key   key
     * @param clazz Object对象
     */
    <T> T getConfigObject(String key, Class<T> clazz) throws Exception;
}
