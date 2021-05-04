package com.kh.operator;

// negation 부정 (명제의 참과 거짓을 반전하는 논리 연산)
// logical negation 논리 부정
public class A_LogicalNegation {
	
	public void method1() {
		// 단항 연산자 (하나의 값을 가지고 연산함)
		// 논리부정연산자 --> !
		// 논리값을 반대로 바꾸는 연산자
		// * 논리값 : true/false
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 : " + b1);
		System.out.println("b1 의 부정 : " + !b1);
		
		System.out.println("b2 : " + b2);
		System.out.println("b2 의 부정 : " + !b2);
	}
}
