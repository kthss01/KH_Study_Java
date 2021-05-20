package com.kh.chap02_stringBuffer_stringBuilder.run;

public class Run {

	public static void main(String[] args) {
		// String 클래스의 원리
		// String a 값에 계속 값을 더해가는 경우 새로운 String 클래스가 만들어진다.
		
		// StringBuffer 나 StringBuilder의 원리
		
		// 새로운 객체를 생성시키지 않고, 기존에 있는 객체의 크기를 증가시키면서 값을 더한다.
		// * 응답시간
		// String > StringBuffer > StringBuilder
		// * 메모리
		// String > StringBuffer == StringBuilder
		
//		method1();
//		method2();
		method3();
	}

	private static void method3() {
		StringBuilder sb = new StringBuilder("난 ");
		
		// append : 뒤에 값 추가
		sb.append("배가 고프다").append("!!!!!!!"); // 메소드 체이닝
		
		System.out.println(sb);
		System.out.println(sb.capacity()); // 16 + 1
		System.out.println(sb.length());
		
		// insert : 삽입
		sb.insert(1, " 저녁시간 전이라~ ");
		System.out.println(sb);
		
		// delete : 삭제
		sb.delete(1, 11); // start는 포함 end는 포함되지 않음
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

	private static void method2() {
		String str = "반가워";
		
		System.out.println("str 기존 : " + str + " |주소 : " + System.identityHashCode(str));
		str += "난 스트링이라고 해";
		System.out.println("str 변경 : " + str + " |주소 : " + System.identityHashCode(str));
		
		StringBuffer sbf = new StringBuffer("안녕~~");
		System.out.println("sbf 기존 : " + sbf + " |주소 : " + System.identityHashCode(sbf));
		sbf.append("난 스트링 버퍼야");
		System.out.println("sbf 변경 : " + sbf + " |주소 : " + System.identityHashCode(sbf));
		
		StringBuilder sb = new StringBuilder("Wow");
		System.out.println("sb 기존 : " + sb + " |주소 : " + System.identityHashCode(sb));
		sb.append("난 스트링 빌더야");
		System.out.println("sb 변경 : " + sb + " |주소 : " + System.identityHashCode(sb));
	}

	private static void method1() {
		StringBuilder sb = new StringBuilder("환불원정대");
		
		System.out.println(sb.capacity()); // 21 16 + 5
		// sb의 크기 기본이 16 + 글자 길이만큼 5
		System.out.println(sb.length());
		// sb 안에 있는 문자열의 크기
		
		StringBuilder sb1 = new StringBuilder(20); // 크기 지정
		// 기본 메모리 확보 크기를 정해서 객체를 생성할 수도 있음.
		System.out.println(sb1.capacity());
		
		
	}

}
