package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {
		FileCharTest fc = new FileCharTest();
		fc.fileSave();
		fc.fileOpen();
	}

}
