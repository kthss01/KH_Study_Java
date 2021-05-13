package com.kh.chap08_mvc.controller;

import com.kh.chap08_mvc.model.vo.Product;

// controller : 사용자 요청에 의해서 서버 호출 전 파라미터 셋팅 
// (서비스 단은 일단 생략, 현재 비즈니스 로직 (데이터 수정, 가공, 처리)만 구현

public class ProductController {

	private Product pro = null; 
	
	public void insertProduct(String name, String brand, int price) {
		pro = new Product(name, brand, price);
	}

	public Product selectProduct() {
		return pro;
	}

	public void updatePrice(int nPrice) {
		pro.setPrice(nPrice);
	}

}
