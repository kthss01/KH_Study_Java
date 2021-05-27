package com.kh.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.kh.collection.silsub2.model.dao.BookDao;
import com.kh.collection.silsub2.model.vo.Book;

public class BookManager {

	private BookDao bd;
	private Scanner sc;

	public BookManager() {
		bd = new BookDao();
		sc = new Scanner(System.in);
	}

	public void addBook(Book book) {
		int bookNo = bd.getLastBookNo();

		book.setbNo(String.valueOf(bookNo + 1));

		bd.addBook(book);
	}

	public Book deleteBook(String key) {
		return bd.deleteBook(key);
	}

	public String searchBook(String title) {
		return bd.serachBook(title);
	}

	public Book selectBook(String key) {
		return bd.selectBook(key);
	}

	public HashMap<String, Book> selectAll() {
		return bd.selectAll();
	}

	public Book[] sortedBookList() {
		ArrayList<Book> books = bd.sortedBookList();

//		return (Book[]) books.toArray(); // 이렇게 해버리면 문제 발생한다고 함  ClassCastException
		// 사유 
		// Object가 부모 클래스이고 자식이 String 클래스인데 상위 클래스에서 하위 클래스로 캐스팅이 되지 않기 때문에 발생하는 문제라고함
		// int double은 자료형 변환이라 가능하지만 클래스이 캐스팅에선 안됨
		
		return books.toArray(new Book[books.size()]); // 이와 같은 방법으로  해결 가능
//		return books.stream().toArray(Book[]::new); // 이 방법도 있긴함
		
	}

	public void printBookList(Book[] br) {

		for (Book book : br) {
			System.out.println(book);
		}

	}
}
