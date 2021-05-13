package com.kh.chap08_mvc.view;

import java.util.Scanner;

import com.kh.chap08_mvc.controller.ProductController;

// mvc 패턴 중 view 패키지 : 사용자가 보게될 화면을 담당하는 부분,
// 사용자가 보는 (print 구문) 반드시 view 패키지 내에서만 작성

public class ProductMenu {
	// 입력하기 위한 Scanner 객체를 전역변수로 미리 생성해놓기
	private Scanner sc = new Scanner(System.in);
	// 사용자가 키보드로 값을 입력하고 어떤 기능을 요청하는 경우 
	// 해당 클래스에서 처리하는 것이 아니라 Controller에서 처리
	private ProductController pc = new ProductController();
	
	public void mainMenu() {
		System.out.println("제품명 : ");
		String name = sc.nextLine();
		
		System.out.println("브랜드명 : ");
		String brand = sc.nextLine();
		
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		pc.insertProduct(name, brand, price);
		
//		int i = 0;
		while (true) {
			System.out.println("========= 메인 메뉴 =========");
			System.out.println("1.제품 정보 조회");
			System.out.println("2.제품 정보 수정");
			System.out.println("9.프로그램 종료");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				System.out.println(pc.selectProduct().information());
				break;
				
			case 2:
				updatePrice();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("메뉴를 다시 선택 해주세요.");
				break;
			}
		}
	}

	private void updatePrice() {
		System.out.println("수정할 가격을 입력해주세요");
		int nPrice = sc.nextInt();
		pc.updatePrice(nPrice);
	}
}
