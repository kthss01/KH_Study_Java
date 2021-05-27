package com.hw3.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4572829268613223409L;

	private String title; // 도서명
	private String author; // 저자
	private int price; // 가격
	private Calendar dates; // 출판 날짜
	private double discount; // 할인율

	public Book() {
	}

	public Book(String title, String author, int price, Calendar dates, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getDates() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); 
		
		return sdf.format(dates.getTime()) + " 출간";
	}

	public double getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return title + " " + author + " " + price + " " + getDates() + " " + discount;
	}

}
