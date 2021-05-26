package com.kh.collection.silsub1.model.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

import com.kh.collection.silsub1.model.vo.Board;

public class BoardDao {

	private ArrayList<Board> list = new ArrayList<Board>();

	public BoardDao() {
		
		// test 
//		int count = 0;	
//		list.add(new Board(count++, "아제목", "가씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "가제목", "아씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "라제목", "마씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "다제목", "바씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "바제목", "다씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "나제목", "사씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "사제목", "나씨", new Date(), "Content", 0));
//		list.add(new Board(count++, "마제목", "라씨", new Date(), "Content", 0));
		
	}

	public int getLastBoardNo() {
		// 게시글의 마지막 번호 리턴
		return list.get(list.size() - 1).getBoardNo();
	}

	public void writeBoard(Board board) {
		// 전달받은 게시글을 list에 추가
		list.add(board);
	}

	public ArrayList<Board> displayAllList() {
		// 게시글 전체 list를 리턴
		return list;
	}

	public Board displayBoard(int no) {
		if (list.isEmpty() || no >= list.size())
			return null;

		// 전달받은 글 번호와 일치하는 게시글 리턴
		return list.get(no);
	}

	public void upReadCount(int no) {
		// 전달받은 글 번호와 일치하는 게시글의 조회수 1 올려주기
		int readCount = list.get(no).getReadCount();
		list.get(no).setReadCount(readCount + 1);
	}

	public void modifyTitle(int no, String title) {
		// 전달받은 글 번호와 일치하는 게시글의 내용 수정
		list.get(no).setBoardTitle(title);
	}

	public void modifyContent(int no, String content) {
		// 전달받은 글 번호와 일치하는 게시글의 내용 수정
		list.get(no).setBoardContent(content);
	}

	public void deleteBoard(int no) {
		// 전달받은 글 번호와 일치하는 게시글 삭제
		list.remove(no);
	}

	public ArrayList<Board> searchBoard(String title) {
		// 전달받은 제목이 포함되어잇는 게시글들 list 리턴

		ArrayList<Board> result = new ArrayList<Board>();

		for (Board board : list) {
			if (board.getBoardTitle().contains(title)) {
				result.add(board);
			}
		}

		return result;
	}

	public void saveListFile() {
		// board_list.dat 파일 저장하기

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {

			for (Board board : list) {
				oos.writeObject(board);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
