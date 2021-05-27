package com.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.hw3.model.vo.Book;

public class BookManager {

	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {
	}
	
	public void fileSave() {
		
		Book[] bk = new Book[5]; // Book 객체를 받을 객체 배열
		
		// 객체 배열을 3번의 사용 데이터로 초기화
		// 출판 날짜는 아래 setCalendar 메소드를 활용
		
		int count = 0;
		bk[count++] = new Book("C언어", "김씨", 10000, setCalendar(2012, 2, 2), 0.1);
		bk[count++] = new Book("자바", "이씨", 20000, setCalendar(2013, 3, 3), 0.2);
		bk[count++] = new Book("C++", "박씨", 30000, setCalendar(2014, 4, 4), 0.3);
		bk[count++] = new Book("넛지", "서씨", 40000, setCalendar(2015, 5, 5), 0.4);
		bk[count++] = new Book("개미", "최씨", 50000, setCalendar(2016, 6, 6), 0.5);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {

			for (Book book : bk) {
				oos.writeObject(book);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Calendar setCalendar(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		return cal;
	}
	
	public void fileRead() {
		
		Book[] readBook = new Book[10];
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			
			int i = 0;
			while (true) {
				readBook[i] = (Book) ois.readObject();
				System.out.println(readBook[i]);
				i++;
			}
			
		} catch (EOFException e) {
			System.out.println("books.dat 읽기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
