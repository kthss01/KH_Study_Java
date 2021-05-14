package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		int count = 0; // 학생 수를 나타내는 변수 -> 한 명 추가시 1 증가
		Student[] students = new Student[10];

		// while (true)를 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개 변수 생성자를 통해 객체 생성

		// 한 명씩 추가 되므로 count 1 증가

		// 계속 추가할 것인지 물어보고, 'n' 입력 시 반복문 빠져 나감

		Scanner sc = new Scanner(System.in);

		// test
//		students[count++] = new Student(1, 5, "홍길동", 40, 60, 70);
//		students[count++] = new Student(2, 1, "김말똥", 70, 80, 100);
//		students[count++] = new Student(3, 3, "강개순", 100, 75, 86);
		
		while (true) {
			System.out.println("=== 학생 정보 입력 ===");

			System.out.print("학년 : ");
			int grade = sc.nextInt();

			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();

			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();

			students[count++] = new Student(grade, classroom, name, kor, eng, math);

			System.out.print("계속 추가하겠습니까?(y/n) : ");
			char answer = sc.nextLine().toLowerCase().charAt(0);

			if (answer == 'n') {
				break;
			}
		}

		// 현재 배열에 담겨 있는
		// 학생들의 정보를 모두 출력
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].information());
		}
		
		// 각 학생의 평균 점수 출력
		
		for (int i = 0; i < count; i++) {
			int sum = 0;
			
			sum += students[i].getKor();
			sum += students[i].getEng();
			sum += students[i].getMath();
			
			int avg = sum / 3;
			System.out.printf("%s의 평균 점수 : %d점\n", students[i].getName(), avg);
		}

	}

}
