package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap;
	
	public BookDao() {
		bookMap = new HashMap<String, Book>();
	}

	public BookDao(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}
	
	public int getLastBookNo() {
		Iterator<String> iter = bookMap.keySet().iterator();
		
		int lastBookNo = 0;
		
		while (iter.hasNext()) {
			lastBookNo = Integer.valueOf(((Book)bookMap.get(iter.next())).getbNo());
		}
		
		return lastBookNo;
	}
	
	public void addBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}
	
	public Book deleteBook(String key) {
		return bookMap.remove(key);
	}
	
	public String serachBook(String title) {
		
		Iterator<String> iter = bookMap.keySet().iterator();
		
		String result = null;
		
		while (iter.hasNext()) {
			String key = iter.next();
			Book book = bookMap.get(key);
			
			if (book.getTitle().contains(title)) {
				result = key;
				break;
			}
		}
		
		return result;
	}
	
	public Book selectBook(String key) {
		return bookMap.get(key);
	}
	
	public HashMap<String, Book> selectAll() {
		return bookMap;
	}
	
	public ArrayList<Book> sortedBookList() {
		ArrayList<Book> list = new ArrayList<Book>(bookMap.values());
		Collections.sort(list);
		return list;
	}
}
