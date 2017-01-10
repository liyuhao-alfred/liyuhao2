/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : liyuhao

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2017-01-08 11:04:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT '',
  `password` varchar(20) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'liyuhao', 'liyuhao');
INSERT INTO `admin` VALUES ('2', '2', '2');
INSERT INTO `admin` VALUES ('3', '3', '3');
INSERT INTO `admin` VALUES ('4', 'test', 'test');
INSERT INTO `admin` VALUES ('6', '18814127430', '18814127430');
INSERT INTO `admin` VALUES ('7', '1881412743', '1881412743');
