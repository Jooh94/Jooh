drop database if exists jsptest;
create database jsptest;
use jsptest;
drop table if exists board;
create table board(
	bno			int auto_increment ,
	btitle		varchar(1000),
	bcontent	varchar(1000),
	bwrite		varchar(1000),
    bpassword	varchar(1000),
    bdate		datetime default now(),
    bview		int default 0 ,
    constraint bno_pk primary key(bno)
);
select * from board;


