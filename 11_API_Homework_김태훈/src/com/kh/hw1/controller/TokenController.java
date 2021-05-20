package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		// 공백을 토큰으로 처리 한 글자 반환
		
		StringTokenizer st = new StringTokenizer(str);
		
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		return sb.toString();
	}

	public String firstCap(String str) {
		// 매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
		
		String result = str.substring(1);
		
		result = Character.toUpperCase(str.charAt(0)) + result;
		
		return result;
	}

	public int findChar(String str, char ch) {
		// 매개변수로 받은 문자열 중에서 매개변수로 들어온 문자가 몇 개 존재하는지 개수를 반환
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		
		return count;
	}

}
