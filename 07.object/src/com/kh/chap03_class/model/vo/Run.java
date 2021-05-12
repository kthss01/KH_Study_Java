package com.kh.chap03_class.model.vo;

import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		Person person = new Person(); // 같은 패키지이기 때문에 import 해주지 않아도 됨
		
		person.setId("user01");
		person.setPwd("pass01");
		person.setName("이효리");
		person.setAge(29);
		person.setGender('F');
		person.setPhone("010-1111-2222");
		person.setEmail("lee@iei.or.kr");
		
		System.out.println(person.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 이름 : ");
		
		String name = sc.nextLine();
		person.setName(name);
		
		System.out.println(person.information());
		
		Product p1 = new Product();
		p1.setpName("Galaxy");
		p1.setBrand("Samsung");
		p1.setPrice(600);
		
		Product p2 = new Product();
		p2.setpName("iPhone");
		p2.setBrand("Apple");
		p2.setPrice(900);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		DftProduct d = new DftProduct(); // 같은 패키지라서 가능
	}

}
