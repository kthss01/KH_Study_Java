package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		
		// StaticSample 클래스 변수인 value를 "Java"로 초기화 후 출력
		StaticSample.setValue("Java");
		System.out.printf("value : %s\n", StaticSample.getValue());
		
		// toUpper 메소드 실행을 통해 대문자로 변경 후 출력
		StaticSample.toUpper();
		System.out.printf("대문자로 : %s\n", StaticSample.getValue());
		
		// valueLength 메소드 실행을 통해 길이 출력
		System.out.printf("길이 : %d\n", StaticSample.valueLength());
		
		// valueConcat 메소드 실행을 통해 "PROGRAMMING" 문자열을 합친 후 출력
		String str = "PROGRAMMING";
		System.out.printf("%s 붙여서 : %s\n", str, StaticSample.valueConcat(str));
		
		// setChar 메소드 실행을 통해 "J"를 "C"로 변경 후 출력
		char c = 'C';
		int index = 0;
		char beforeC = StaticSample.getValue().charAt(index);
		StaticSample.setChar(index, c);
		System.out.printf("%c => %c : %s\n", beforeC, c, StaticSample.getValue());
		
	}

}
