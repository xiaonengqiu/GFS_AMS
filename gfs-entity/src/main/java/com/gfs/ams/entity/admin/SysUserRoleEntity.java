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
public class SysUserRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

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
     * 设置：用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户ID
     * @return Long
     */
    public Long getUserId() {
        return userId;
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

    @Override
    public String toString() {
        return "SysUserRoleEntity{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
