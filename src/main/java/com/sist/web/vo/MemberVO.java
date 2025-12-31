package com.sist.web.vo;

import lombok.Data;

/*
 * 프로젝트 구조
 * ----------
 *  
 *  static
 *  	ㄴjs
 *  		ㄴstores: pinia store
 *  		ㄴapp
 *  		ㄴaxios.js
 *  	ㄴapp
 *  	|
 *  webapp
 *  	|
 *  WEB-INF
 *  	|
 *  views: jsp
 *  	ㄴmain
 *  	ㄴfood
 *  	ㄴrecipe
 *  	|
 *  index
 *  
 *  ============
 *  com.sist.web => 실행 파일
 *  com.sist.web.mapper
 *  com.sist.web.service
 *  com.sist.web.controller
 *  com.sist.web.restcontroller
 *  com.sist.web.commons
 *  com.sist.web.aop
 *  ---------------------------- 입문 과정 (MVC)
 *  com.sist.web.interceptor: 자동 로그인
 *  com.sist.web.security: 인가/인증 => 권한 부여
 *  com.sist.web.task: batch => 실시간 처리 
 *  com.sist.web.manager: websocket / kafka
 *  
 */
/*
이름      널?       유형            
------- -------- ------------- 
ID      NOT NULL VARCHAR2(20)  
NAME    NOT NULL VARCHAR2(50)  
SEX     NOT NULL VARCHAR2(10)  
ADDRESS          VARCHAR2(200) 
PWD     NOT NULL VARCHAR2(10)  
 */
@Data
public class MemberVO {
	private String id,name,sex,address,pwd,msg;
}
