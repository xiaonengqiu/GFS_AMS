package com.gfs.ams.service.admin;

import java.util.List;

/**
 * 简   述：角色-菜单
 * 功   能：角色-菜单管理
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysRoleMenuService {
    /**
     * 根据角色ID和菜单ID列表，持久化角色与菜单对应关系
     * @param roleId 角色ID
     * @param menuIdList 菜单ID列表
     */
    void saveOrUpdate(Long roleId, List<Long> menuIdList);

    /**
     * 根据角色ID，获取菜单ID列表
     * @param roleId 角色ID
     * @return
     */
    List<Long> queryMenuIdList(Long roleId);
}
