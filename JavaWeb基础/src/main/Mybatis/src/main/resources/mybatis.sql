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


drop table if exists tb_brand;

create table tb_brand (
    id int primary key auto_increment,
    brand_name varchar(20),
    company_name varchar(20),
    orderd int,
    description varchar(100),
    status int
);

insert into tb_brand (brand_name, company_name, orderd, description, status)
values
    ("华为", "华为公司", 5, "不是华为我不用", 0),
    ("小米", "小米公司", 100, "Are you OK", 1),
    ("三星", "三星公司", 50, "将军最爱", 1);
