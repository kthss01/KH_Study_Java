package com.kh.chap04_assist.part01_object.run;

import com.kh.chap04_assist.part01_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part01_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
//		od.fileSave();
//		od.fileOpen();
		
		ObjectsDao od2 = new ObjectsDao();
		od2.fileSave();
		od2.fileOpen();
	}

}
