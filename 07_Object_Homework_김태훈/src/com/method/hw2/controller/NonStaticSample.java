package com.method.hw2.controller;

public class NonStaticSample {
	
	public int[] intArrayAllocation(int length) {
		// 전달 받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴
		
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		return arr;
	}
	
	public void display(int[] arr) {
		// 전달 받은 배열 출력
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		// 전달 받은 배열의 각각의 인덱스 값을 교환
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달 받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		// 삽입 정렬
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
		display(arr);
	}
	
	public void sortAscending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달 받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		// 선택 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
		display(arr);
	}
	
	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달 받아 문자열에 포함된 문자의 갯수 리턴
		
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		
		return count;
	}
	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달 받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달 받은 두 정수는 포함되지 않아야된다.)
		
		// 작은 숫자가 앞으로 오도록 변경
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int sum = 0;
		
		for (int i = num1 + 1; i < num2; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		// 전달 받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		
		String result = str1 + str2;
		
//		result = str1.concat(str2);
		
		return result;
	}
}
