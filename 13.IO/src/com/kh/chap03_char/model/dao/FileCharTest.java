package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	// 프로그램 --> 파일 (출력 : 프로그램내에서 파일 내보내기)
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하기 (한글이 깨치지 않음)

		// 1. FileWriter 객체 생성
		// --> 해당 파일이 없으면 자동으로 만들어지고 연결통로를 만들어준다.
		// 해당 파일이 있으면 연결통로만 연결 해줌

		FileWriter fw = null;

		try {
			// true 미작성시 : 기존에 해당 파일이 있을 경우에 덮어씌어짐 (기본값이 false)
			// true 작성시 : 기존에 파일이 있는 경우 이어서 작성됨 (append)
			fw = new FileWriter("b_char.txt", true);

			// 2. write 메소드를 사용해서 출력하고 하는 데이터를 내보냄,
			// 2byte 단위이므로 문자열 전송 가능 (즉 문자로 하나씩 전송되는 개념)

			fw.write("와 재밌다");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');

			char[] cArr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(cArr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileOpen() {

		// FileReader : 파일로부터 데이터를 2byte 단위로 입력받기
		// 1.FileReader 객체 생성 --> 연결통로 만들어짐
		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

			int value = 0;

			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
