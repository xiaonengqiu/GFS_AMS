package com.gfs.ams.dao.admin;

import com.gfs.ams.dao.BaseDao;
import com.gfs.ams.entity.admin.SysUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 简   述：系统用户
 * 功   能：
 * 作   者：xiaonengqiu
 * 邮   箱：xiaonengqiu@foxmail.com
 * 创建时间：2018/3/3
 * 修 改 人：
 * 修改原因：
 * 修改时间：
 */
public interface SysUserDao extends BaseDao<SysUserEntity> {
    /**
     * 查询用户的所有权限
     * @param userId 用户ID
     */
    List<String> queryAllPerms(Long userId);

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(Long userId);

    /**
     * 根据用户名，查询系统用户
     */
    SysUserEntity queryByUserName(String username);

    /**
     * 修改密码
     */
    int updatePassword(Map<String, Object> map);
}
