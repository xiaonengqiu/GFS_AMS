package com.gfs.ams.service.admin;

import java.util.List;
import java.util.Map;

/**
 * 简   述：代码生成器
 * 功   能：代码生成管理
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysGeneratorService {
    /**
     * 查询所有表
     */
    List<Map<String, Object>> queryList(Map<String, Object> map);

    /**
     * 统计表的总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 根据表名，查询表
     */
    Map<String, String> queryTable(String tableName);

    /**
     * 根据表名，查询列的列表
     */
    List<Map<String, String>> queryColumns(String tableName);

    /**
     * 生成代码
     */
    byte[] generatorCode(String[] tableNames);
}
