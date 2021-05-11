package com.kh.dimension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DimensionalArray {

	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것

	public void method1() {

		/*
		 * 1. 이차원 배열 선언 
		 * 자료형 배열명[][]; 
		 * 자료형[] 배열명[]; 
		 * 자료형[][] 배열명;
		 */

		int arr1[][];
		int[] arr2[];
		int[][] arr;

		/*
		 * 2. 이차원 배열 할당 배열명 = new 자료형[행크기][열크기];
		 */

		arr = new int[3][5];

		// 행의 길이
		System.out.println("행의 길이 : " + arr.length);

		// 열의 길이
		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);

		// *****
		// *****
		// *****

		// 바깥쪽 for문 --> 행의 갯수만큼 반복
		// 안쪽 for문 --> 열의 갯수만큼 반복
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void method2() {
		int[][] arr = new int[3][5];

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15

		// 값 기록
		// 1. 인덱스에 접근하여 값 기록
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
//
//		arr[1][0] = 6;
//		arr[1][1] = 7;
//		arr[1][2] = 8;
//		arr[1][3] = 9;
//		arr[1][4] = 10;
//		
//		arr[2][0] = 11;
//		arr[2][1] = 12;
//		arr[2][2] = 13;
//		arr[2][3] = 14;
//		arr[2][4] = 15;

		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1;
		for (int i = 0; i < arr.length; i++) { // 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) { // 열을 지정해주는 for
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) { // 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) { // 열을 지정해주는 for
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method3() {
		// 이차원 배열의 할당과 동시에 초기화
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		for (int i = 0; i < arr.length; i++) { // 행을 지정해주는 for문
			for (int j = 0; j < arr[i].length; j++) { // 열을 지정해주는 for
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void method4() {

		// 가변 배열
		// 행은 정해졌으나 각 행에 대한 열의 갯수가 정해지지 않은 상
		// 자료형이 같은 1차원 배열 여러개를 하나로 묶은 게 --> 2차원 배열
		// 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없음.

		int[][] arr = new int[3][]; // 가변 배열 할당 (행의 크기는 3행)

		arr[0] = new int[2]; // 0행은 2열
		arr[1] = new int[1]; // 0행은 2열
		arr[2] = new int[3]; // 0행은 2열

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// 값 초기화
		// 1. 인덱스 접근
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		
//		arr[1][0] = 3;
//		
//		arr[2][0] = 4;
//		arr[2][1] = 5;
//		arr[2][2] = 6;

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method5() {
		// 가변 배열을 할당과 동시에 초기화
		int[][] arr = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void method6() {
		// Scanner를 이용해서 국어점수와 영어점수를 3번 찍어서 각각 평균을 구하시오
		// double[][] arr = new double[2][4]; // 마지막 열에는 평균 담기

		Scanner sc = new Scanner(System.in);

		double[][] arr = new double[2][4];

		int arrILgth = 0;

		for (int i = 0; i < arr.length; i++) {
			double sum = 0;
			
			
			arrILgth = arr[i].length - 1;
			
			for (int j = 0; j < arr[i].length-1; j++) {
				
				if (i == 0) {
					System.out.println("국어 점수 : ");
				} else {
					System.out.println("영어 점수 : ");
				}
				
				arr[i][j] = sc.nextDouble();
				
				sum += arr[i][j];
			}
			
			arr[i][arrILgth] = sum;
			System.out.println("합 -----> " + arr[i][arrILgth]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
				System.out.print("arr[" + i + "][" + j + "] " + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		DecimalFormat f1 = new DecimalFormat("0.00");
		
		System.out.println("국어 점수 평균 : " + arr[0][arrILgth] / arrILgth);
		System.out.println("영어 점수 평균 : " + arr[1][arrILgth] / arrILgth);
		
		System.out.println("영어 점수 평균 : " + f1.format(arr[1][arrILgth] / arrILgth));
		
//		for (int i = 0; i < arr.length; i++) {
//			double sum = 0;
//			for (int j = 0; j < arr[i].length - 1; j++) {
//
//				if (i == 0) {
//					System.out.println("국어 점수 : ");
//				} else {
//					System.out.println("영어 점수 : ");
//				}
//
//				arr[i][j] = sc.nextDouble();
//				sum += arr[i][j];
//			}
//
//			arr[i][arr[i].length - 1] = sum / arr[i].length - 1;
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (j == arr[i].length - 1) {
//					System.out.print("평균 : ");
//				}
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

	}
	
	public void method7() {
		// 1부터 10 사이의 랜덤값을 3행 3열에 넣으려고 함
		// 중복을 제거해서 넣기
		
		// 1차원 배열로 중복제거한 9개 값 구해놓고
		// 2차원 배열로 셋팅
		
		int[] temp = new int[9];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr = new int[3][3];
		int index = 0;
		
//		boolean[] checker = new boolean[11];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				int num = (int) (Math.random() * 10) + 1;
//				if (checker[num] == false) {
//					arr[i][j] = num;
//					checker[num] = true;
//				} else {
//					j--;
//					continue;
//				}
				arr[i][j] = temp[index++];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// 빙고 게임
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		
		// 1차원 배열로 중복 제거한 25개 값 구해 놓고
		
		int[] tempArr = new int[25];
		
		for (int i = 0; i < tempArr.length; i++) {
			tempArr[i] = (int)(Math.random() * 25) + 1;
			
			for (int j = 0; j < i; j++) {
				if (tempArr[i] == tempArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr = new int[5][5];
		
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tempArr[index++];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d ", arr[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("======== 빙고 게임 시작 ========");
		
		while (true) {
			System.out.println("정수를 입력하세요 :");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					
					if (arr[i][j] == num) {
						arr[i][j] = 0; // 일치하는 위치에 0으로 표시
					}
					
					System.out.printf("%4d ", arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("게임을 끝내시겠습니까? (y/n) : ");
			
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if (ch == 'Y') {
				break;
			} 
		}
		
		System.out.println(count + "번 입력하였습니다.");
	}
}
