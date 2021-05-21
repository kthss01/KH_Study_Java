package com.kh.myExecption.run;

import java.util.Scanner;

import com.kh.myExecption.exception.MyException;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		
		try {
			checkNum(num);
		} catch (Exception e) {
			e.printStackTrace();
		} // 예외 처리
	}

	// checkNum
	// 10보다 작은 수일 경우 : MyException("10 보다 작은 수입니다") 발생 시킴
	// 아닌 경우 : 출력 메소드 (10보다 크거나 같은 수구나 !)
	
	private static void checkNum(int num) throws Exception {
		if (num < 10) {
			throw new MyException("10 보다 작은 수 입니다 ");
		} else {
			System.out.println("10보다 크거나 같은 수구나 !");
		}
	}
	

}
