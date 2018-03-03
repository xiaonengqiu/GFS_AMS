package com.gfs.ams.service.admin.impl;

import com.gfs.ams.common.generator.GenUtils;
import com.gfs.ams.dao.admin.SysGeneratorDao;
import com.gfs.ams.service.admin.SysGeneratorService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

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
@Service("sysGeneratorService")
public class SysGeneratorServiceImpl implements SysGeneratorService {
    private SysGeneratorDao sysGeneratorDao;

    public SysGeneratorDao getSysGeneratorDao() {
        return sysGeneratorDao;
    }

    @Autowired
    public void setSysGeneratorDao(SysGeneratorDao sysGeneratorDao) {
        this.sysGeneratorDao = sysGeneratorDao;
    }

    /**
     * 查询所有表
     */
    @Override
    public List<Map<String, Object>> queryList(Map<String, Object> map) {
        return sysGeneratorDao.queryList(map);
    }

    /**
     * 统计表的总数
     */
    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysGeneratorDao.queryTotal(map);
    }

    /**
     * 根据表名，查询表
     */
    @Override
    public Map<String, String> queryTable(String tableName) {
        return sysGeneratorDao.queryTable(tableName);
    }

    /**
     * 根据表名，查询列的列表
     */
    @Override
    public List<Map<String, String>> queryColumns(String tableName) {
        return sysGeneratorDao.queryColumns(tableName);
    }

    /**
     * 生成代码
     */
    @Override
    public byte[] generatorCode(String[] tableNames) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        for (String tableName : tableNames) {
            // 查询表信息
            Map<String, String> table = queryTable(tableName);
            // 查询列信息
            List<Map<String, String>> columns = queryColumns(tableName);
            // 生成代码
            GenUtils.generatorCode(table, columns, zip);
        }
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }
}

