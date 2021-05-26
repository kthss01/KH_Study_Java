package com.kh.collection.silsub1.model.comparator;

import java.util.Comparator;

import com.kh.collection.silsub1.model.vo.Board;

public class DescBoardTitle implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		return o2.getBoardTitle().compareTo(o1.getBoardTitle());
	}

}
