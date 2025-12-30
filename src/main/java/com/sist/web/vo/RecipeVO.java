package com.sist.web.vo;

import lombok.Data;

/*
이름         널? 유형             
---------- -- -------------- 
NO            NUMBER(38)     
TITLE         VARCHAR2(4000) 
POSTER        VARCHAR2(4000) 
CHEF          VARCHAR2(4000) 
LINK          VARCHAR2(26)   
HIT           NUMBER(38)     
LIKECOUNT     NUMBER(38)     
JJIMCOUNT     NUMBER(38)     
REPLYCOUNT    NUMBER(38)     
 */

@Data
public class RecipeVO {
	private int no,hit,likecount,jjimcount,replycount;
	private String title,poster,chef,link;
	// likecount, jjimcount, replycount는 자동 증가 형태 => 트리거 사용
	// 트리거 조건: 다른 테이블 연결 시에만 사용 가능
	// 공통 댓글 => 프로시저 사용, JOIN => Function 사용
}
