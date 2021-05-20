package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.TokenController;

public class TokenMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		// 메뉴 반복 실행
		/*
		 * 1. 지정 문자열 
		 * 2. 입력 문자열
		 * 9. 프로그램 끝내기
		 * 메뉴 번호 :
		 */
		
		
		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch (select) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력gktpdy.");
			}
		}
	}
	
	public void tokenMenu() {
		
		String str = "J a v a P r o g r a m";
		
		// Token 처리 전 글자와 글자 개수를 출력하고
		System.out.println("트큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력
		String result = tc.afterToken(str);
		
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력
		System.out.println("토큰 처리 후 글자 : " + result);
		System.out.println("토큰 처리 후 개수 : " + result.length());
		System.out.println("모두 대문자로 변환 : " + result.toUpperCase());
	}
	
	public void inputMenu() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// 입력 받은 문자열을 TokenController의 firstCap()의 인자로 보내 반환 값 출력
		
		String result = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + result);
		
		// 찾을 문자 입력 받아 TokenController의 findChar()의 매개변수로
		// 아까 입력 받은 문자열과 문자 하나를 매개변수로 보내 반환 값 출력
		
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.printf("%c 문자가 들어간 개수 : %d\n", ch, tc.findChar(str, ch));
		
	}
}
