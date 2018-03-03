package com.gfs.ams.dao.admin;

import com.gfs.ams.dao.BaseDao;
import com.gfs.ams.entity.admin.SysRoleMenuEntity;

import java.util.List;

/**
 * 简   述：角色-菜单
 * 功   能：用于角色与菜单建立关系
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);
}
