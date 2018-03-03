package com.gfs.ams.service.admin.impl;

import com.gfs.ams.common.Constant;
import com.gfs.ams.dao.admin.SysMenuDao;
import com.gfs.ams.entity.admin.SysMenuEntity;
import com.gfs.ams.service.admin.SysMenuService;
import com.gfs.ams.service.admin.SysRoleMenuService;
import com.gfs.ams.service.admin.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    private SysMenuDao sysMenuDao;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    public SysMenuDao getSysMenuDao() {
        return sysMenuDao;
    }
    @Autowired
    public void setSysMenuDao(SysMenuDao sysMenuDao) {
        this.sysMenuDao = sysMenuDao;
    }

    /**
     * 根据父菜单，查询子菜单
     * @param parentId 父菜单ID
     * @param menuIdList 用户菜单ID
     */
    @Override
    public List<SysMenuEntity> queryListParentId(Long parentId, List<Long> menuIdList) {
        List<SysMenuEntity> menuList = sysMenuDao.queryListParentId(parentId);
        if (menuIdList == null) {
            return menuList;
        }

        List<SysMenuEntity> userMenuList = new ArrayList<SysMenuEntity>();
        for (SysMenuEntity menu : menuList) {
            if (menuIdList.contains(menu.getMenuId())) {
                userMenuList.add(menu);
            }
        }
        return userMenuList;
    }

    /**
     * 获取不包含按钮的菜单列表
     */
    @Override
    public List<SysMenuEntity> queryNotButtonList() {
        return sysMenuDao.queryNotButtonList();
    }

    /**
     * 获取用户菜单列表
     */
    @Override
    public List<SysMenuEntity> getUserMenuList(Long userId) {
        // 系统管理员，拥有最高权限
        if (userId == 1) {
            return getAllMenuList(null);
        }

        // 用户菜单列表
        List<Long> menuIdList = sysUserService.queryAllMenuId(userId);
        return getAllMenuList(menuIdList);
    }

    /**
     * 查询菜单
     */
    @Override
    public SysMenuEntity queryObject(Long menuId) {
        return sysMenuDao.queryObject(menuId);
    }

    /**
     * 查询菜单列表
     */
    @Override
    public List<SysMenuEntity> queryList(Map<String, Object> map) {
        return sysMenuDao.queryList(map);
    }

    /**
     * 查询总数
     */
    @Override
    public int queryTotal(Map<String, Object> map) {
        return sysMenuDao.queryTotal(map);
    }

    /**
     * 保存菜单
     */
    @Override
    public void save(SysMenuEntity menu) {
        sysMenuDao.save(menu);
    }

    /**
     * 修改
     */
    @Override
    public void update(SysMenuEntity menu) {
        sysMenuDao.update(menu);
    }

    /**
     * 删除
     */
    @Override
    @Transactional
    public void deleteBatch(Long[] menuIds) {
        sysMenuDao.deleteBatch(menuIds);
    }

    /**
     * 获取所有菜单列表
     */
    private List<SysMenuEntity> getAllMenuList(List<Long> menuIdList) {
        // 查询根菜单列表
        List<SysMenuEntity> menuList = queryListParentId(0L, menuIdList);
        // 递归获取子菜单
        getMenuTreeList(menuList, menuIdList);

        return menuList;
    }

    /**
     * 递归
     */
    private List<SysMenuEntity> getMenuTreeList(List<SysMenuEntity> menuList, List<Long> menuIdList) {
        List<SysMenuEntity> subMenuList = new ArrayList<SysMenuEntity>();

        for (SysMenuEntity entity : menuList) {
            if (entity.getType() == Constant.MenuType.CATALOG.getValue()) {// 目录
                entity.setList(getMenuTreeList(queryListParentId(entity.getMenuId(), menuIdList), menuIdList));
            }
            subMenuList.add(entity);
        }

        return subMenuList;
    }
}
