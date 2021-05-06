package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문 : 프로그램의 수행흐름을 제어하는 제어문 중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * for문/while문( do- while문)
	 * 
	 * *for문
	 * 
	 * for(초기식;조건식;증감식){//반복 횟수를 지정하기위해서 제시하는것들 ..반복적으로 실행시키고자 하는 실행 구문..
	 * 
	 * }
	 * 
	 * -초기식 : 반복문이 수행될때 "단 한번만 실행되는 구문" 
	 * 			(보통 반복문 안에서 사용될 변수를 선언하고 초기값을 대입하는 구문) 
	 * -조건식 : "반복문이 수행될 조건" 을 작성하는 구문 
	 * 			조건식이 true일 경우 해당 실행 구문을 실행 
	 * 			조건식이 false일 경우 반복을 멈추고 빠져나옴 (보통 초기식에서 사용된 변수를 가지고 조건식을 작성) 
	 * -증감식 : 반복문을 제어하는 변수값을 증감시키는 부분 
	 * 			(주로 초기식에 제시한 변수를 가지고 증감 연산자 사용)
	 * 
	 * 
	 * for문 초기식--> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 
	 * 			 --> 조건식 검사 -> true일 경우 실행구문을 실행 --> 증감식 
	 * 			 --반복-- 
	 * 			 --> 조건식 검사 -> false일 경우 실행구문을 실행 하지 않음 --> 반복문을 빠져나옴
	 * 
	 * * 알아둘것 ~
	 *   for 문안에 있는 초기식, 조건식, 증감식은 모두 생략 가능 하긴 함(하지만 ; 은 반드시 필수 작성)
	 *   즉,for() 안에서만 생략 될뿐 모두 필요한 요소임.  
	 */
	
	public void method1() {
		
		// "안녕하세요"를 5번 출력하고자 할 때
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		for (int i = 1; i <= 5; i++) { // i값이 1에서부터 5보다 작거나 같을 때까지 1씩 증가 (5회)
			System.out.println("안녕하세요 " + i);
		}
		
		for (int i = 0; i < 5; i++) { // i값이 0부터 4까지 1씩 증가, 반복 (5회)
			System.out.println("안녕하세요 " + i);
		}
	}
	
	public void method2() {
		
		// 1 2 3 4 5 이런 형태로 출력 하고자 한다면 
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {

		// 1부터 10 사이의 홀수만 출력 : 1 3 5 7 9
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
		
	}
	
	public void method4() {
		
		// 1 2 3 4 .. 8 9 10
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	public void method5() {
		
		// 1부터 10까지 정수들 합계
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("총 합계 : " + sum);
	}
	
	public void method6() {
		
		// 1부터 사용자가 입력한 수까지의 합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("총 합계 : " + sum);
	}
	
	public void method7() {
		/*
		 * java.lang.Math 클래스에서 제공하는 random()메소드를 사용해서 랜덤값 발생시킬 수 있다. 
		 * 
		 * Math.random() 호출시 --> 0.0 ~ 0.999999 사이의 랜덤값 발생 시켜줌 (0.0 <= 랜덤값  < 1.0)
		 */
		
		//int random = Math.random(); // double형이라서 안됨
		// 			0.0 <=   < 1.0		--> 0.0 ~ 0.99999...
		
		//int random = Math.random() * 10;
		//			0.0 <=   < 10.0		--> 0.0 ~ 9.99999...
		
		//int random = Math.random() * 10 + 1;
		//			1.0 <=   < 11.0		--> 1.0 ~ 10.9999...
		int random = (int)(Math.random()*10 +1);
		//		    1 <=     < 11	    --> 1 ~ 10 Random);
		
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		
		
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void method8() {
		
		// 사용자에게 문자열을 입력받아서 각 인덱스별로 문자를 각각 추출
		
		/*
		 * apple -> str
		 * 
		 * a -> str.charAt(0);
		 * p -> str.charAt(1);
		 * p -> str.charAt(2);
		 * l -> str.charAt(3);
		 * e -> str.charAt(4);
		 * 
		 * apple의 문자열 길이 -> 5
		 * 01234
		 * 
		 * 마지막 인덱스는 항상 문자열의 길이 -1
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 " + str.length());
		
//		for (int i = 0; i <= str.length()-1; i++) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + i);
		}
	}
	
	public void method9() {
		// 2 단 출력하기
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
	}
	
	public void method10() {
		// 사용자가 입력한 단 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수(2~9)를 입력하세요 : ");
		int dan = sc.nextInt();
		
		// if문 입력된 숫자가 2~9 사이의 숫자가 맞는지 확인
		if (dan > 1 && dan < 10) {
			
			for (int i = 1; i < 10; i++) {
//				System.out.println(dan + " * " + i + " = " + (dan * i));
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
			}
			
		} else {
			System.out.println("2~9 사이의 양수를 입력해야합니다.");
		}
	}
	
	public void method11() {
		
		// 2부터 9 사이의 랜덤 단을 출력하기
		
		int random = (int)(Math.random() * 9 - 2 + 1) + 2;
		/*
		 *  0.0 <= random < 1.0
		 *  0.0 <= random < 8.0 (* 8 했을 때)
		 *  2.0 <= random < 10.0(+ 2 했을 때)
		 *  
		 *  정리 
		 *  int(random(max - min + 1) + min 을 이용하여 
		 *  min ~ max 랜덤값 구함
		 */
		
		System.out.println("==== " + random + " 단 ====");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", random, i, (random * i));
		}
	}
}
