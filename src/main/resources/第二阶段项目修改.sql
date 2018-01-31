/*
Navicat MySQL Data Transfer

Source Server         : XuSihan
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : hzguigu

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-01-30 23:22:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `anthorty_info`
-- ----------------------------
DROP TABLE IF EXISTS `anthorty_info`;
CREATE TABLE `anthorty_info` (
  `anthorty_id` int(11) NOT NULL auto_increment,
  `anthorty_pid` int(11) default NULL,
  `anthorty_nane` varchar(100) default NULL,
  `anthorty_desc` varchar(1000) default NULL,
  `anthorty_url` varchar(1000) default NULL,
  PRIMARY KEY  (`anthorty_id`),
  KEY `FK_Reference_2` (`anthorty_pid`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`anthorty_pid`) REFERENCES `anthorty_info` (`anthorty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of anthorty_info
-- ----------------------------

-- ----------------------------
-- Table structure for `attendance_info`
-- ----------------------------
DROP TABLE IF EXISTS `attendance_info`;
CREATE TABLE `attendance_info` (
  `attendance_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) default NULL,
  `attendance_desc` varchar(100) default NULL,
  `attendance_state` varchar(10) default NULL,
  `attendance_time` datetime default NULL,
  `attendance_remark` varchar(2000) default NULL,
  PRIMARY KEY  (`attendance_id`),
  KEY `FK_Reference_22` (`student_id`),
  CONSTRAINT `FK_Reference_22` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance_info
-- ----------------------------

-- ----------------------------
-- Table structure for `audition_info`
-- ----------------------------
DROP TABLE IF EXISTS `audition_info`;
CREATE TABLE `audition_info` (
  `audition_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) default NULL,
  `audition_time` datetime default NULL,
  `audition_addr` varchar(300) default NULL,
  `audition_course` varchar(100) default NULL,
  `audition_desc` varchar(2000) default NULL,
  PRIMARY KEY  (`audition_id`),
  KEY `FK_Reference_10` (`student_id`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of audition_info
-- ----------------------------

-- ----------------------------
-- Table structure for `class_info`
-- ----------------------------
DROP TABLE IF EXISTS `class_info`;
CREATE TABLE `class_info` (
  `class_id` int(11) NOT NULL auto_increment,
  `discipline_id` int(11) default NULL,
  `syllabus_id` int(11) default NULL,
  `classroom_id` int(11) default NULL,
  `staff_id` int(11) default NULL,
  `class_name` varchar(100) default NULL,
  `class_number` int(11) default NULL,
  `class_start_time` datetime default NULL,
  `class_end_time` datetime default NULL,
  `class_isused` varchar(10) default NULL,
  `class_state` varchar(10) default NULL,
  `class_desc` varchar(2000) default NULL,
  PRIMARY KEY  (`class_id`),
  KEY `FK_Reference_17` (`discipline_id`),
  KEY `FK_Reference_18` (`syllabus_id`),
  KEY `FK_Reference_19` (`classroom_id`),
  KEY `FK_Reference_20` (`staff_id`),
  CONSTRAINT `FK_Reference_17` FOREIGN KEY (`discipline_id`) REFERENCES `discipline_info` (`discipline_id`),
  CONSTRAINT `FK_Reference_18` FOREIGN KEY (`syllabus_id`) REFERENCES `syllabus_info` (`syllabus_id`),
  CONSTRAINT `FK_Reference_19` FOREIGN KEY (`classroom_id`) REFERENCES `classroom_info` (`classroom_id`),
  CONSTRAINT `FK_Reference_20` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_info
-- ----------------------------

-- ----------------------------
-- Table structure for `class_transaction_info`
-- ----------------------------
DROP TABLE IF EXISTS `class_transaction_info`;
CREATE TABLE `class_transaction_info` (
  `class_transaction_id` int(11) NOT NULL auto_increment,
  `class_id` int(11) default NULL,
  `class_transaction_tile` varchar(100) default NULL,
  `class_transaction_content` varchar(2000) default NULL,
  `class_transaction_person` varchar(100) default NULL,
  `class_transaction_time` datetime default NULL,
  `class_transaction_remar` varchar(2000) default NULL,
  PRIMARY KEY  (`class_transaction_id`),
  KEY `FK_Reference_21` (`class_id`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`class_id`) REFERENCES `class_info` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_transaction_info
-- ----------------------------

-- ----------------------------
-- Table structure for `classroom_info`
-- ----------------------------
DROP TABLE IF EXISTS `classroom_info`;
CREATE TABLE `classroom_info` (
  `classroom_id` int(11) NOT NULL auto_increment,
  `classroom_name` varchar(100) default NULL,
  `classroom_max` int(11) default NULL,
  `classroom_info` varchar(1000) default NULL,
  `classroom_remark` varchar(2000) default NULL,
  `classroom_mark` varchar(10) default NULL,
  PRIMARY KEY  (`classroom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classroom_info
-- ----------------------------

-- ----------------------------
-- Table structure for `communication_info`
-- ----------------------------
DROP TABLE IF EXISTS `communication_info`;
CREATE TABLE `communication_info` (
  `communication_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) default NULL,
  `staff_id` int(11) default NULL,
  `communication_time` datetime default NULL,
  `communication_content` varchar(2000) default NULL,
  PRIMARY KEY  (`communication_id`),
  KEY `FK_Reference_12` (`student_id`),
  KEY `FK_Reference_13` (`staff_id`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of communication_info
-- ----------------------------

-- ----------------------------
-- Table structure for `data_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `data_dictionary`;
CREATE TABLE `data_dictionary` (
  `data_id` int(11) NOT NULL auto_increment,
  `data_content` varchar(100) default NULL,
  `data_type` varchar(100) default NULL,
  `data_desc` varchar(2000) default NULL,
  PRIMARY KEY  (`data_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of data_dictionary
-- ----------------------------

-- ----------------------------
-- Table structure for `discipline_info`
-- ----------------------------
DROP TABLE IF EXISTS `discipline_info`;
CREATE TABLE `discipline_info` (
  `discipline_id` int(11) NOT NULL auto_increment,
  `discipline_name` varchar(100) default NULL,
  `discipline_tuition` int(11) default NULL,
  `discipline_bring` int(11) default NULL,
  `discipline_desc` varchar(2000) default NULL,
  `discipline_isused` varchar(10) default NULL,
  PRIMARY KEY  (`discipline_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discipline_info
-- ----------------------------

-- ----------------------------
-- Table structure for `email_info`
-- ----------------------------
DROP TABLE IF EXISTS `email_info`;
CREATE TABLE `email_info` (
  `email_id` int(11) NOT NULL auto_increment,
  `staff_id` int(11) default NULL,
  `email_title` varchar(1000) default NULL,
  `email_content` varchar(2000) default NULL,
  `email_time` datetime default NULL,
  `email_man` varchar(100) default NULL,
  `email_addr` varchar(300) default NULL,
  `email_state` varchar(10) default NULL,
  PRIMARY KEY  (`email_id`),
  KEY `FK_Reference_7` (`staff_id`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of email_info
-- ----------------------------

-- ----------------------------
-- Table structure for `evaluation_info`
-- ----------------------------
DROP TABLE IF EXISTS `evaluation_info`;
CREATE TABLE `evaluation_info` (
  `evaluation_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `discipline_id` int(11) NOT NULL,
  `evaluation_tile` varchar(100) default NULL,
  `evaluation_content` varchar(2000) default NULL,
  `evaluation_time` datetime default NULL,
  PRIMARY KEY  (`evaluation_id`),
  KEY `FK_Reference_11` (`student_id`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluation_info
-- ----------------------------

-- ----------------------------
-- Table structure for `market_active`
-- ----------------------------
DROP TABLE IF EXISTS `market_active`;
CREATE TABLE `market_active` (
  `active_id` int(11) NOT NULL auto_increment,
  `staff_id` int(11) default NULL,
  `active_name` varchar(300) default NULL,
  `active_state` int(11) default NULL,
  `active_start` datetime default NULL,
  `active_end` datetime default NULL,
  `active_type` int(11) default NULL,
  `active_coste_estimate` double default NULL,
  `active_coste` double default NULL,
  `active_refect_estimate` int(11) default NULL,
  `active_student` varchar(300) default NULL,
  `active_content` varchar(2000) default NULL,
  PRIMARY KEY  (`active_id`),
  KEY `FK_Reference_5` (`staff_id`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_active
-- ----------------------------

-- ----------------------------
-- Table structure for `message_info`
-- ----------------------------
DROP TABLE IF EXISTS `message_info`;
CREATE TABLE `message_info` (
  `message_id1` int(11) NOT NULL auto_increment,
  `staff_id` int(11) default NULL,
  `message_content` varchar(1000) default NULL,
  `message_man` varchar(10) default NULL,
  `message_phone` varchar(15) default NULL,
  `message_time` datetime default NULL,
  `message_state` varchar(10) default NULL,
  PRIMARY KEY  (`message_id1`),
  KEY `FK_Reference_6` (`staff_id`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message_info
-- ----------------------------

-- ----------------------------
-- Table structure for `role_anthorty_info`
-- ----------------------------
DROP TABLE IF EXISTS `role_anthorty_info`;
CREATE TABLE `role_anthorty_info` (
  `role_anthorty_id` int(11) NOT NULL auto_increment,
  `role_id` int(11) default NULL,
  `anthorty_id` int(11) default NULL,
  PRIMARY KEY  (`role_anthorty_id`),
  KEY `FK_Reference_3` (`role_id`),
  KEY `FK_Reference_4` (`anthorty_id`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`anthorty_id`) REFERENCES `anthorty_info` (`anthorty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_anthorty_info
-- ----------------------------

-- ----------------------------
-- Table structure for `role_info`
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `role_id` int(11) NOT NULL auto_increment,
  `role_name` varchar(100) default NULL,
  `role_desc` varchar(1000) default NULL,
  `role_state` varchar(10) default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_info
-- ----------------------------

-- ----------------------------
-- Table structure for `staff_info`
-- ----------------------------
DROP TABLE IF EXISTS `staff_info`;
CREATE TABLE `staff_info` (
  `staff_id` int(11) NOT NULL auto_increment,
  `role_id` int(11) default NULL,
  `staff_name` varchar(100) default NULL,
  `staff_sex` varchar(10) default NULL,
  `staff_age` int(10) default NULL,
  `staff_native_place` varchar(100) default NULL,
  `staff_idcard` varchar(100) default NULL,
  `staff_birthday` datetime default NULL,
  `staff_office_phone` varchar(50) default NULL,
  `staff_mobile_phone` varchar(50) default NULL,
  `staff_email` varchar(100) default NULL,
  `staff_addr` varchar(200) default NULL,
  `staff_qq` varchar(30) default NULL,
  `staff_entry_time` datetime default NULL,
  `staff_education_level` varchar(20) default NULL,
  `staff_remark` varchar(2000) default NULL,
  `staff_state` varchar(10) default NULL COMMENT '1��Ч\r\n            0��Ч',
  `staff_number` varchar(100) default NULL,
  `staff_password` varchar(100) default NULL,
  PRIMARY KEY  (`staff_id`),
  KEY `FK_Reference_1` (`role_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_info
-- ----------------------------

-- ----------------------------
-- Table structure for `staff_salary`
-- ----------------------------
DROP TABLE IF EXISTS `staff_salary`;
CREATE TABLE `staff_salary` (
  `staff_salary_id` int(11) NOT NULL auto_increment,
  `staff_id` int(11) default NULL,
  `sta_staff_id` int(11) default NULL,
  `staff_salary_total` double default NULL,
  `staff_salary_deduct` double default NULL,
  `staff_salary_real` double default NULL,
  `staff_salary_isused` varchar(10) default NULL,
  `staff_salary_time` datetime default NULL,
  `remark` varchar(2000) default NULL,
  PRIMARY KEY  (`staff_salary_id`),
  KEY `FK_Reference_25` (`staff_id`),
  KEY `FK_Reference_26` (`sta_staff_id`),
  CONSTRAINT `FK_Reference_25` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`),
  CONSTRAINT `FK_Reference_26` FOREIGN KEY (`sta_staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_salary
-- ----------------------------

-- ----------------------------
-- Table structure for `student_info`
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `student_id` int(11) NOT NULL auto_increment,
  `staff_id` int(11) default NULL,
  `class_id` int(11) default NULL,
  `student_name` varchar(100) default NULL,
  `student_sex` varchar(10) default NULL,
  `student_age` int(11) default NULL,
  `student_tellphone` varchar(100) default NULL,
  `student_email` varchar(200) default NULL,
  `student_idcard` varchar(30) default NULL,
  `student_address` varchar(300) default NULL,
  `student_birthday` datetime default NULL,
  `student_school` varchar(100) default NULL,
  `student_qq` varchar(30) default NULL,
  `student_parents_name` varchar(100) default NULL,
  `student_parents_phone` varchar(100) default NULL,
  `student_pro` varchar(100) default NULL,
  `student_pro_city` varchar(100) default NULL,
  `student_type` varchar(100) default NULL,
  `student_ispay` varchar(10) default NULL,
  `student_state` int(11) default NULL,
  `student_mark` varchar(10) default NULL,
  `student_desc` varchar(2000) default NULL,
  `student_number` varchar(100) default NULL,
  `student_password` varchar(100) default NULL,
  PRIMARY KEY  (`student_id`),
  KEY `FK_Reference_16` (`class_id`),
  KEY `FK_Reference_8` (`staff_id`),
  CONSTRAINT `FK_Reference_16` FOREIGN KEY (`class_id`) REFERENCES `class_info` (`class_id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------

-- ----------------------------
-- Table structure for `student_payment`
-- ----------------------------
DROP TABLE IF EXISTS `student_payment`;
CREATE TABLE `student_payment` (
  `payment_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) default NULL,
  `staff_id` int(11) default NULL,
  `payment_situtation` varchar(1000) default NULL,
  `payment_menthod` int(11) default NULL,
  `payment_time` datetime default NULL,
  `payment_discount_amount` double default NULL,
  `payment_should_amount` double default NULL,
  `payment_real_amount` double default NULL,
  `payment_debt_amount` double default NULL,
  `payment_remark` varchar(2000) default NULL,
  PRIMARY KEY  (`payment_id`),
  KEY `FK_Reference_23` (`student_id`),
  KEY `FK_Reference_24` (`staff_id`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `FK_Reference_24` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_payment
-- ----------------------------

-- ----------------------------
-- Table structure for `student_write_grade`
-- ----------------------------
DROP TABLE IF EXISTS `student_write_grade`;
CREATE TABLE `student_write_grade` (
  `write_grade_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) NOT NULL,
  `staff_id` int(11) NOT NULL,
  `discipline_id` int(11) NOT NULL,
  `write_grade` varchar(50) default NULL,
  `write_grade_time` datetime default NULL,
  `write_grade_note` varchar(2000) default NULL,
  PRIMARY KEY  (`write_grade_id`),
  KEY `FK_Reference_14` (`student_id`),
  KEY `FK_Reference_15` (`staff_id`),
  CONSTRAINT `FK_Reference_14` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`staff_id`) REFERENCES `staff_info` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_write_grade
-- ----------------------------

-- ----------------------------
-- Table structure for `syllabus_info`
-- ----------------------------
DROP TABLE IF EXISTS `syllabus_info`;
CREATE TABLE `syllabus_info` (
  `syllabus_id` int(11) NOT NULL auto_increment,
  `syllabus_yi` varchar(50) default NULL,
  `syllabus_er` varchar(50) default NULL,
  `syllabus_san` varchar(50) default NULL,
  `syllabus_si` varchar(50) default NULL,
  `syllabus_wu` varchar(50) default NULL,
  `syllabus_liu` varchar(50) default NULL,
  `syllabus_qi` varchar(50) default NULL,
  `syllabus_isused` varchar(50) default NULL,
  `syllabus_name` varchar(100) default NULL,
  PRIMARY KEY  (`syllabus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of syllabus_info
-- ----------------------------

-- ----------------------------
-- Table structure for `template_info`
-- ----------------------------
DROP TABLE IF EXISTS `template_info`;
CREATE TABLE `template_info` (
  `template_id` int(11) NOT NULL auto_increment,
  `template_title` varchar(200) default NULL,
  `template_content` varchar(2000) default NULL,
  `template_type` varchar(20) default NULL,
  PRIMARY KEY  (`template_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of template_info
-- ----------------------------

-- ----------------------------
-- Table structure for `track_record_info`
-- ----------------------------
DROP TABLE IF EXISTS `track_record_info`;
CREATE TABLE `track_record_info` (
  `track_record_id` int(11) NOT NULL auto_increment,
  `student_id` int(11) default NULL,
  `track_record_title` varchar(200) default NULL,
  `track_record_content` varchar(2000) default NULL,
  `track_record_time` datetime default NULL,
  `enrollment` int(11) default NULL,
  `next_record_time` datetime default NULL,
  PRIMARY KEY  (`track_record_id`),
  KEY `FK_Reference_9` (`student_id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of track_record_info
-- ----------------------------
