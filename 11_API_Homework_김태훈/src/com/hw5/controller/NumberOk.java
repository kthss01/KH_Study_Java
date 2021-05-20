package com.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;

	public NumberOk() {
	}

	public void numGame() {
		// 사용자에게 숫자를 입력 받고 입력 받은 숫자가 임의의 난수와 비교 했을 때
		// 작은지 큰지, 몇 번 만에 맞추는지 맟추면 계속할지 끝낼지 묻는 메소드

		Scanner sc = new Scanner(System.in);

		while (true) {

			ran = (int) (Math.random() * 100) + 1;

//			System.out.println("cheat : " + ran);
			
			int count = 1;

			while (true) {
				System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();

				if (ran == num) {
					System.out.printf("%d번 만에 맞췄습니다.\n", count);
					break;
				} else if (ran < num) {
					System.out.printf("%d보다 작습니다. %d번째 실패!!\n", num, count++);
				} else {
					System.out.printf("%d보다 큽니다. %d번째 실패!!\n", num, count++);
				}

			}
			
			sc.nextLine();

			while (true) {
				System.out.print("계속 하시겠습니까?(y/n) : ");
				String select = sc.nextLine();

				if (select.equalsIgnoreCase("n")) {
					System.out.println("게임을 종료합니다.");
					return;
				} else if (select.equalsIgnoreCase("y")) {
					System.out.println("새로운 게임을 시작합니다!!");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}

	}
}
