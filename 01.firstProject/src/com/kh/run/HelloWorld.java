package com.kh.run;

public class HelloWorld {
	// 주석 : 소스코드와는 무관한, 즉 코드로 인식안됨 --> 주로 코드에 대한 설명을 작성함
	/*전체주석*/ // 글을 적고 범위를 지정해서 컨트롤 + 시프트 + /
	
//	주석 하나만 컨트롤 + /
	
	/*
	 * 1 2 3
	 */
	
	// public : 메인 메소드는 외부에서 호출 할 수 있다.
	// static : 객체를 생성하지 않고도 실행 시킬 수 있다.
	// void : 반환값이 없을 때 사용
	// String[] args : 파라미터, 실행 명령어 외에 인자를 받을 수 있는데 스트링 배열로 들어간다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi~~~~");
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.print("안녕하세요 \n");
		System.out.print("반갑습니다.");
	}

}
