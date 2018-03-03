package com.gfs.ams.service;

import java.util.List;
import java.util.Map;

/**
 * 简   述：公共基础Service
 * 功   能：可继承，可作为参照模板
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface BaseService<T> {
    /**
     * 保存实体对象
     */
    void save(T t);

    /**
     * 保存Map对象
     */
    void save(Map<String, Object> map);

    /**
     * 批量保存对象列表
     */
    void saveBatch(List<T> list);

    /**
     * 更新实体对象
     */
    int update(T t);

    /**
     * 更新Map对象
     */
    int update(Map<String, Object> map);

    /**
     * 根据对象ID删除对象
     */
    int delete(Object id);

    /**
     * 根据Map删除对象
     */
    int delete(Map<String, Object> map);

    /**
     * 根据对象ID数组批量删除对象
     */
    int deleteBatch(Object[] id);

    /**
     * 根据对象ID查询对象
     */
    T queryObject(Object id);

    /**
     * 根据Map查询对象列表
     */
    List<T> queryList(Map<String, Object> map);

    /**
     * 根据对象ID查询对象列表
     */
    List<T> queryList(Object id);

    /**
     * 根据Map查询对象总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 查询对象总数
     */
    int queryTotal();
}
