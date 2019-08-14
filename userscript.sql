DROP DATABASE IF EXISTS user;
CREATE DATABASE user;
USE user;



CREATE TABLE `user` (	
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `user` (`username`, `password`,`firstname`, `lastname`) VALUES
                   ('admin', 'admin','Phan', 'Lam');