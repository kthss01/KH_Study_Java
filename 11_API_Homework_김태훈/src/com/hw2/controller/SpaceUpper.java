package com.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {
	}
	
	public void spaceToUpper() {
		// 입력 받은 영문을 StringTokenizer와 StringBuilder를 사용 해
		// 띄어쓰기를 기준으로 띄어쓰기 이후 첫 영문자를 대문자로 출력하는 메소드
		
		Scanner sc = new Scanner(System.in);
		
		// 영문을 입력 받는다.
		System.out.println("영문을 입력하시오 (띄어쓰기 포함):");
		String str = sc.nextLine();
		
		// StringTokenizer를 통해 띄어쓰기를 기준으로 
		// 토큰 단위로 나온 것을 연산하는 메소드를 구성
		StringTokenizer st = new StringTokenizer(str);
		
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서
		// StringBuilder에 담아 출력
		
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			char ch = token.charAt(0);
			sb.append(Character.toUpperCase(ch))
				.append(token.substring(1).toLowerCase())
				.append(" ");
		}
		
		System.out.println(sb);
	}
}
