package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	private Scanner sc = new Scanner(System.in);

	public FileDao() {
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();

		System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		while (true) {
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			} else {
				sb.append(str).append("\n");
			}
		}

		System.out.print("저장하시겠습니까? (y/n) : ");
		String select = sc.nextLine();

		if (select.toLowerCase().equals("y")) {
			BufferedWriter bw = null;

			// 저장할 파일명을 입력 받음
			System.out.print("저장할 파일명을 입력하시오 : ");
			String fileName = sc.nextLine();

			try {
				// BufferedWriter와 FileWriter 스트림 사용
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				bw.write(sb.toString());
				System.out.printf("%s.txt 파일에 성공적으로 저장하였습니다.\n", fileName);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (bw != null)
						bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void fileOpen() {

		System.out.print("열기 할 파일명 : ");
		String fileName = sc.nextLine();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));

			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileEdit() {

		System.out.print("수정 할 파일명 : ");
		String fileName = sc.nextLine();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));

			// 반복문을 통해 해당 파일의 내용을 readLine()메소드로 콘솔에 출력
			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			}

			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			StringBuilder sb = new StringBuilder();

			while (true) {
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				} else {
					sb.append(str).append("\n");
				}
			}

			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			String select = sc.nextLine();
			if (select.toLowerCase().equals("y")) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", true))) {
					bw.write(sb.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.printf("%s.txt 파일의의 내용이 변경되었습니다.\n", fileName);
			}

		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();

		// 반복문을 통한 메뉴 실행
		while (true) {
			System.out.println("****** MyNote ******");

			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");

			System.out.print("번호를 입력하세요 : ");
			int select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1:
				fd.fileSave();
				break;
			case 2:
				fd.fileOpen();
				break;
			case 3:
				fd.fileEdit();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}

}
