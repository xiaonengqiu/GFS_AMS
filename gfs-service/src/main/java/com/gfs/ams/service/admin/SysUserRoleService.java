package com.gfs.ams.service.admin;

import java.util.List;

/**
 * 简   述：用户-角色
 * 功   能：用于用户与角色建立关系
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysUserRoleService {
    /**
     * 根据用户ID和角色ID列表，持久化用户与角色对应关系
     */
    void saveOrUpdate(Long userId, List<Long> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    /**
     * 根据用户ID，删除对应关系
     */
    void delete(Long userId);
}
