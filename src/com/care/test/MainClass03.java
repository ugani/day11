package com.care.test;

import com.java.sql.Date;
//다른 패키지의 같은 이름을 가진 클래스는 임폴트로 하나만 가져올수 있음

public class MainClass03 {
	public static void main(String[] args) {
		com.java.sql.Date date = new com.java.sql.Date();
		date.myDate();
		
		com.java.util.Date d = new com.java.util.Date();
		//임포트로 다른 패키지의 같은 이름을 가진 클래스를 가져오면
		//위와 같이 패키지 이름과 클래스 이름을 명시해줘야함
		
		Date dd;
		java.sql.Date ddd;
	
	}

}
