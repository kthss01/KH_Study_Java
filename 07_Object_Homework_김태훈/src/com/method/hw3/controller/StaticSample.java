package com.method.hw3.controller;

public class StaticSample {
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		
		char[] chArr = value.toCharArray();
		
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 'a' && chArr[i] <= 'z') {
				chArr[i] -= 'a' - 'A'; // A : 65, a : 97
			}
		}
		
		value = String.valueOf(chArr);
		
//		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		// 전달 받은 인덱스 위치의 value 값을 전달 받은 문자로 변경하는 static 메소드
		
		char[] chArr = value.toCharArray();
		chArr[index] = c;
		value = String.valueOf(chArr);
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		
		return value.length();
	}
	
	public static String valueConcat(String str) {
		//  문자열 값을 전달 받아 value 필드 값과 하나로 합쳐서 리턴
		
		return value + str;
		
//		return value.concat(str);
	}
}
