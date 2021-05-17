package com.kh.chap01_before_vs_after.after.model.vo;

public class Desktop extends Product {

	private boolean allInOne;

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		// super() 생성자는 자식생성자에서 부모생성자를 호출하여 사용,
		// 생성자로 접근은 반드시 첫 줄에 작성

//		super.pCode = pCode; 
		// 직접 접근일 때는 부모 필드의 접근 제어자가 protected여야 한다
		// (접근 하고자 하는 필드가 private 일 때는 접근 불가)
		// super. 의 super는 해당 객체의 부모 주소를 담고 있다.
		// 따라서 super. 으로 접근 가능

		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
	
	@Override
	public void print() {
//		super.print();
		System.out.println("Desktop");
	}
	
}
