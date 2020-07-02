/*
 Navicat Premium Data Transfer

 Source Server         : LocalHost
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : utf-8

 Date: 07/01/2018 21:28:02 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `student.html`
-- ----------------------------
DROP TABLE IF EXISTS `Login`;
CREATE TABLE `Login` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `passwd` varchar(100) CHARACTER SET utf8  COMMENT '密码',

  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='登陆';

DROP TABLE IF EXISTS 'Commodity';
CREATE TABLE 'Commodity'(
    'cid' int(11) NOT NULL AUTO_INCREMENT,
    'name' varchar(100) CHARACTER SET utf8,
    'price' double(11,2) NOT NULL ,
    'quantity' int(11) DEFAULT 0,
    'discount' double(1,2) DEFAULT 1,

    primary key ('cid')
)ENGINE=InnoDB AUTO_INCREMENT=1 Comment '商品';

-- ----------------------------
--  Records of `student.html`
-- ----------------------------
BEGIN;
INSERT INTO `Login` VALUES ('18080123', '123456'), ('21233','123456');
INSERT INTO 'Commodity' VALUES ('8848','钛合金手机',8848,50,1),('4399','SWITCH',1999,20,1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
