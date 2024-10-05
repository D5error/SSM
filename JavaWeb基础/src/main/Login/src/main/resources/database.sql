CREATE DATABASE login
    DEFAULT CHARACTER SET utf8mb4
    DEFAULT COLLATE utf8mb4_general_ci;

use login;

drop table if exists accounts;

create table accounts (
                         username varchar(20) primary key,
                         password varchar(20)
);

insert into accounts values ("d5error", "qq1247054343");
