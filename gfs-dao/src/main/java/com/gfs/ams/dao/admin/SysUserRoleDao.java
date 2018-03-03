package com.gfs.ams.dao.admin;

import com.gfs.ams.dao.BaseDao;
import com.gfs.ams.entity.admin.SysUserRoleEntity;

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
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);
}
