package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Person person = new Person();
		
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
		p1.setBrand("Samsung");
		p1.setpName("Galaxy");
		p1.setPrice(600);
		
		Product p2 = new Product();
		p2.setBrand("Apple");
		p2.setpName("IPhone");
		p2.setPrice(900);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		
//		DftProduct d = new DftProduct(); // 다른 패키지 라서 에러
	}

}
