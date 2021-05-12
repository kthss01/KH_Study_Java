package com.kh.chap04_field.model.vo;

// 클래스 변수 (static)에 대해 알아보기
public class FieldTest3 {

	// 전역 변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	
	// static -> 프로그램을 실행하자마자 static 메모리 영역에 할당됨,
	// static은 공유의 개념
	// 일반 변수는 이 클래스로 객체를 생성해야만 그 변수가 메모리에 올라간다면,
	// static이 붙은 변수는 프로그램 실행과 동시에 메모리에 올라감
	
	public static String pubSta =  "public static";
	private static String priSta = "private static";
	
	public FieldTest3() {
		// TODO Auto-generated constructor stub
	}
	
	// pubSta는 접근 제한자가 public 이고, 언제 어디서든 접근 가능하기 때문에 
	// setter, getter 메소드가 필요 없음 
	// private 변수에 대해서만 만들어주자, 
	// static 예약어가 붙으면 메소드 또한 static 을 붙여서 만들어야함
	
	public static void setPriSta(String priSta) {
		// this.priSta = priSta; 
		// --> static은 객체 생성하지 않고도 프로그램 실행과 동시에 static 영역에 할당되므로 this가 존재하지 않는다.
		FieldTest3.priSta = priSta;
	}
	
	public static String getPriSta() {
		return priSta;
	}
}
