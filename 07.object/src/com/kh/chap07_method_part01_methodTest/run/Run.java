package com.kh.chap07_method_part01_methodTest.run;

import com.kh.chap06_constructor.model.vo.User;
import com.kh.chap07_method_part01_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method_part01_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		
		//----------------NonStaticMethod Test--------------
		NonStaticMethod nsm = new NonStaticMethod();
		
		// 1.매개변수도 없고 반환값도 없는 메소드 호출
		nsm.method1();
		
		// 2.매개변수 없고 반환값은 있는 메소드 호출
		// --> 반환되는 값을 기록하기 위한 변수를 작성해서 받아주자
		String str = nsm.method2();
		System.out.println(str);
		
		// 3. 매개변수 있고 반환값이 없는 메소드
		// 반드시 전달되는 값은 매개변수의 타입과 순서,갯수가 일치하는 값을 넣어주자
		nsm.method3(10, 20);
		
		// 4. 매개변수 있고 반환값도 있는 메소드
		int result = nsm.method4(10, 40);
		System.out.println(result);
		
		User u1 = new User("user01", "pass01", "김남길");
		System.out.println(u1.information());
		
		nsm.method(u1);
		System.out.println(u1.information());
		
		//----------------StaticMethod Test-----------------
		
		// 객체 생성할 필요 없음 --> 이미 프로그램 시작시 메모리에 올라가있다.
		// 클래스명.메소드명([매개변수]);
		
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("전지현");
		System.out.println(StaticMethod.method4("유야호"));
		
	}

}
