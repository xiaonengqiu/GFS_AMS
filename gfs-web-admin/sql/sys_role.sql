/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : gfs_ams

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2018-03-03 16:50:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '超级管理员', '超级管理员，拥有所有权限', '2017-01-19 15:44:09');
INSERT INTO `sys_role` VALUES ('3', '普通用户', '仅有查看权限', '2017-06-24 12:31:08');
INSERT INTO `sys_role` VALUES ('4', '一级管理员', '允许查看、修改、新增权限', '2017-06-24 14:54:50');
