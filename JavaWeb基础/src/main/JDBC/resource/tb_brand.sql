drop table if exists tb_brand;

create table tb_brand (
    id int primary key auto_increment,
    brand_name varchar(20),
    company_name varchar(20),
    orderd int,
    description varchar(100),
    status int
);

insert into tb_brand(brand_name, company_name, orderd, description, status) values
    ("华为", "华为公司", 5, "不是华为我不用", 0),
    ("小米", "小米公司", 100, "Are you OK", 1),
    ("三星", "三星公司", 50, "将军最爱", 1);

select * from tb_brand;