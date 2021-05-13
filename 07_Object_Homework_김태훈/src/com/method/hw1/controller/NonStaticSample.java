package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void outputChar(int num, char c) {
		// 매개 변수로 전달 받은 문자 c를 전달 받은 num 갯수만큼 출력하는 메소드

		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드

		// 최소 ~ 최대 랜덤값 구하기 : (int)((Math.random() * (최대값 - 최소값 + 1)) + 최소값
		int num = ((int) (Math.random() * ('z' - 'a' + 1)) + 'a');
		char alphabet = (char) num;

		return alphabet;
	}

	public String mySubstring(String str, int index1, int index2) {
		// 매개 변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달 받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴

		String result = "";

//		result =  str.substring(index1, index2);

		if (index1 < 0 || index1 > index2 || index1 >= str.length() || index2 >= str.length()) {
			return null;
		}

		for (int i = index1; i < index2; i++) {
			result += str.charAt(i);
		}

		return result;
	}
}
