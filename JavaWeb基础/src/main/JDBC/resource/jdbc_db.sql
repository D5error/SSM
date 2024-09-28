CREATE DATABASE jdbc_db;

CREATE TABLE vip (
    id INT NOT NULL PRIMARY KEY,
    name varchar(20) NOT NULL
);

INSERT INTO vip(id, name) VALUES
    (1, "d5");


CREATE TABLE login (
    account INT PRIMARY KEY,
    password varchar(20) NOT NULL
);

INSERT INTO login(account, password) VALUES
    (12345678, "d5d5d5d5"),
    (1234, "123456");
