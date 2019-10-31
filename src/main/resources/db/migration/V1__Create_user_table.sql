CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `account_id` varchar(100) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmtcreate` bigint(19) DEFAULT NULL,
  `gmtmodified` bigint(19) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;