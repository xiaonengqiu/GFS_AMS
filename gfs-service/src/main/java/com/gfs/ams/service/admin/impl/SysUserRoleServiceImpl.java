package com.gfs.ams.service.admin.impl;

import com.gfs.ams.dao.admin.SysUserRoleDao;
import com.gfs.ams.service.admin.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {

    private SysUserRoleDao sysUserRoleDao;

    public SysUserRoleDao getSysUserRoleDao() {
        return sysUserRoleDao;
    }

    @Autowired
    public void setSysUserRoleDao(SysUserRoleDao sysUserRoleDao) {
        this.sysUserRoleDao = sysUserRoleDao;
    }

    /**
     * 根据用户ID和角色ID列表，持久化用户与角色对应关系
     */
    @Override
    public void saveOrUpdate(Long userId, List<Long> roleIdList) {
        if (roleIdList.size() == 0) {
            return;
        }

        // 先删除用户与角色关系
        sysUserRoleDao.delete(userId);

        // 保存用户与角色关系
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);
        map.put("roleIdList", roleIdList);
        sysUserRoleDao.save(map);
    }

    /**
     * 根据用户ID，获取角色ID列表
     */
    @Override
    public List<Long> queryRoleIdList(Long userId) {
        return sysUserRoleDao.queryRoleIdList(userId);
    }

    /**
     * 根据用户ID，删除对应关系
     */
    @Override
    public void delete(Long userId) {
        sysUserRoleDao.delete(userId);
    }
}
