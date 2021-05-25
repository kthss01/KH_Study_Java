package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		// file : 파일을 제어하기 위한 클래스로 입출력 기능을 제공하지 않는다.
		// - 파일의 입출력은 스트림을 사용해야한다.
		
		try {
			// 1. 경로 지정을 하지 않으면 현재 project 폴더에 생성이 됨
			// 이렇게한다고 파일이 생성되는 건 아님, 메모리 상에 존재, 객체로 있는 상태
			File f1 = new File("test.txt"); 
//			f1.createNewFile();
			
			// 2. 존재하는 기본 드라이브나 폴더에 파일 생성
			// C 드라이브에서는 파일을 바로 생성할 수 없음
			// 이 경우 폴더 만들고 생성해야함
			File f2 = new File("D:\\test.txt"); 
//			File f2 = new File("D:\\hello\\test.txt"); // 폴더 자동으로 만들어주진 않음 
			f2.createNewFile();
			
//			File f3 = new File("C:\\test\\test.txt"); // 폴더 생성이 바로 안됨 IOException 발생
//			f3.createNewFile();
			
			File testFolder = new File("C:\\test");
			testFolder.mkdir(); // 폴더 생성
			
			File f3 = new File("C:\\test\\test.txt"); // 폴더 생성이 바로 안됨 IOException 발생
			f3.createNewFile();
			
			System.out.println(f3.exists()); // 존재 여부 확인
			System.out.println(f1.exists());
			System.out.println(testFolder.exists());
			
			System.out.println(f3.isFile());
			System.out.println(testFolder.isFile()); // 폴더이기 때문에 false
			
			File folder = new File("parent");
			folder.mkdir(); // 디렉토리 생성
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath()); // 최상위경로부터 내파일이 있는 경로까지 모두 나타낸 것
			System.out.println("상대경로 : " + file.getPath());
			System.out.println("파일용량 : " + file.length()); 
			System.out.println("상위폴더 : " + file.getParent()); 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
