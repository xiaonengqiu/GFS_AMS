package com.gfs.ams.entity.admin;

import java.io.Serializable;

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
public class SysRoleMenuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    /**
     * 设置：
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取：角色ID
     * @return Long
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置：菜单ID
     * @param menuId 菜单ID
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取：菜单ID
     * @return Long
     */
    public Long getMenuId() {
        return menuId;
    }

    @Override
    public String toString() {
        return "SysRoleMenuEntity{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}

