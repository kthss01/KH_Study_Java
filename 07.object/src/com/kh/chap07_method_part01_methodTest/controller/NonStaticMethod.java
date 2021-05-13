package com.kh.chap07_method_part01_methodTest.controller;

import com.kh.chap06_constructor.model.vo.User;

public class NonStaticMethod {
	// 메소드
	/*
	 * [접근제한자] [예약어] 반환할값의자료형 메소드명([자료형 매개변수명, 자료형 매개변수명, ...]) {
	 * 		수행내용;
	 * 		[return 반환값;]
	 * }
	 */
	//매개변수의 유무와 반환값 유무에 따른 구분
	
	// 1. 매개변수도 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값 둘다 없는 메소드 타입");
//		return; // jvm이 자동으로 생성해줘서 명시 안해도 되는거
		// 사실상 모든 메소드에 return이 있음 다만 반환 값이 없을 경우에는 JVM이 자동 생성
	}
	
	// 2. 매개변수 없고 반환값은 있는 메소드
	public String method2() {
		return "매개변수가 없고 반환값은 있는 메소드 타입";
	}
	
	// 3. 매개변수 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	// 4. 매개변수 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	// 추가 매개변수로 객체도 전달 받을 수 있다.
	public void method(User u1) {
		u1.setAge(20);
	}
}
