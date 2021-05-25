package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	// 스트림의 특징
	// - 단방향 : 입력이면 입력/ 출력이면 출력만 가능! 입력과 출력을 동시다발적으로 하고자 한다면 하나의 스트림으로 안됨! 입력스트림,
	// 출력스트림 따로 열어야됨!!
	// - 선입선출 : 통로가 곧 파이프같은 개념이기 때문에 먼저 보낸 값이 먼저 나옴! 시간지연

	// 스르림의 구분
	// > 통로의 사이즈(1byte짜리 / 2byte짜리)
	// - 바이트 스트림 : 1byte짜리 왔다 갔다 할 수 있을 정도의 사이즈! (좁은 통로) => 입력(InputStream) /
	// 출력(OutputStream)
	// - 문자 스트림 : 2byte짜리 왔다 갔다 할 수 있을 정도의 사이즈! (좀 더 넓은 통로) => 입력(Reader) /
	// 출력(Writer)

	// > 외부 매체와 직접 연결하는 유무
	// - 기반 스트림 : 외부매체와 직접적으로 연결하는 통로
	// - 보조 스트림 : 말 그대로 보조역할만 하는 통로 (속도를 빠르게 한다거나, 그 외에 유용한 기능들을 제공 한다거나)
	// 따라서 보조스트림 단독으로는 사용 불가! 반드시 외부 매체와 연결되어 있는 기반 스트림은 기본적으로 있어야됨!

	// 프로그램 --> 외부매체 (파일) (출력 : 프로그램내의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		// FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력

		FileOutputStream fout = null;

		// 1. FileOutputStream 객체 생성시 연결통로가 만들어짐
		try {
			// FileNotFoundException 발생 : 없는 경로일 때
			// true 미작성시 : 기존에 해당 파일이 있을 경우에 덮어씌어짐 (기본값이 false)
			// true 작성시 : 기존에 파일이 있는 경우 이어서 작성됨 (append)
			fout = new FileOutputStream("a_byte.txt", true);

			// 2. 파일에 데이터를 출력하고자 할 때 write() 메소드 사용 - IOException 발생
			// 1byte 단위로 출력이 되기 때문에 -128~127 까지의 숫자만 출력이 가능
			// (단 파일에는 해당 숫자의 고유한 문자가 기록됨))
			fout.write(97); // a
			fout.write('b'); 
//			fout.write('강'); // 한글은 2byte라서 실행시키면 깨져서 들어감
		
			byte[] bArr = {99, 100, 101};
			fout.write(bArr);
		
			// write(byte[] b, int off, int len) 
			// : off 인덱스부터 len개만큼 출력
			fout.write(bArr, 0, 1); // c

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// 3. 반드시 스트림을 다 이용했으면 반납해야 함.
				if (fout != null) fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	// 프로그램 <-- 파일 (입력 : 파일로부터 데이터 받아오기)
	public void fileRead() {
		// FileInputStream : "파일"로부터 데이터를 1 바이트 단위로 입력 받는 스트림
		
		// 1. FileInputStream 객체 생성 --> 객체 생성시 연결통로가 만들어짐
		// 파일이 없으면 FileNotFoundException 발생
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터를 입력받고자 할 때 read() 메소드 사용
			// --> 1byte 단위로 읽어오게 된다. 파일의 끝을 만나면 -1 값을 받아온다.
			
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
			
			int value = 0; // read() 하면서 담아준다, EOF(파일의 긑 End Of File) 을 만나면 -1
			while ((value = fin.read()) != -1) {
				System.out.println(value); // 아스키코드 숫자값
				System.out.println((char)value); // 문자형으로 강제 형변환해서 출력
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
