package DATABAES.java연동;

public class 자료정리1 {

}

/* 
 
 2022 9 19
 
 		DDL: 정의어[만들기]
 			
 		
 
 		where 조건식
 			+ : 더하기
 			- : 빼기
 			* : 곱하기
 		 	DIV : 몫
 			MOD : 나머지
 		2.비교연산자
 			>= 이상
 			<= 이하
 			> 초과
 			< 미만
 			= 같다 [ vs자바(=대입 ==같다)]
 			!= , <> : 같지않다.
 		3. 논리여난자
 				AND : 이면서 면서 이고 모두 그리고 [ 비교연산자가 모두 참이면 참]
 				OR : 이거나 거나 또는 하나라도 [ 비교연산자가 하나라도 참이면 참]
 				NOT : 부정
 		4. 기타연산자
 				IN(값1,값2,값3,값4):값1~4 하나라도 존재하면		: 값1 ~ 값4 하나라도 존재하면
 				BETWEEN 값1 AND 값2 						: 값1~값2 사이에 존재하면
 				LIKE									: 패턴 검색
 						% : 모든문자 대응			_: _ 개수만큼 문자수 대응  _ =언더바
 		5.NULL 관련 연산자
 				IS NULL : NULL 이면 			[필드명 = NULL (X) vs 필드명 is null (O) ]
 				IS NOT NULL : NULL 이 아니면	[필드명 !=NULL(X)	vs 필드명 is not null (O) ]
 
 		
 		정리 .
 		
 		select * from member;
 		
 		select * from member where;
 
 		select * from member where mem_name ='블랙핑크';
 		
 		select mem_id , mem_name from member where height <= 162;
 		
 		select mem_name , height , mem_number from member where height >= 165 and mem_number > 6;
 		
 		select mem_name , height , mem_number from member where height >= 165 or mem_number > 6;
 		
 		select * from member where mem_name like '우%';
 		
 		select * from member where mem_name like '__핑크';
 		
 		select mem_id , mem_name , debut_date from member order by debut_date;
 		
 		select mem_id , mem_name , debut_date from member order by debut_date desc;
 		
 		
 		
 		
 
 
 
 
 */
