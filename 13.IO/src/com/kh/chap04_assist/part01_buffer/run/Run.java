package com.kh.chap04_assist.part01_buffer.run;

import com.kh.chap04_assist.part01_buffer.model.dao.BufferedTest;

public class Run {

	public static void main(String[] args) {
		BufferedTest bt = new BufferedTest();
		bt.fileSave();
		bt.fileOpen();
	}

}
