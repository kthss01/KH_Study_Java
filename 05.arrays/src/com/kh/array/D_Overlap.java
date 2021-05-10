package com.kh.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D_Overlap {
	
	// 중복 제거
	public void method1() {
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();
			
			for (int j = 0; j < i; j++) {
				System.out.println("i:" + i + "\t" + "j:" + j);
				if (arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다. ");
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		int[] arr = new int[5];
		
		// 임의의 1부터 10 사이의 난수를 발생시켜 중복 없이 출력

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
//					System.out.println("중복값이 존재합니다.");
					i--;
					break;
				}
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
	
	public void method3() {
		
		// 배열 10칸, 난수 100, 중복 제거, 오름차순, 내림차순
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
//		// 삽입 정렬
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		// 선택 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
