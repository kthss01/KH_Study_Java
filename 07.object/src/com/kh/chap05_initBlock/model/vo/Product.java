package com.kh.chap05_initBlock.model.vo;

public class Product {

	// 인스턴스 변수
	// 1. 아무 초기화 없이 Product 객체를 생성하여 출력시 JVM 정한 기본값으로 초기화 되어 있음
	
//	private String pName;
//	private int price;
//	private static String brand;

	// 2. 필드에 명시적 초기화 한 후 객체 생성하여 출력
	private String pName = "갤럭시";
	private int price = 900000;
	private static String brand = "삼성";
	
	// 3. static 블록 - 클래스 변수를 초기화 시키는 블럭으로 프로그램 시작 시 한번만 초기화, 클래스 초기화
	static {
//		pName = "갤럭시1"; -> static 블럭에서는 인스턴스 변수를 초기화 하지 못함
//		price = 1000000;
		brand = "엘지";
	}
	
	// 4. 인스턴스 블록 - 인스턴스 변수를 초기화 시키는 블럭으로 객체 생성시 마다 초기화 된다. 생성자보다 먼저 실행됨
	{
		pName = "갤럭시1";
		price = 100000000;
		
//		brand = "애플"; 
		// --> 인스턴스 블럭에서는 static 필드도 초기화 할 수 있지만 
		// static 초기화 블럭은 프로그램 시작시에 초기화 하기 때문에
		// 객체 생성 이후에 초기화 하는 인스턴스 초기화 블럭의 값으로 덮어 쓰게 된다.
	}
	
	public Product() {
//		pName = "갤럭시2"; // 매개변수가 있는 생성자로 보통 초기화 해줌
		
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setBrand(String brand) {
		Product.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}
	
	public String information() {
		return pName + " " + price + " " + brand;
	}
}


