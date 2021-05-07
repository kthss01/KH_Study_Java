package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	/*
	 * * do-while문
	 * 
	 * [초기식]
	 * 
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 
	 * 		[증감식]
	 * 
	 * }while(조건식); 
	 * 
	 * 
	 * 초기식  --> 무조건 한번은 실행 --> 증감식 
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> true일 경우 실행 --> 증감식
	 * 조건식 --> false일 경우 빠져나감
	 * 
	 * while문과 다른 점은 while문은 처음 수행될때도 조건식을 검사하고 나서 조건식이 true일 경우 실행되는데
	 * do while문은 첫 실행은 조건식없이 무조건 수행된다는 점
	 * 
	 */
	
	public void method1() {
		// 조건이 맞지 않아도 반드시 수행하고 조건 검사
		
		int num = 1;
		
		do {
			System.out.println(num);
		} while (num == 0);
		
	}
	
	public void method2() {
		
		// 1부터 5까지 
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i++ + " ");
		} while(i <= 5);
		
		System.out.println();
		
	}
	
	public void method3() {
		
		// 1부터 랜덤한 값 (1 ~ 10) 까지의 합계
		
		int random = (int) (Math.random() * 10) + 1;
		
		System.out.println("랜덤 값 : " + random);
		
		int sum = 0;
		int i = 1;
		
//		while (i <= random) {
//			sum += i;
//			i++;
//		}
		
		do {
			sum += i;
			i++;
		} while (i <= random);
	
		System.out.println("1부터  " + random + "까지의 합 : " + sum);
		
	}
	
	public void method4() {
		
		// 사용자가 입력한 단의 구구단을 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수(2~9)를 입력하세요 : ");
		int dan = sc.nextInt();
		
		// 입력된 단이 2~9 사이의 숫자인지 먼저 확인
		if (dan >= 2 && dan <= 9) {
			int i = 1;
//			while (i <= 9) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//				i++;
//			}
			
			do {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			} while (i <= 9);			
		} else {
			System.out.println("2~9 사이의 양수를 입력하세요~");
		}
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 " + str.length());
		
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i) + " " + i);
//		}
		
		int i = 0;
//		while (i < str.length()) {
//			System.out.println(str.charAt(i) + " " + i);
//			i++;
//		}
		
		do {
			System.out.println(str.charAt(i) + " " + i);
			i++;
		} while (i < str.length());
	}
	
	public void method6() {
		
		// 계속 문자열을 입력받고 그 문자열을 출력하기
		// 하지만 그 문자열이 "exit" 가 아닐 때 까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
//		while (!str.equals("exit")) {
//			System.out.println("문자열 입력해주세요 : ");
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
		
		do {
			System.out.println("문자열 입력해주세요 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit"));
		
		System.out.println("exit를 입력해서 종료 되었습니다.");
	}
	
	public void method7() {
		// method7() break 이용
		Scanner sc = new Scanner(System.in);
		
//		while (true) {
//			System.out.println("문자열 입력해주세요 : ");
//			String str = sc.nextLine();
//			
//			if (str.equals("exit")) {
//				break;
//			}
//			
//			System.out.println("str : " + str);
//		}
		
		do {
			System.out.println("문자열 입력해주세요 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;
			}
			
			System.out.println("str : " + str);
		} while (true);
		
		System.out.println("exit를 입력해서 종료 되었습니다.");
	}
}
