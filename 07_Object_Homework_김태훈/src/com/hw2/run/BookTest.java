package com.hw2.run;

import com.hw2.model.vo.Book; // ctrl + shift + o 까먹지말자

public class BookTest {
	
	public static void main(String[] args) {
		
		/*
		 * 기본 생성자, 매개 변수 생성자를 이용하여 2개의 객체 생성 후 출력
		 * setter 메소드를 첫 번째 객체 값 수정 후 출력
		 * getter 메소드를 이용하여 할인율을 적용한 책 가격 출력
		 */
		
		// 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		Book b1 = new Book();
		
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("=====================================================");
		
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		// 수정된 내용 출력 확인
		System.out.println(b1.information());
		System.out.println("=====================================================");
		
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 - (가격 * 할인율)
		System.out.printf("도서명 = %s\n", b1.getTitle());
		int discountPrice = b1.getPrice() - (int) (b1.getPrice() * b1.getDiscountRate());
		System.out.printf("할인된 가격 = %d\n", discountPrice);
		
		System.out.printf("도서명 = %s\n", b2.getTitle());
		discountPrice = b2.getPrice() - (int) (b2.getPrice() * b2.getDiscountRate());
		System.out.printf("할인된 가격 = %d\n", discountPrice);
	}
}
