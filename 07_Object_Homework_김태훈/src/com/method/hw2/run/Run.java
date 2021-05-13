package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();

		int length = 5;
		int[] arr = nss.intArrayAllocation(length);

		System.out.printf("크기가 %d인 랜덤값 : ", length);
		nss.display(arr);

		System.out.print("내림차순 출력 : ");
		nss.sortDescending(arr);

		System.out.print("오름차순 출력 : ");
		nss.sortAscending(arr);

		System.out.println();

		String str = "apple";
		char c = 'p';
		System.out.printf("%s문자열에 %c의 갯수 : %d\n", str, c, nss.countChar(str, c));

		int num1 = 13;
		int num2 = 7;
		System.out.printf("%d과 %d사이 정수들의 합계 : %d\n", num1, num2, nss.totalValue(num1, num2));

		str = "programming";
		int index = 3;
		System.out.printf("%s문자열의 %d번 인덱스 문자 : %c\n", str, index, nss.pCharAt(str, index));
		
		String str1 = "JAVA";
		String str2 = "programming";
		System.out.printf("%s와 %s을 합친 문자열 : %s\n", str1, str2, nss.pConcat(str1, str2));
	}

}
