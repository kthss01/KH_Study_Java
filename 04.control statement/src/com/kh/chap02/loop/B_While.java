package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * * while문
	 * 
	 * [초기식]
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * 		[증감식]
	 * }
	 * 
	 * 조건식이 true일 경우 해당 실행코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> true일 경우 실행코드 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행 X --> 반복문 빠져 나감
	 * 
	 * 
	 */

	public void method1() {
		
		int i = 1;
		while (i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println();
		
		// 1 2 3 4 5
		i = 1;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// 5 4 3 2 1 
		i = 5;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		System.out.println();
	}
	
	public void method2() {
		
		// 1에서 10 사이의 홀수만 출력 
		// 1 3 5 7 9
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println();
		
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
	}
	
	public void method3() {
		
		// 1부터 랜덤한 값 (1 ~ 10) 까지의 합계
		
		int random = (int) (Math.random() * 10) + 1;
		
		System.out.println("랜덤 값 : " + random);
		
		int sum = 0;
		int i = 1;
		
		while (i <= random) {
			sum += i;
			i++;
		}
	
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
			while (i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
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
		while (i < str.length()) {
			System.out.println(str.charAt(i) + " " + i);
			i++;
		}
	}
	
	public void method6() {
		
		// 메뉴 관련
		Scanner sc = new Scanner(System.in);
		
		while (true) { // 반복적으로 메뉴를 출력 할 수 있게!
			
			System.out.println();
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 1부터 5까지의 출력"); // method1
			System.out.println("2. 1에서 10사이의 홀수만 출력"); // method2
			System.out.println("3. 1부터 랜덤한 값(1~10)까지의 합계"); // method3
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			
		}
	}
	
	public void method7() {
		
		// 계속 문자열을 입력받고 그 문자열을 출력하기
		// 하지만 그 문자열이 "exit" 가 아닐 때 까지 반복
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while (!str.equals("exit")) {
			System.out.println("문자열 입력해주세요 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
		System.out.println("exit를 입력해서 종료 되었습니다.");
	}
	
	public void method8() {
		// method7() break 이용
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자열 입력해주세요 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit")) {
				break;
			}
			
			System.out.println("str : " + str);
		}
		
		System.out.println("exit를 입력해서 종료 되었습니다.");
	}
}
