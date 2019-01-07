DROP DATABASE IF EXISTS university_db;

CREATE DATABASE university_db;
use university_db;

CREATE  TABLE `Group` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) );
  

CREATE  TABLE `Student` (
  `identity` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `surname` VARCHAR(45) NOT NULL ,
  `phone_number` INT NOT NULL ,
  `group_id` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`identity`) );
  


insert into `Group` (id, name) values (1, 'it-3'), (2, 'it-4');

insert into `Student` (id, name, surname, phone_number, group_id) 
values (1, 'Dima', 'Kotkin', '+123123123', 1), 
       (2, 'Anton', 'Penkin', '+123123123', 1), 
       (3, 'Kostya', 'Stulov', '+123123123', 1), 
       (4, 'Valera', 'Antonov', '+123123123', 2), 
       (5, 'Egor', 'Krovatin', '+123123123', 2), 
       (6, 'Andrei', 'Polov', '+123123123', 2), 

