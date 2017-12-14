/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-11-21 09:14:22
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `isExpired`  char(1)  DEFAULT NULL,
  `isEnabled`   char(1)  DEFAULT NULL,
  `isLocked`   char(1)  DEFAULT NULL,
  `isCredentialsExpired`   char(1)  DEFAULT NULL,
  `rec_creator` varchar(64) DEFAULT NULL,
  `rec_create_time` varchar(64) DEFAULT NULL,
  `rec_revisor` varchar(64) DEFAULT NULL,
  `rec_revisor_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



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

