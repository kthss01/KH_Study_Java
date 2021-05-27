package com.kh.collection.silsub2.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc;
	private BookManager bm; 

	public BookMenu() {
		sc = new Scanner(System.in);
		bm = new BookManager();		
	}

	public void mainMenu() {
		while (true) {

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");

			System.out.print("메뉴 번호 선택 : ");
			int select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				Book[] books = bm.sortedBookList();
				bm.printBookList(books);
				break;
			case 3:
				Book book = bm.deleteBook(inputBookNo());
				if (book == null) {
					System.out.println("삭제할 글이 존재하지 않음");
				} else {
					System.out.println("성공적으로 삭제");
				}
				break;
			case 4:
				String key = bm.searchBook(inputBookTitle());
				if (key == null) {
					System.out.println("조회할 글이 존재하지 않음");
				} else {
					System.out.println(bm.selectBook(key));
				}
				break;
			case 5:
				HashMap<String, Book> map = bm.selectAll();
				if (map.isEmpty()) {
					System.out.println("없습니다.");
				} else {
					Iterator<String> iter = map.keySet().iterator();

					while (iter.hasNext()) {
						System.out.println(map.get(iter.next()));
					}
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하였습니다 다시 입력해주세요.");
				break;
			}
		}
	}

	public Book inputBook() {
		System.out.print("도서 제목 : ");
		String title =  sc.nextLine();
		
		System.out.print("도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		return new Book(category, title, author);
	}

	public String inputBookNo() {
		System.out.print("도서 번호 : ");
		return sc.nextLine();
	}

	public String inputBookTitle() {
		System.out.print("도서 제목 : ");
		return sc.nextLine();
	}
}
