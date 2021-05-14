package com.kh.part02_personMVC.view;

import java.util.Scanner;

import com.kh.part02_personMVC.controller.PersonController;
import com.kh.part02_personMVC.model.vo.Person;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1.회원 추가");
			System.out.println("2.회원 전체 조회");
			System.out.println("3.회원 이름 검색");
			System.out.println("4.회원 평균 재산 조회");
			System.out.println("9.프로그램 종료");
			
			System.out.println("메뉴 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertPerson();
				break;
			case 2:
				printPerson();
				break;
			case 3:
				searchPerson();
				break;
			case 4:
				System.out.println("평균 재산 : " + pc.avgWealth());
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				break;
			}
		}
	}

	private void searchPerson() {
		System.out.println("=== 사원 정보 검색 ===");
		
		System.out.println("검색할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search);
		
		if (searchPerson == null) {
			System.out.println("검색된 사원이 없습니다.");
		} else {
			System.out.println(searchPerson.information());
		}
	}

	private void printPerson() {
		System.out.println("=== 사원 정보 조회 ===");
		
		int cnt = pc.getCount(); // 현재 회원 수
		
		if (cnt == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
		} else {
			Person[] peo = pc.getPeople();
			
			for (int i = 0; i < cnt; i++) {
				System.out.println(peo[i].information());
			}
			
			// foreach 문
//			for (Person person : peo) {
//				System.out.println(person.information());
//			}
		}
	}

	private void insertPerson() {
		System.out.println("=== 사원 정보 입력 ===");
		
		System.out.println("이름 : ");
		String name = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		boolean check = pc.insertPerson(name, age, wealth);
		if (!check) {
			System.out.println("더이상 추가할 수 없습니다.");
		}
	}
}
