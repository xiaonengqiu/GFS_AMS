package com.gfs.ams.service.admin.impl;

import com.gfs.ams.dao.admin.SysRoleDao;
import com.gfs.ams.entity.admin.SysRoleEntity;
import com.gfs.ams.service.admin.SysRoleMenuService;
import com.gfs.ams.service.admin.SysRoleService;
import com.gfs.ams.service.admin.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    private SysRoleDao sysRoleDao;
    @Autowired
    private SysRoleMenuService sysRoleMenuService;
    @Autowired
    private SysUserRoleService sysUserRoleService;

    public SysRoleDao getSysRoleDao() {
        return sysRoleDao;
    }
    @Autowired
    public void setSysRoleDao(SysRoleDao sysRoleDao) {
        this.sysRoleDao = sysRoleDao;
    }

    /**
     * 根据角色ID，查询角色
     */
    @Override
    public SysRoleEntity queryObject(Long roleId) {
        return sysRoleDao.queryObject(roleId);
    }

    /**
     * 查询所有角色
     */
    @Override
    public List<SysRoleEntity> queryList(Map<String, Object> map) {
        return sysRoleDao.queryList(map);
    }

    /**
     * 统计所有角色总数
     */
    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysRoleDao.queryTotal(map);
    }

    /**
     * 持久化角色
     */
    @Override
    @Transactional
    public void save(SysRoleEntity role) {
        role.setCreateTime(new Date());
        sysRoleDao.save(role);

        // 保存角色与菜单关系
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
    }

    /**
     * 更新角色
     */
    @Override
    @Transactional
    public void update(SysRoleEntity role) {
        sysRoleDao.update(role);

        // 更新角色与菜单关系
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
    }

    /**
     * 批量删除角色
     */
    @Override
    @Transactional
    public void deleteBatch(Long[] roleIds) {
        sysRoleDao.deleteBatch(roleIds);
    }
}
