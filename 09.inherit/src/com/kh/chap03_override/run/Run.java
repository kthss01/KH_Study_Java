package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run {

	// 모든 클래스는 Object의 후손이다. 즉 최상위 클래스는 Object
	// Object에 있는 메소들은 모두 가져다 재정의 할 수 있다는 의미
	public static void main(String[] args) {
		
		Book bk1 = new Book("언어의 온도", "이기주", 20000);
		Book bk2 = new Book("나무", "베르나르베르베르", 20000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println(bk1.toString());
		// 출력문에 어떤 레퍼런스를 출력하고자 할 때 
		// JVM 이 자동으로 해당 레퍼런스.toString() 호출 해준다.
		System.out.println(bk1);
		// --> toString() 명시하지 않아도 알아서 호출됨.
		
		// 1. toString()
		// 오버라이딩 전 : Object 클래스의 toString()이 실행
		// --> 풀패키지명@해쉬코드 16진수 값 리턴
		// 오버라이딩 후 : Book 클래스에 있는 toString()이 실행
		// --> 내가 재정의 한데로 해당 객체가 가지고 있는 필드값에 대한 정보를 리턴
		
		// ----------------------- equals(), hashCode() ----------------
		
		// 2. equals()
		// 오버라이딩 전 : Object 클래스의 equals() 메소드 실행 --> 두 주소값 비교
		// 오버라이딩 후 : 두 객체의 주소값 비교가 아닌 실제 필드값들이 같은 경우 true를 반환하도록 재정의
		Book bk3 = new Book("언어의 온도", "이기주", 20000); // bk1과 동일한 필드값을 가진 bk3 객체 생성
		
		System.out.println("bk1과 bk3가 같은 책입니까? (==) " + (bk1 == bk3)); // false --> 주소값 비교 이기 때문에 
		System.out.println("bk1과 bk3가 같은 책입니까? (equals) " + (bk1.equals(bk3))); // false --> 주소값 비교 이기 때문에 
		
		// 동등 객체 : 실제 필드 값은 같지만 해쉬 코드가 다른 경우
		// 동일 객체 : 실제 필드 값도 같고 해쉬 코드 값도 같은 경우
		
		// 3. hashCode()
		// 오버라이딩 전 : Object 클래스의 hashCode() 메소드 실행 --> 해당 객체의 실제 주소값을 10진수로 계산한 결과
		// 오버라이딩 후 : 두 객체의 실제 주소 값을 가지고 작업하지 않고 두 객체의 실제 멤버 값들이 같은 해쉬 코드 값이 나오도록 재정의
		
		System.out.println("bk1의 hashCode : " + bk1.hashCode());
		System.out.println("bk2의 hashCode : " + bk2.hashCode());
		System.out.println("bk3의 hashCode : " + bk3.hashCode());
		
	}
}
