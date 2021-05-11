package com.kh.chap01_Abstracion.model.vo;

// vo : value object
// 계층간의 데이터를 교환하기 위해서 테이블 컬럼을 모아놓은 단위 (DB 사용시)
// 데이터를 전달하고 표현하고 관리하기 위해서 사용
// 데이터를 setting하고 getting하는 역할 (불변의 성격, read only)
// 데이터 전달 및 표현 관리, 계층간 데이터 교환, 테이블 컬럼을 모아놓은 단위

/*
 * 클래스의 구조
 * 
 * public class 클래스명 {
 * 	// 필드부
 * 
 *  // 생성자부
 *  
 *  // 메소드부
 *  
 * }
 */

// 학생을 추상화해서 만든 클래스 (아직은 미완성) --> 클래스는 구조체와 메소드(함수) 결합 (지금은 구조체)
public class Student {
	
	// 필드부
	// 접근제한자 [예약어] 자료형 변수명;
	
	// 접근제한자 : 접근 할 수 있는 범위를 제한 할 수 있다 
	// (public > protected > default > private)
	
	public String name;
	public int age;
	public double height;
	public int kor;
	public int math;
	
	// 생성자부
	
	// 메소드부
}
