/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50130
Source Host           : localhost:3306
Source Database       : gfs_ams

Target Server Type    : MYSQL
Target Server Version : 50130
File Encoding         : 65001

Date: 2018-03-03 16:50:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('47', '3', '1');
INSERT INTO `sys_role_menu` VALUES ('48', '3', '2');
INSERT INTO `sys_role_menu` VALUES ('49', '3', '15');
INSERT INTO `sys_role_menu` VALUES ('50', '3', '3');
INSERT INTO `sys_role_menu` VALUES ('51', '3', '19');
INSERT INTO `sys_role_menu` VALUES ('52', '3', '4');
INSERT INTO `sys_role_menu` VALUES ('53', '3', '23');
INSERT INTO `sys_role_menu` VALUES ('54', '3', '5');
INSERT INTO `sys_role_menu` VALUES ('55', '3', '6');
INSERT INTO `sys_role_menu` VALUES ('56', '3', '7');
INSERT INTO `sys_role_menu` VALUES ('57', '3', '8');
INSERT INTO `sys_role_menu` VALUES ('58', '3', '27');
INSERT INTO `sys_role_menu` VALUES ('59', '3', '28');
INSERT INTO `sys_role_menu` VALUES ('60', '4', '1');
INSERT INTO `sys_role_menu` VALUES ('61', '4', '2');
INSERT INTO `sys_role_menu` VALUES ('62', '4', '15');
INSERT INTO `sys_role_menu` VALUES ('63', '4', '16');
INSERT INTO `sys_role_menu` VALUES ('64', '4', '17');
INSERT INTO `sys_role_menu` VALUES ('65', '4', '3');
INSERT INTO `sys_role_menu` VALUES ('66', '4', '19');
INSERT INTO `sys_role_menu` VALUES ('67', '4', '20');
INSERT INTO `sys_role_menu` VALUES ('68', '4', '21');
INSERT INTO `sys_role_menu` VALUES ('69', '4', '4');
INSERT INTO `sys_role_menu` VALUES ('70', '4', '23');
INSERT INTO `sys_role_menu` VALUES ('71', '4', '24');
INSERT INTO `sys_role_menu` VALUES ('72', '4', '25');
INSERT INTO `sys_role_menu` VALUES ('73', '4', '5');
INSERT INTO `sys_role_menu` VALUES ('74', '4', '6');
INSERT INTO `sys_role_menu` VALUES ('75', '4', '7');
INSERT INTO `sys_role_menu` VALUES ('76', '4', '8');
INSERT INTO `sys_role_menu` VALUES ('77', '4', '9');
INSERT INTO `sys_role_menu` VALUES ('78', '4', '11');
INSERT INTO `sys_role_menu` VALUES ('79', '4', '12');
INSERT INTO `sys_role_menu` VALUES ('80', '4', '13');
INSERT INTO `sys_role_menu` VALUES ('81', '4', '14');
INSERT INTO `sys_role_menu` VALUES ('82', '4', '27');
INSERT INTO `sys_role_menu` VALUES ('83', '4', '28');
INSERT INTO `sys_role_menu` VALUES ('84', '1', '1');
INSERT INTO `sys_role_menu` VALUES ('85', '1', '2');
INSERT INTO `sys_role_menu` VALUES ('86', '1', '15');
INSERT INTO `sys_role_menu` VALUES ('87', '1', '16');
INSERT INTO `sys_role_menu` VALUES ('88', '1', '17');
INSERT INTO `sys_role_menu` VALUES ('89', '1', '18');
INSERT INTO `sys_role_menu` VALUES ('90', '1', '3');
INSERT INTO `sys_role_menu` VALUES ('91', '1', '19');
INSERT INTO `sys_role_menu` VALUES ('92', '1', '20');
INSERT INTO `sys_role_menu` VALUES ('93', '1', '21');
INSERT INTO `sys_role_menu` VALUES ('94', '1', '22');
INSERT INTO `sys_role_menu` VALUES ('95', '1', '4');
INSERT INTO `sys_role_menu` VALUES ('96', '1', '23');
INSERT INTO `sys_role_menu` VALUES ('97', '1', '24');
INSERT INTO `sys_role_menu` VALUES ('98', '1', '25');
INSERT INTO `sys_role_menu` VALUES ('99', '1', '26');
INSERT INTO `sys_role_menu` VALUES ('100', '1', '5');
INSERT INTO `sys_role_menu` VALUES ('101', '1', '6');
INSERT INTO `sys_role_menu` VALUES ('102', '1', '7');
INSERT INTO `sys_role_menu` VALUES ('103', '1', '8');
INSERT INTO `sys_role_menu` VALUES ('104', '1', '9');
INSERT INTO `sys_role_menu` VALUES ('105', '1', '10');
INSERT INTO `sys_role_menu` VALUES ('106', '1', '11');
INSERT INTO `sys_role_menu` VALUES ('107', '1', '12');
INSERT INTO `sys_role_menu` VALUES ('108', '1', '13');
INSERT INTO `sys_role_menu` VALUES ('109', '1', '14');
INSERT INTO `sys_role_menu` VALUES ('110', '1', '27');
INSERT INTO `sys_role_menu` VALUES ('111', '1', '28');
