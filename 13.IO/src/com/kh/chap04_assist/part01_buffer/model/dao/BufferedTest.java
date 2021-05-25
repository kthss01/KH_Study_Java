package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public void fileSave() {

		// 1. 기반스트림 생성
		// 어떤 외부 매체와 데이터를 주고 받을 것이냐를 선택해주는 메인(기반) 스트림 반드시 필요

//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			// 2. 보조스트림 생성 (기반 스트림의 성능을 좀더 향상시키고자함)
//			// 매개변수로 기반스트림을 사용
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//			
//			bw.write("안녕하세요.\n");
//			bw.write("반갑습니다.\n");
//			bw.newLine(); // 새 줄 추가
//			bw.write("감사합니다.\n");
//			
//			// BufferedWriter 의 장점 : 
//			// 2byte단위로 데이터가 출력될 때 버퍼라는 공간에 계속 쌓고 한번에 출력시켜줌,
//			// 기반스트림에서는 제공해주지 않는 newLine() 메소드 제공 (개행시켜줌)
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (bw != null) bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		// try with resource 구문 -> try (스트림객체 생성 구문을 작성): 다 사용하고나서 알아서 닫아줌 close()
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {

			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.\n");
			bw.newLine(); // 새 줄 추가
			bw.write("감사합니다.\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {

//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());

			String temp = null;

			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
