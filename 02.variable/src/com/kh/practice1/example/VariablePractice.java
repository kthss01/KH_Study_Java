package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		/*
		 * 실습문제1 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각가의 값을 변수에 담고
		 * 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
	}

	public void method2() {
		/*
		 * 실습문제2 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱 나누기한 몫을 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();

		System.out.println("더하기 결과 : " + (n1 + n2));
		System.out.println("빼기 결과 : " + (n1 - n2));
		System.out.println("곱하기 결과 : " + n1 * n2);
		System.out.println("나누기 몫 결과 : " + n1 / n2);
	}

	public void method3() {
		/*
		 * 실습문제 3 키보드로 가로, 세로 값을 실수형으로 입력 받아 
		 * 사각형의 면적과 둘레를 계산하여 출력하세요. 참고 (면적 = 가로 * 세로,
		 * 둘레 = (가로+세로) * 2)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double width = sc.nextDouble();

		System.out.print("세로 : ");
		double height = sc.nextDouble();

		double area = width * height;
		double perimeter = (width + height) * 2;

		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
	}
	
	public void method4() {
		/*
		 * 영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요
		 * Hint > charAt(인덱스) 메소드 활용해보기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
