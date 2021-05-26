package com.kh.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.collection.silsub1.model.comparator.AscBoardDate;
import com.kh.collection.silsub1.model.comparator.AscBoardNo;
import com.kh.collection.silsub1.model.comparator.AscBoardTitle;
import com.kh.collection.silsub1.model.comparator.DescBoardDate;
import com.kh.collection.silsub1.model.comparator.DescBoardNo;
import com.kh.collection.silsub1.model.comparator.DescBoardTitle;
import com.kh.collection.silsub1.model.dao.BoardDao;
import com.kh.collection.silsub1.model.vo.Board;

public class BoardManager {

	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);

	public BoardManager() {

	}

	public void writeBoard() {

		System.out.println("새 게시글 쓰기 입니다.");

		System.out.print("글 제목 : ");
		String title = sc.nextLine();

		System.out.print("작성자 : ");
		String writer = sc.nextLine();

		// 작성날짜는 현재 날짜로 처리
		Date date = new Date();

		System.out.print("글 내용 : ");
		StringBuilder sb = new StringBuilder();

		while (true) {
			String temp = sc.nextLine();

			if (temp.equals("exit")) {
				break;
			}

			sb.append(temp).append("\n");
		}

		// 파일이 존재하지 않을 경우, 즉 첫 글 등록일 경우 예외 발생
		// 어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결
		int lastNo = 0;
		try {
			lastNo = bd.getLastBoardNo();

		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); 
			// 첫 게시글이라 list에 하나도 없는데 마지막 게시글을 찾아서 
			// ArrayIndexOutOfBoundsExceptions 발생 
			lastNo = 0;
		}

		bd.writeBoard(new Board(lastNo + 1, title, writer, date, sb.toString(), 0));

	}

	public void displayAllList() {
		ArrayList<Board> list = bd.displayAllList();

		Iterator<Board> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void displayBoard() {

		System.out.print("조회할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board != null) {
			// 해당 글 번호의 게시글 전달 받아 출력
			System.out.println(board);

			// 조회수 올리기 위해 BoardDao의 upReadCount() 메소드에 해당 글 번호 전달
			bd.upReadCount(no);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}

	}

	public void modifyTitle() {

		System.out.print("수정할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board != null) {
			// 해당 글 번호의 게시글 전달 받아 출력
			System.out.println(board);

			System.out.print("변경할 글 제목 : ");
			String title = sc.nextLine();

			bd.modifyTitle(no, title);

		} else {
			System.out.println("조회된 글이 없습니다.");
		}

	}

	public void modifyContent() {

		System.out.print("수정할 글 번호 : ");
		int no = sc.nextInt();

		Board board = bd.displayBoard(no);
		if (board != null) {
			// 해당 글 번호의 게시글 전달 받아 출력
			System.out.println(board);

			System.out.print("변경할 글 내용 : ");
			StringBuilder sb = new StringBuilder();

			while (true) {
				String temp = sc.nextLine();

				if (temp.equals("exit")) {
					break;
				}

				sb.append(temp).append("\n");
			}

			bd.modifyContent(no, sb.toString());

		} else {
			System.out.println("조회된 글이 없습니다.");
		}

	}

	public void deleteBoard() {

		System.out.print("삭제할 글 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();

		Board board = bd.displayBoard(no);
		if (board != null) {
			// 해당 글 번호의 게시글 전달 받아 출력
			System.out.println(board);

			System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
			String select = sc.nextLine();

			if (select.toUpperCase().equals("Y")) {
				bd.deleteBoard(no);
			}

		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	}

	public void searchBoard() {

		System.out.print("검색할 제목 : ");
		String title = sc.nextLine();

		ArrayList<Board> list = bd.searchBoard(title);

		if (list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
//			System.out.println(list);
			for (Board board : list) {
				System.out.println(board);
			}
		}
	}

	public void saveListFile() {
		bd.saveListFile();
	}

	public void sortList(int item, boolean isDesc) {

		ArrayList<Board> list = bd.displayAllList();

		switch (item) {
		case 1:
			if (isDesc == false) {
				list.sort(new AscBoardNo());
			} else {
				list.sort(new DescBoardNo());
			}
			break;
		case 2:
			if (isDesc == false) {
				list.sort(new AscBoardDate());
			} else {
				list.sort(new DescBoardDate());
			}
			break;
		case 3:
			if (isDesc == false) {
				list.sort(new AscBoardTitle());
			} else {
				list.sort(new DescBoardTitle());
			}
			break;

		default:
			break;
		}

	}
}
