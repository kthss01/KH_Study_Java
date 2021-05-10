package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		/*
		 * 실습 문제 1
		 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice2() {
		/*
		 * 실습 문제 2
		 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		 * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice3() {
		/*
		 * 실습 문제 3
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice4() {
		/*
		 * 실습 문제 4
		 * 길이가 5인 String배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"로 
		 * 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요. 
		 */
		
		// fruit은 복수형 없음 복수도 fruit
		String[] fruit = { "사과", "귤", "포도", "복숭아", "참외" };
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		/*
		 * 실습 문제 5
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int arr[] = new int[str.length()]; // 문자열 크기만큼 배열 선언
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				arr[count] = i;
				count++;
			}
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.printf("%c 개수 : %d\n", ch, count);
	}
	
	public void practice6() {
		/*
		 * 실습 문제 6
		 * "월" ~ "일" (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 * 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String week = "월화수목금토일";
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num < 0 || num > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.printf("%c요일\n", week.charAt(num));
	}
	
	public void practice7() {
		/*
		 * 실습 문제 7
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			System.out.println();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		/*
		 * 실습 문제 8
		 * 3 이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
		 * 다시 정수를 받도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		while (true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요");
			} else {
				break;
			}
		}
		
		int[] arr = new int[num];
		
//		arr[0] = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (i <= arr.length / 2) {
//				arr[i] = arr[i-1] + 1; 
//			} else {
//				arr[i] = arr[i-1] - 1;
//			}
//		}
		
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i <= arr.length / 2) {
				arr[i] = ++value; 
			} else {
				arr[i] = --value;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}
	
	public void practice9() {
		/*
		 * 실습 문제 9
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다"를 출력하세요.
		 * 단, 치킨 메뉴가 들어가 있는 배열은 본인 스스로 정하세요.
		 */
		
		String[] chickens = { "양념", "후라이드" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		boolean isFind = false;
		for (int i = 0; i < chickens.length; i++) {
			if (chickens[i].equals(chicken)) {
				System.out.printf("%s치킨 배달 가능\n", chicken);
				isFind = true; 
			}
		}
		
		if (isFind == false) {
			System.out.printf("%s치킨은 없는 메뉴입니다.\n", chicken);
		}
	}
	
	public void practice10() {
		/*
		 * 실습 문제 10
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요. 
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int) (Math.random() * 10) + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice11() {
		/*
		 * 실습 문제 11
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 */
		
		int[] arr = new int[10];
		
//		int minNum = 10; // 최대값을 일단 대입
//		int maxNum = 1; // 최소값을 일단 대입
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int) (Math.random() * 10) + 1;
			
//			if (arr[i] < minNum) {
//				minNum = arr[i];
//			}
//			
//			if (arr[i] > maxNum) {
//				maxNum = arr[i];
//			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println("최대값 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
	}
	
	public void practice12() {
		/*
		 * 실습 문제 12
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 */
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void practice13() {
		/*
		 * 실습 문제 13
		 * 주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열의 
		 * 각 인덱스 별 문자를 char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		
		// 주민등록번호 Social Security Number : SSN
		String ssn = sc.nextLine();
		
		char[] chArr = new char[ssn.length()];
		
		for (int i = 0; i < ssn.length(); i++) {
			if (i <= 7) {
				chArr[i] = ssn.charAt(i);
			} else {
				chArr[i] = '*';
			}
		}
		
		System.out.println(chArr);
	}
	
	public void practice14() {
		/*
		 * 실습 문제 14
		 * 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		 */
		
		int[] lotto = new int[7];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}
}
