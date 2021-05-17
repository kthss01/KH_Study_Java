package com.kh.chap03_override.model.vo;

import java.util.Objects;

public class Book /* extend Object */ {

	private String title;
	private String author;
	private int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

	// 1. Object 클래스의 toString() 메소드 오버라이딩
	@Override
	public String toString() {
		return "toString() --> title : " + title + ", author : " + author + ", price : " + price;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((author == null) ? 0 : author.hashCode());
//		result = prime * result + price;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		if (author == null) {
//			if (other.author != null)
//				return false;
//		} else if (!author.equals(other.author))
//			return false;
//		if (price != other.price)
//			return false;
//		if (title == null) {
//			if (other.title != null)
//				return false;
//		} else if (!title.equals(other.title))
//			return false;
//		return true;
//	}

	// 2. equals 메소드의 내용을 주소값 비교가 아닌 실제 필드값들이 모두 같을 경우 true 반환되고
	// 하나라도 틀릴 경우 false가 되도록 재정의하자
	
	@Override
	public boolean equals(Object obj) {
		// bk1.equals(bk2)
		// this : 현재 객체		obj : 전달 받은 비교 대상
		// 자료형 : Book		Object
		
		if (!(obj instanceof Book))
			return false;
		
		Book other = (Book) obj; 
		// obj 타입을 Book 타입으로 강제 형변환, 상속 구조에서는 클래스로 형변환이 가능하다.
		// this : 현재 객체		other : 전달 받은 비교 대상
		// 자료형 : Book		Book
		
		if (this.title.equals(other.title) 
				&& this.author.equals(other.author)
				&& this.price == other.price) {
			return true;
		} else {
			return false;
		}
	}

	// 3. 해쉬코드
	
	@Override
	public int hashCode() {
		// 1. 해당 객체의 필드값을 하나의 문자열로 합쳐서 그 해당 문자열의 해쉬코드 리턴
		// title + author + price ---> 문자열 (String) 이 된다.
		// 즉, 같은 문자열일 경우 해당 문자열의 hashCode 는 같도록 String에서 이미 재정의
//		return (title + author + price).hashCode();
		
		// 2. 
		// Objects.hash는 주어진 값들을 이용해서 코드를 생성하는 역할
		// 주어진 매개값들로 배열을 생성하고 
		// Arrays.hashCode(Object[])를 호출해서 해쉬코드를 얻고 이 값을 리턴
		return Objects.hash(title, author, price);
	}
	
	// 오버라이딩
	// - 자식클래스가 상속받은 부모 클래스의 메소드를 재정의(재작성) 하는 것
	// - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미를 자식 객체를 통해 실행시 자식 메소드가 우선권을 가진다
	
	// 오버라이딩 성립조건
	// - 부모클래스의 메소드와 메소드 명 동일
	// - 매개변수 갯수, 자료형, 순서동일
	// - 반환형 동일
	// - 부모 메소드의 접근 제한자보다 범위가 같거나 커야한다.
	// ex) 부모메소드의 접근 제한자가  protected 일 경우에 오버라이딩 하는 메소드의 접근 제한자는 protected, public
	
	// @Override (annotation)
	// - 명시를 안해줘도 크게 상관이 없다 (명시를 안해줘도 오버라이딩 된 상태)
	// - 붙이는 이유 : 찾아보기 쉽다. (오버라이딩 된 메소드임을 표시)
	
}
