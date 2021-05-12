package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		
		// ------------ 1. Fieldtest1
		
		FieldTest1 f1 = new FieldTest1();
//		f1.test(20);
		
		// ------------ 2. Fieldtest2
		FieldTest2 f2 = new FieldTest2();
		// public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은 패키지내, 상속 구조에서만 접근 가능
		// --> 다른 패키지이면서 상속 구조가 아니기 때문에 접근 불가
//		System.out.println(f2.pro);
		System.out.println(f2.getPro()); // getter 메소드를 통해 값을 알아올 수 있다.
		
		// default
//		System.out.println(f2.def); --> 다른 패키지이기 때문에 접근 불가
		System.out.println(f2.getDef()); // getter 메소드를 통해 값을 알아올 수 있다.
		
		// 
//		System.out.println(f2.pri);
		System.out.println(f2.getPri()); // getter 메소드를 통해 값을 알아올 수 있다.
		
		// ------------ 3. Fieldtest3
		FieldTest3 f3 = new FieldTest3();
		
		// public static
//		System.out.println(f3.pubSta);
		System.out.println(FieldTest3.pubSta); // 객체 생성 필요 없이 바로 클래스명. 으로 접근이 가능함
		
		// private static
//		System.out.println(FieldTest3.priSta); // private 이기 때문에 바로 접근이 안된다
		System.out.println(FieldTest3.getPriSta());
		
		// ------------ 4. Fieldtest4
		System.out.println(FieldTest4.NUM); // 객체 생성 필요 없이 클래스명. 으로 접근이 가능함
		
		System.out.println(Math.PI);
	}

}
