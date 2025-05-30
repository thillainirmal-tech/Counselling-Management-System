/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - counselling
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `counselling`;

USE `counselling`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `username` varchar(200) default NULL,
  `password` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert into `admin` (`username`,`password`) values ('admin','admin');

/*Table structure for table `college` */

DROP TABLE IF EXISTS `college`;

CREATE TABLE `college` (
  `sl_no` int(200) NOT NULL auto_increment,
  `cid` varchar(2000) default NULL,
  `cname` varchar(2000) default NULL,
  `grade` varchar(2000) default NULL,
  `cutoffmini` varchar(2000) default NULL,
  `cutoffmax` varchar(2000) default NULL,
  `location` varchar(2000) default NULL,
  `type` varchar(2000) default NULL,
  `underofcollege` varchar(2000) default NULL,
  `information` varchar(2000) default NULL,
  `count` varchar(200) default NULL,
  PRIMARY KEY  (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `college` */

insert into `college` (`sl_no`,`cid`,`cname`,`grade`,`cutoffmini`,`cutoffmax`,`location`,`type`,`underofcollege`,`information`,`count`) values (2,'001','sethu','A','135','180','Madurai','Co-education','anna university','assss','1');
insert into `college` (`sl_no`,`cid`,`cname`,`grade`,`cutoffmini`,`cutoffmax`,`location`,`type`,`underofcollege`,`information`,`count`) values (3,'002','kln','B','122','199','Madurai','Co-education','anna university','shss','0');
insert into `college` (`sl_no`,`cid`,`cname`,`grade`,`cutoffmini`,`cutoffmax`,`location`,`type`,`underofcollege`,`information`,`count`) values (4,'003','user','A','22','180','Madurai','Co-education','anna university','alsjlsad','2');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(200) default NULL,
  `password` varchar(200) default NULL,
  `age` varchar(200) default NULL,
  `email` varchar(200) default NULL,
  `mobile` varchar(200) default NULL,
  `slcmark` varchar(200) default NULL,
  `hsc` varchar(200) default NULL,
  `schoolname` varchar(200) default NULL,
  `address` varchar(200) default NULL,
  `dob` varchar(200) default NULL,
  `gender` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`username`,`password`,`age`,`email`,`mobile`,`slcmark`,`hsc`,`schoolname`,`address`,`dob`,`gender`) values ('prabu','prabu','22','prabu@gmail.com','9090909090','500','1200','shss','hyd','1January2012','male');
insert into `user` (`username`,`password`,`age`,`email`,`mobile`,`slcmark`,`hsc`,`schoolname`,`address`,`dob`,`gender`) values ('u1','u1','22','prabu@gmail.com','9090909090','500','1200','assss','hyd','1,January,2011','male');
insert into `user` (`username`,`password`,`age`,`email`,`mobile`,`slcmark`,`hsc`,`schoolname`,`address`,`dob`,`gender`) values ('u2','u2','22','prabu@gmail.com','9090909090','500','1200','assss','hyd','2,February,2012','male');
insert into `user` (`username`,`password`,`age`,`email`,`mobile`,`slcmark`,`hsc`,`schoolname`,`address`,`dob`,`gender`) values ('u3','u3','22','prabu@gmail.com','9090909090','500','1200','shss','hyd','3,March,2012','male');

SET SQL_MODE=@OLD_SQL_MODE;