package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {
	/*
	 *  1. 컬렉션 프레임워크란?
	 *  	- java.util 패키지에 포함 됨
	 *  	- 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합
	 *  		(데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화(틀) 해 놓음)
	 *  
	 *  2. 배열의 단점과 컬렉션의 장점
	 *  	- 배열의 단점
	 *  	 a. 한번 크기를 지정하면 변경(x), 처음에 크기 지정(o)
	 *  	 b. 배열 중간에 추가, 삭제가 불편하다.
	 *  	 c. 한 타입만 저장 가능
	 *  
	 *  	- 컬렉션의 장점
	 *  	 a. 저장하는 크기의 제약이 없다.
	 *  	 b. 추가, 삭제, 정렬 등의 기능처리가 간단하다.
	 *  	 c. 여러 타입을 저장 가능 (기본 자료형은 Wrapper 클래스로써 저장 됨 : 객체만 저장 되기 때문)
	 */
	
	
	/*  List : 자료를 저장하는 구조 형태 중 순서가 유지되고 중복을 허용 하는 자료 구조 기법을 말한다 
	 *  자바에서는 ArrayList,Vector,LinkedList 등이있다 
	 *  이중 ArrayList 와 Vector 는 기능이 동일하나
	 *  Vector 는 ThreadSafe 기능이 있고  ArrayList는 ThreadSafe 기능이 없는 클래스이다
	 *  
	 *  ThreadSafe: 동시에 실행했을때 누가 먼저하라고 우선순위를 정해줌
	 */

	public static void main(String[] args) {

//		ArrayList a1 = new ArrayList();
//		Vector a1 = new Vector();
// 		LinkedList a1 = new LinkedList(); 
		// 앞뒤 링크마다 확인하며 저장하는 구조, 
		// 인접한 참조를 링크해서 체인처럼 관리하고 객체를 중간에 추가, 제거할 때 용이 
		List a1 = new ArrayList();
		
		// add() : ArrayList 데이터 추가
		// add 마우스 올리면 Object 타입으로 들어가는 것을 볼 수 있다.
		// 컬렉션은 객체 타입만 받아줌으로 기본 자료형을 추가하면 내부적으로 AutoBoxing에 의해 WrapperClass로 변형되어 객체로 들어간다.
		
		a1.add(true);
		a1.add("이효리");
		a1.add('여');
		a1.add(20);
		a1.add(new Date());
		
		// get(index) : ArrayList의 값 추출
		for (int i = 0; i < a1.size(); i++) {
			// size() : 배열의 length 와 같이 데이터의 크기 변환
			System.out.println("인덱스 " + i + "번째 a1 값 : " + a1.get(i));
		}
		
		// 오버라이딩 되어 있고 데이터를 []와 ,(쉼표)로 구분한 스트링형으로 반환해줌 (재정의되어 있음)
		System.out.println(a1.toString());
//		System.out.println(a1);
		
		// remove(인덱스) : 원하는 인덱스 번째 값을 삭제
		a1.remove(1);
		System.out.println("1번 인덱스 삭제 후 : " + a1);
		
		// add(매개변수 2개) : 중간에 값을 추가, 원하는 인덱스번째~
		a1.add(3, 37.85);
		System.out.println("3번 인덱스 값 추가 후 : " + a1);
		
		// set(인덱스, 변경할 값) : 원하는 인덱스 번째 값 수정
		a1.set(3, "abc");
		System.out.println("3번 인덱스 값 수정 후 : " + a1);
		
		System.out.println(a1.isEmpty()); // 비어있는 컬렉션인지 확인
		
		// indexOf(찾을 값) : 찾고자 하는 값의 인덱스 확인
		System.out.println(a1.indexOf("abc")); 
//		System.out.println(a1.indexOf("abcㅇ")); // 못찾으면 -1 반환
		
		// contains(찾을 값) : 찾을 값이 포함되어있는지 확인 (boolean)
		System.out.println(a1.contains('남')); // 찾을 값 있으면 true 없으면 false 반환
		
//		a1.clear(); // 지닌 값을 모두 지우기
//		a1.get(0); // 0 인덱스 자체가 존재하지 않아서 예외 발생, 저장할 크기가 0
		
		for (Object obj : a1) {
			if (obj instanceof String) {
				System.out.println((String) obj);
			}
		}
	}

}
