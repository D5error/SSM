CREATE DATABASE mybatis
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;

use mybatis;

drop table if exists tb_user;

create table tb_user (
    id int primary key auto_increment,
    username varchar(20),
    password varchar(20),
    gender char(1),
    addr varchar(30)
);

insert into tb_user values (1, "张三", "2123", "男", "北京");
insert into tb_user values (2, "李四", "123", "女", "天津");
insert into tb_user values (3, "王五", "33", "男", "西安");
