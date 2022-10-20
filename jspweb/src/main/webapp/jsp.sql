drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key,			-- 회원번호[pk, autokey]
    mid			varchar(50) unique not null , 						-- 회원아이디
    mpassword	varchar(50) not null,							-- 회원패스워드
    mname		varchar(50) not null,							-- 회원명
    mphone		varchar(15) not null,							-- 회원 전화번호
    memail		varchar(100) unique not null,							-- 회원 이메일
    maddress	varchar(100) null,							-- 회원 주소
    mdate		datetime default now() not null,					-- 회원 가입일		
					-- default 레코드 추가시 기본으로 들어가는 값 설정
					-- datetime default now(): 현재 시스템(DB)의 자동날짜
	mpoint int	default 0 not null 									-- 회원 

);
-- insert 문법
	-- 특정필드만 삽임 : insert into 테이블명 ( 필드명, 필드명 , 필드명) values( 값1, 값2,값3)
select * from member;

-- 로그인 [ 해당 테이블에 동일한 아이디와 패스워드가 존재하는 검색]
-- select * from 테이블명 where 아이디 = ? and 비밀번호 = ?
select * from member where mid = '123' and mpassword = '123';
select * from member;


select * from member where mid ='123' and mpassword ='123';

-- 회원정보 호출
select * from member where mid = '17';

-- 회원 삭제

drop table if exists category;
create table category(cno int auto_increment primary key , cname varchar(100));

-- 게시판 테이블 생성
drop table if exists board;
create table board(
	bno int auto_increment primary key,	-- 번호		
    btitle varchar(1000) not null,	-- 제목				
    bcontent longtext null,	-- 내용
    bfile	longtext null,	-- 첨부파일 
    bdate datetime default now() not null , -- 작성일
    bview int default 0 not null,  -- 작ㄱ성일 : 기본값 현재 시스템 날짜
    cno	int , 		-- 카테고리 번호 FK
    mno int,			-- 작성자
    constraint bcno_fk primary key (bno),
    constraint bcno_fk foreign key (cno) references category(cno) on update cascade,
    constraint bmno_fk foreign key (mno) references member(mno) on delete cascade
);
-- 댓글 : 1.게시물번호 2.회원번호 3.내용 4.답글식별필드[부모자식]

drop table if exists reply;
create table reply(
	rno int auto_increment, 			-- 댓글식별번호
    rcontent	varchar(1000) not null , 	-- 댓글내용
    rdate datetime default now(), 			-- 댓글작성일
    rindex int default 0, 			-- 댓글 - 대댓글 식별 필드 [0 : 상위댓글 , 숫자 : 상위댓글번호 ]
    mno	int not null,			-- 작성자 회원번호
    bno	int not null,			-- 게시물번호
    constraint rno_pk primary key(rno), 
	constraint rmno_fk foreign key(mno) references member(mno) on delete cascade, -- 회원탈퇴시 댓글도 같이 삭제
    constraint rbno_fk foreign key (bno) references board(bno) on delete cascade -- 게시물삭제시 댓글도 같이 삭제
);

select * from reply;



select * from board;


-- 1. 모든 게시물 수 [ count(*) : 레코드수 = 게시물수]
select count(*) from board;
-- 2. 검색 결과에서 limit 이용한 개수 제한
select * from board limit 0, 3;
-- 3. 정렬 [ 작성일 기준으로 정렬 desc:내림찬순 / asc : 오름차순 ( 날짜 최신일수록 크다.)]
select * from board order by bdate desc;
--
select * from board order by bdate desc limit 0 , 3 ; -- 최신글 3개 [ 1페이지 ]
select * from board order by bdate desc limit 3 , 3 ; -- 최신글 3개 [ 2페이지 ]
select * from board order by bdate desc limit 6 , 3 ; -- 최신글 3개 [ 3페이지 ]
select * from board order by bdate desc limit 9 , 3 ; -- 최신글 3개 [ 4페이지 ]

-- 검색 [조건 추가] like 연산자 				필드 = 데이터(같다)		필드 like 데이터 (데이터가 포함된) 
select count(*) from board b ; 
select count(*) from board b where b.btitle = 'qqqqq'; -- 제목검색
-- select count(*) from board b where b.btitle  like %qqqqq% -- 제목포함된 검색

/* 
	like
		필드명 like %김 : 김으로 끝나는문자
		필드며 like 김% : 김으로 시작하는 문자
        필드명 like %김% : 김이 포함된 문자
        
        _ : _ 개수만큼 글자 대응
		필드명 like _김  : 김으로 끝나는 두글자
		필드명 like 김__ : 김으로 시작하는 세글자
        필드명 like _김_ : 두번째 글자가 '김'인 세글자
*/






