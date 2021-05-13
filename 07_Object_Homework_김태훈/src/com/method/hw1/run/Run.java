package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// NonStaticSample 클래스의 4가지 메소드 각각 호출
		
		NonStaticSample nss = new NonStaticSample();
		
		System.out.print("랜덤 값 : ");
		nss.printLottoNumbers();
		
		char c = 'a';
		int num = 5;
		System.out.printf("%c문자 %d개 출력 : ", c, num);
		nss.outputChar(num, c);
		
		System.out.printf("랜덤 영문자 출력 : %c\n", nss.alphabette());
		
		String str = "apple";
		int index1 = 2;
		int index2 = 4;
		System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : %s\n", 
				str, index1, index2, 
				nss.mySubstring(str, index1, index2));
	}

}
