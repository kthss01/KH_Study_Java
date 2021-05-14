package com.kh.part01_object_vs_objectarray.run;

import com.kh.part01_object_vs_objectarray.model.vo.Product;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		
		// 제품을 담을 Product 객체 배열 할당 - 3개 제품을 받도록
		Product[] products = new Product[3];
		
		products[0] = new Product("갤럭시", "삼성", 300);
		products[1] = new Product("아이폰", "애플", 500);
		products[2] = new Product("옵티머스", "LG", 300);
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].information());
		}
		
	}

}
