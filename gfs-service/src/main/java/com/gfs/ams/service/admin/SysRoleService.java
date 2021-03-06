package com.gfs.ams.service.admin;

import com.gfs.ams.entity.admin.SysRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 简   述：角色
 * 功   能：角色管理
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysRoleService {
    /**
     * 根据角色ID，查询角色
     */
    SysRoleEntity queryObject(Long roleId);

    /**
     * 查询所有角色
     */
    List<SysRoleEntity> queryList(Map<String, Object> map);

    /**
     * 统计所有角色总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 持久化角色
     */
    void save(SysRoleEntity role);

    /**
     * 更新角色
     */
    void update(SysRoleEntity role);

    /**
     * 批量删除角色
     */
    void deleteBatch(Long[] roleIds);
}
