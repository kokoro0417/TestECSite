drop database if exists amazonnu;
create database if not exists amazonnu;

use amazonnu;

drop table if exists user_data;

create table user_data(
user_id varchar(255) not null primary key,
password varchar(255)
);

drop table if exists card_data;

create table card_data(
card_id int not null primary key AUTO_INCREMENT,
expansion enum('ORI','BFZ','OGW','SOI','EMN','KLD','AER','AKH','HOU','XLN'),
card_name varchar(255),
card_type enum('クリーチャー','呪文','サポート'),
color set('白','青','黒','赤','緑','無','白青','青黒','黒赤','赤緑','緑白','白黒','青赤','黒緑','赤白','緑青'),
rarity enum('コモン','アンコモン','レア','神話レア','Masterpiece'),
mana int,
stock int,
price int,
imgurl varchar(255)
);

drop table if exists buy_item_data;

create table buy_item_data(
user_id varchar(255),
item_name varchar(255),
total_price int,
total_count int,
buytime datetime
);

insert into user_data value
("taro","123"),
("jiro","456"),
("hanako","789")
;
