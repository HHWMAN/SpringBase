/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-04-09 16:33:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `authority_id` varchar(64) NOT NULL,
  `authority_sign` varchar(64) DEFAULT NULL,
  `authority_name` varchar(64) DEFAULT NULL,
  `authority_description` varchar(64) DEFAULT NULL,
  `authority_remind` varchar(64) DEFAULT NULL,
  `isEnabled` char(1) DEFAULT NULL,
  `isSys` varchar(64) DEFAULT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`authority_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('1', 'OP_ADMIN', 'OP_ADMIN', '管理员权限', 'OP_ADMIN', 'Y', 'Y', null, null, null, null);

-- ----------------------------
-- Table structure for authority_resource
-- ----------------------------
DROP TABLE IF EXISTS `authority_resource`;
CREATE TABLE `authority_resource` (
  `authority_resource_id` varchar(64) NOT NULL,
  `authority_id` varchar(64) NOT NULL,
  `resource_id` varchar(64) NOT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`authority_resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority_resource
-- ----------------------------

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resource_id` varchar(64) NOT NULL,
  `resource_name` varchar(64) DEFAULT NULL,
  `resource_type` varchar(64) DEFAULT NULL,
  `resource_desc` varchar(64) DEFAULT NULL,
  `resource_path` varchar(64) DEFAULT NULL,
  `isEnabled` char(1) DEFAULT NULL,
  `isSys` varchar(64) DEFAULT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` varchar(64) NOT NULL,
  `role_name` varchar(64) DEFAULT NULL,
  `role_description` varchar(64) DEFAULT NULL,
  `role_authority` varchar(64) DEFAULT NULL,
  `isEnabled` char(1) DEFAULT NULL,
  `isSys` varchar(64) DEFAULT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN', '管理员', '1', 'Y', 'Y', null, null, null, null);

-- ----------------------------
-- Table structure for role_authority
-- ----------------------------
DROP TABLE IF EXISTS `role_authority`;
CREATE TABLE `role_authority` (
  `role_authority_id` varchar(64) NOT NULL,
  `role_id` varchar(64) NOT NULL,
  `rauthority_id` varchar(64) NOT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`role_authority_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_authority
-- ----------------------------
INSERT INTO `role_authority` VALUES ('1', '1', '1', null, null, null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(64) NOT NULL,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `age` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `isExpired` char(1) DEFAULT NULL,
  `isEnabled` char(1) DEFAULT NULL,
  `isLocked` char(1) DEFAULT NULL,
  `isCredentialsExpired` char(1) DEFAULT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zx', 'zx', 'm', '18', null, 'N', 'Y', 'N', 'N', null, null, null, null);
INSERT INTO `user` VALUES ('2', 'zx2', 'zx2', null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_role_id` varchar(64) NOT NULL,
  `user_id` varchar(64) NOT NULL,
  `role_id` varchar(64) NOT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1', '1', null, null, null, null);
