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

}
