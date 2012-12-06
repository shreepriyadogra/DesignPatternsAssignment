CREATE DATABASE `makemyplan`;

USE `makemyplan`;


CREATE TABLE IF NOT EXISTS `planmytravel` (
  `plan_id` int(11) NOT NULL AUTO_INCREMENT,
  `plan_from` varchar(20) NOT NULL DEFAULT 'NULL',
  `plan_to` varchar(20) NOT NULL DEFAULT 'NULL',
  `plan_via` varchar(20) NOT NULL DEFAULT 'NULL',
  `plan_touragent` varchar(20) NOT NULL DEFAULT 'NULL',
  `plan_date` date NOT NULL,
  `plan_tour` varchar(20) NOT NULL DEFAULT 'NULL',
  PRIMARY KEY (`plan_id`)
);

