package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/* 
	 * 배열의 복사
	 * - 얕은 복사 : 배열의 주소만을 복사
	 * - 깊은 복사 : 동일한 배열을 하나 더 생성해서 실제 내부 값을 복사
	 */
	
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		
		// 복사본
		
		int[] copy = origin;
		
		// 잘 복사되었는지 확인
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		
		System.out.println("----------- 복사본 배열 변경 후 출력");
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		/*
		 * copy 배열의 2번 인덱스 값만 변경했는데 원본 배열의 값까지 변경된 것을 확인할 수 있다.
		 * 이유는 같은 곳을 참조하고 있기 때문에 (즉, 같은 주소값)
		 * 
		 * copy 라는 배열에 origin 주소값을 넣어줬다.
		 * 이것이 얕은 복사이다.
		 * 
		 */
		
	}
	
	public void method2() {
		
		/*
		 * 깊은 복사
		 * 1. for문 방법
		 * 새로운 배열을 생성해서 반복문을 통해서 실제값을 넣어주는 방법
		 */
		
		
		// 				0  1  2  3 	4 <- index
		int[] origin = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		int[] copy = new int[5]; // 크기가 5인 빈 배열을 만듬. 현재 다 0으로 초기화
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("복사본 배열 출력");
		// 잘 복사되었는지 확인
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		
		System.out.println("----------- 복사본 배열 변경 후 출력");
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	public void method3() {
		// 2. 새로운 배열을 생성하고 System클래서에서의 arraycopy() 메소드를 이용한 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10];
		
//		System.arraycopy(원본 배열명, 복사 시작할 인덱스, 복사본 배열명, 복사본 배열의 시작 인덱스, 복사 길이);
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 길이 : " + origin.length);
		System.out.println("copy 길이 : " + copy.length);
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		// 다른 주소값을 가지고 있기 때문에 배열 수정시 서로 영향을 받지 않는다.
		System.out.println("copy 주소값 : " + copy.hashCode()); 
	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 사용
		// Arrays 클래스는 배열을 이용할 때 유용한 메소드를 모아 놓은 클래스
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본 배열, 복사할 길이 (원본보다 길어도됨, 길면 자동으로 0으로 초기화되어 들어감))
		int[] copy = Arrays.copyOf(origin, 8);
		
		/*
		 * Arrays.copyOf() 
		 * 	--> 내가 지정한 길이만큼 무조건 크기가 할당.
		 * 		그리고 내가 지정한 길이가 복사하고자 하는 길이보다 클 경우 
		 * 		기존 배열에 있는 내용 다 복사
		 * 		하지만 내가 지정한 길이가 복사하고자 하는 길이보다 작을 경우
		 * 		기존 배열에서 내가 지정한 길이만큼만 복사 
		 */
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin 길이 : " + origin.length);
		System.out.println("copy 길이 : " + copy.length);
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		// 다른 주소값을 가지고 있기 때문에 배열 수정시 서로 영향을 받지 않는다.
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		/*
		 * System.arraycopy() 메소드는 
		 * 	내가 복사하고자 할 때 인덱스와 갯수를 지정하고 싶을 때 사용,
		 * 	복사본 배열의 크기가 그대로 유지
		 * 
		 * Array.copyOf() 메소드는
		 * 	내가 복사하고자 하는 것을 복사하고 크기도 다시 지정하고 싶을 때 사용
		 */
	}

	public void method5() {
		// 4. clone() 메소드를 이용한 복사
		// 시작 인덱스 지정 안됨, 원본 배열을 통째로 복사해서 새로울 배열 할당
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
				
		System.out.println("origin 주소값 : " + origin.hashCode());
		// 다른 주소값을 가지고 있기 때문에 배열 수정시 서로 영향을 받지 않는다.
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
}
