package com.kh.first;

public class B_ValuePrinter {

	public void printValue() {

		// 1. 숫자 출력 --> 따옴표 없이
		System.out.println(123); // 정수값 출력
		System.out.println(1.23); // 실수값 출력

		// 2. 문자(한 글자) --> 따옴표 이용
		System.out.println('a');
		System.out.println('b');

		// 3. 문자열 (여러 글자) 출력 --> 쌍따옴표를 이용
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");

		// 4. 연산한 결과값도 출력 가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		
		// 5. 문자와 숫자 연산 가능 --> 문자와 숫자를 연산시 문자를 자동으로 숫자로 인식
		System.out.println('a' + 1);
		
		// 6. 문자열 ("")과 그 외의 값을 덧셈 연산 --> 문장열화 됨
		System.out.println("하이" + 'a');
		System.out.println("안녕하세요 " + 123);
		System.out.println("반갑습니다." + (111 + 222));

	}
}
