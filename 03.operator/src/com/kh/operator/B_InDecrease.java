package com.kh.operator;

public class B_InDecrease {
	/*
	 * * 증감연산자(단독사용시는 그냥 1증가)
	 * ++ : 값을 1 증가시키는 연산자
	 *      ++값 (전위 연산자), 값++ (후위 연산자)
	 * -- : 값을 1 감소시키는 연산자
	 * 		--값 (전위 연산자), 값-- (후위 연산자)
	 * 
	 * (증감연산자)값 : 전위 연산자 --> 선증감 후처리
	 * 값(증감연산자) : 후위 연산자 --> 선처리 후증감
	 */
	
	public void method1() {
		
		// 전위 연산자 테스트
		int num1 = 10;
		
		System.out.println("전위연산자 적용 전 num1의 값 : " + num1); // 10
		
		System.out.println("1회 수행 후 결과 : " + ++num1); // 11
		System.out.println("2회 수행 후 결과 : " + ++num1); // 12
		System.out.println("3회 수행 후 결과 : " + ++num1); // 13
		
		System.out.println("전위연산자 적용 후 num1의 값 : " + num1); // 13
		
		// 후위 연산자 테스트
		int num2 = 10;
		
		System.out.println("후위연산자 적용 전 num2의 값 : " + num2); // 10
		
		System.out.println("1회 수행 후 결과 : " + num2++); // 10 출력 후 --> 11
		System.out.println("2회 수행 후 결과 : " + num2++); // 11 출력 후 --> 12
		System.out.println("3회 수행 후 결과 : " + num2++); // 12 출력 후 --> 13
		
		System.out.println("후위연산자 적용 후 num2의 값 : " + num2); // 13
	}
	
	public void method2() {
		// 전위 연산자
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a + " b : " + b);
		
		// 후위 연산자
		
		int c = 10;
		int d = c++;
		
		System.out.println("c : " + c + " d : " + d);
		
		System.out.println("=============================");
		
		int num = 20;
		
		System.out.println("현재 num : " + num); // 20
		
		System.out.println("++num 는? : " + ++num); // 21
		
		System.out.println("num++ 는? : " + num++); // 21 출력 후 --> 22
		
		System.out.println("--num 는? : " + --num); // 21
		
		System.out.println("num-- 는? : " + num--); // 21 출력 후 --> 20
		
		System.out.println("현재 num : " + num); // 20
	}
	
	public void method3() {
		
		int num1 = 20;
		
		int result = num1++ * 3; // result : 60, num1 : 21

		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a = 10(11)
		System.out.println((++a) + (b++)); // a = 12 b = 20(21) -> 32
		System.out.println((a++) + (--b) + (--c)); // a = 12(13) b = 20, c = 29 -> 61 
		
//		char ch = 'a';
//		System.out.println(ch++);
//		short s = 1;
//		System.out.println(s++);
		
		System.out.println("a : " + a); // a = 13
		System.out.println("b : " + b); // b = 20
		System.out.println("c : " + c); // c = 29
	}
}
