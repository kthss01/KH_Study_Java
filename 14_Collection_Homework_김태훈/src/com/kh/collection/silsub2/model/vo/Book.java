package com.kh.collection.silsub2.model.vo;

public class Book implements Comparable<Book> {

	private String bNo; // 도서 번호
	private int category; // 장르 분류 번호
	private String title; // 도서 제목
	private String author; // 도서 저자

	public Book() {
	}

	public Book(int category, String title, String author) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
	}

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "bNo : " + bNo + ", category : " + category + ", title : " + title + ", author : " + author;
	}

	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}

}
