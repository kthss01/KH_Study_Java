package com.kh.run;

import com.kh.first.A_MethodPrinter;

public class RunA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 패키지명까지 풀클래스명으로 사용하는 방법
//		com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// 컨트롤 + 시프트 + O , 컨트롤 스페이스 -> 자동완성기능
		// 클래스명만 가지고 생성을 하되 import 구문 추가를 해야한다.
		A_MethodPrinter a = new A_MethodPrinter(); 

		/*
		a.methodA(); // 사용할 이름.메소드명() 으로 호출
		a.methodB();
		a.methodC();
		*/
		
		a.methodA();
	}

}
