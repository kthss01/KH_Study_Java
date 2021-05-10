package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	public void method1() {
		
		// 일반 변수 선언
		int i; // 메모리 공간에 값을 기록해놓기 위한 공간 --> 메모리 공간 중 stack 영역에 할당되는 것
		
		// 1. 배열 선선
		int[] iArr; // 배열을 선언하게되면 변수 선언과 마찬가지로 stack 영역에 박스가 생김, 
		// 이 박스는 실제 값을 담기 위한 용도가 아니고 '주소를 보관하는 공간'
		
		double[] dArr;
		
		/*
		 * 
		 * 따라서 값을 담는 변수는 그냥 변수라고 하고
		 * 주소값을 담는 변수는 레퍼런스 변수(참조 변수)라고 표현한다.
		 * 
		 * 기본 자료형(boolean, char, byte, short, int, long, float, double) 로 선언한 변수
		 * ->> 진짜 값(리터럴)을 담는 변수--> 변수
		 * 
		 * 
		 * 그 외 자료형(String, int[], char[]....)
		 * --> 주소값을 담는 변수--> 레퍼런스 변수(참조변수)
		 * 
		 */
		
		/*
		 * 2. 배열 할당
		 * 	배열에 담을 값들이 몇개 들어갈지 배열 할당으로 크기를 반드시 지정해두어야 한다.
		 * 
		 *  iArr = new int[] <-- 크기를 지정하지 않으면 에러 발생
		 */
		
		iArr = new int[5];
		dArr = new double[10];
		
		// 다음과 같이 new 라는 연산자를 통해서 배열을 할당하게 되면
		// 메모리의 heap 영역에 해당 배열의 크기만큼 공간이 만들어지고
		// 그 때 해당 공간에 고유한 주소값도 같이 부여되어 
		// 주소값을 stack 영역의 레퍼런스 변수에 저장하게 된다.
		// 따라서 해당 배열에 값을 넣거나 수정할 때 해당 주소를 참조해서 사용하게 된다.
		
		// 배열 선언과 할당을 동시에
		int[] iArr2 = new int[5];
		double[] dArr2 = new double[10];
		
		System.out.println("iArr : " + iArr);
		System.out.println("dArr : " + dArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("dArr2 : " + dArr2);
		
		// 주소값이 출력됨
		// heap 영역의 메모리는 변수를 만든다거나 직접적으로 접근하지는 못하는 영역이고
		// 주소값을 통해서 찾아갈 수 있다.
		
	}
	
	public void method2() {
		
		double[] dArr = new double[3];
		int[] iArr = new int[5];
		
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		System.out.println("===================");
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*
		 * 배열을 따로 초기화 하지 않는다면 JVM이 지정한 자료형의 기본값으로 배열을 초기화 한다.
		 * heap 영역에는 값이 없는 공간이 존재할 수 없다. ----> JVM이 자동으로 초기값 부여
		 * 
		 * 문자열의 길이 : length()
		 * 배열의 길이 : length
		 */
		
		System.out.println("dArr 의 길이 : " + dArr.length);
		System.out.println("iArr 의 길이 : " + iArr.length);
	}
	
	public void method3() {
		
		// 배열의 선언 및 할당
		int[] iArr = new int[5];
		
		// 배열 초기화
		/*
		 * iArr[0] = 1;
		 * iArr[1] = 2;
		 * iArr[2] = 3;
		 * iArr[3] = 4;
		 * iArr[4] = 5;
		 */
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
	
		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] : " + iArr[i]);
		}
		
		System.out.println("iArr : " + iArr); // 주소값
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); // 주소값의 10진수값
	}
	
	public void method4() {
		// 사용자가 입력한 정수값으로 배열의 길이를 지정해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이 : ");
		int i = sc.nextInt();
		
		double[] dArr = new double[i];
		System.out.println(dArr);
		System.out.println("dArr 의 길이 : " + dArr.length);
	}
	
	public void method5() {
		// 배열 선언과 동시에 초기화하기
		
		int[] arr1 = {1, 2, 3, 4};
		// 중괄호 블럭을 사용하는 경우에는 new 연산자를 사용하지 않아도 되고
		// 내부적으로 수행해준다.
		
		int[] arr2 = new int[] {1, 2, 3, 4};
		
		System.out.println("arr1 의 길이 : " + arr1.length);
		System.out.println("arr2 의 길이 : " + arr2.length);
		
		System.out.println(arr1 == arr2);
		// arr1, arr2 값은 같지만 레퍼런스(참조) 변수이기 때문에 주소값이 같을 수는 없다.
	}
	
	public void method6() {
		
		String[] sArr = new String[5];
		
//		for (int i = 0; i < sArr.length; i++) {
//			// 참조 자료형 String의 JVM 이 부여 하는 초기값 : null
//			System.out.println(sArr[i]); 
//		}
		
		// 사용자에게 문자열을 입력받아 해당 인덱스에 사용자가 입력한 값 넣기 
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("과일 : ");
			sArr[i] = sc.nextLine();
		}
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void method7() {
		
		// 크기가 10인 정수형 배열을 만들고, 랜덤값(1~100)을 발생시켜서 담아서 출력
		
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	public void method8() {
		// 정수 배열 크기 5, 1 ~ 10 사이의 짝수 담기
		
		int[] iArr = new int[5];
		
		int num = 0;
		for (int i = 0; i < iArr.length; i++) {
//			iArr[i] = (i + 1) * 2;
			iArr[i] = num += 2;
		}
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr의 길이 : " + iArr.length); // 길이
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); // 주소값
		
//		iArr[5] = 12; // 배열의 index를 벗어나면 오류 발생 ArrayIndexOutOfBoundsException
		
		iArr = new int[10];
		
		System.out.println("====== 크기 변경 후 iArr ======");
		System.out.println("iArr의 길이 : " + iArr.length); // 길이
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); // 주소값
		
		iArr = null;
		
		System.out.println("====== 크기 변경 후 iArr ======");
		System.out.println("iArr의 길이 : " + iArr.length); // 길이
		System.out.println("iArr의 해쉬코드 : " + iArr.hashCode()); // 주소값
	}
}
