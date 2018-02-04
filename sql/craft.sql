set names utf8;
set foreign_key_checks=0;
drop database if exists craft;

create database if not exists craft;
use craft;

drop table if exists user_info;

create table user_info(
id varchar(16) not null primary key,
user_id varchar(16) not null,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0 not null,
birthday date not null,
email varchar(32) not null,
secret_question int not null,
secret_answer varchar(50) not null,
status tinyint default 0 not null,
logined tinyint default 0 not null,
regist_date datetime not null,
update_date datetime 
);