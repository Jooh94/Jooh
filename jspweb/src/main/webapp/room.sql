drop database if exists roomescape;
create database roomescape;
use roomescape;
create table rmember(
	rno int auto_increment primary key, -- 회원번호
	rid			varchar(50) , 					-- 회원 아이디
	rpassword	varchar(50) ,					-- 회원 비번		
    rphone		varchar(15) ,					-- 회원 전화번호
    remail		varchar(100) ,					-- 회원 이메일
    rdate		datetime default now()  		-- 가입날짜
);

select * from rmember;
