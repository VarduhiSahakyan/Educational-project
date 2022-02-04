drop table if exists member;
CREATE TABLE `userdb`.`member`
(
    `username` VARCHAR(45) NOT NULL,
    `email`    VARCHAR(45) NULL,
    `phone`    VARCHAR(45) NULL,
    `password` VARCHAR(45) NULL,
    PRIMARY KEY (`username`)
);