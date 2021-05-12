package com.kh.chap06_constructor.run;

import com.kh.chap06_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {

		// 1. 기본 생성자로 객체 생성 직후 해당 객체의 정보 출력
		User u1 = new User();
		System.out.println(u1.information()); // JVM 의 초기값이 담겨 있음
		
		// 2. 매개 변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02", "pass02", "유야호");
		System.out.println(u2.information());
		
		// 3. 다른 매개변수 생성자로 객체 생성
		User u3 = new User("user03", "pass03", "유야호", 20, 'M');
		System.out.println(u3.information());
		
	}

}
