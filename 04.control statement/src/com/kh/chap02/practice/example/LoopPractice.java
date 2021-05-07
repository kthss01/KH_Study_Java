package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		/*
		 * 실습 문제 1
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 "잘못 입력하셨습니다."를 출력하세요.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		/*
		 * 실습 문제 2
		 * practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			} 

			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		/*
		 * 실습 문제 3
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void practice4() {
		/*
		 * 실습 문제 4
		 * practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		 * "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		/*
		 * 실습 문제 5
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i != num) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
		}
		
		System.out.println(sum);
	}
	
	public void practice6() {
		/*
		 * 실습 문제 6
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자만을 입력해주세요"를 출력하세요.
		 * (for문 이용) 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
			return;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void practice7() {
		/*
		 * 실습 문제 7
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
				continue;
			}
			
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		/*
		 * 실습 문제 8
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("==== " + dan + "단 ====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	public void practice9() {
		/*
		 * 실습 문제 9
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 2~9 사이의 숫자가 아닌 경우 "2~9 사이의 숫자만 입력해주세요"를 출력하세요.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if (dan < 2 && dan > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			return;
		}
		
		for (int j = dan; j <= 9; j++) {
			System.out.println("==== " + dan + "단 ====");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
		
	}
	
	public void practice10() {
		/*
		 * 실습 문제 10
		 * practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		 * "2~9 사이의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if (dan < 2 && dan > 9) {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
				continue;
			}
			
			for (int j = dan; j <= 9; j++) {
				System.out.println("==== " + dan + "단 ====");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				}
			}
		}
	}
	
	public void practice11() {
		/*
		 * 실습 문제 11
		 * 사용자로부터 시작 숫자와 공차를 입력 받아
		 * 일정한 값으로 숫자가 커지거나 작이지는 프로그램을 구현하세요.
		 * 단, 출력되는 숫자는 총 10개입니다.
		 * 
		 * '공차'는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		 * ex) 2, 7, 12, 17, 22 ...
		 * 		5 	5	5	5 => 여기서 공차는 5
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int d = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.print((num + d * i) + " ");
		}
		System.out.println();
	}
	
	public void practice12() {
		/*
		 * 실습 문제 12
		 * 정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		 * 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 들어올 때까지 무한 반복하며
		 * exit 가 들어오면 "프로그램을 종료합니다." 를 출력하고 종료합니다.
		 * 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		 * "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며
		 * 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고
		 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자로부터 입력하도록 하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			if (op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			switch (op) {
			case "+":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 + num2);
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 - num2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 * num2);
				break;
			case "/":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 / num2);
				break;
			case "%":
				System.out.printf("%d %s %d = %d\n", num1, op, num2, num1 % num2);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
			
		}
	}
	
	// ########################################################## //
	
	public void practice15() {
		/*
		 * 실습 문제 15
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		 * 단, 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요.
		 * (for문 이용)
		 * '소수'는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		 * ex) 2, 3, 5, 7, 11, ...
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		boolean isPrime = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime == true) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
	
	public void practice16() {
		/*
		 * 실습 문제 16
		 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		 * "잘못 입력하셨습니다."를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * '소수'는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		 * ex) 2, 3, 5, 7, 11 ...
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if (num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			boolean isPrime = true;
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime == true) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
		}
	}
	
	public void practice17() {
		/*
		 * 실습 문제 17
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		 * 단, 입력한 수가 2보다 작은 경우 "잘못 입력하셨습니다."를 출력하세요.
		 * (for문 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		int count = 0;
		
		for (int j = 2; j <= num; j++) {
			boolean isPrime = true;
			
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true) {
				System.out.print(j + " ");
				count++;
			} 
		}
		System.out.println();
		
		System.out.printf("2부터 %d까지 소수의 개수는 %d개입니다.\n", num, count);
	}
	
	public void practice18() {
		/*
		 * 실습 문제 18
		 * 1부터 사용자에게 입력 받은 수까지 중에서
		 * 	1) 2와 3의 배수를 모두 출력하고
		 * 	2) 2와 3의 공배수의 개수를 출력하세요.
		 * (for문 이용)
		 * 	'공배수'는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 
		 * 	모두 나머지가 0이 나오는 수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println();
		
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		/*
		 * 실습 문제 19
		 * 다음과 같은 실행 예제를 구현하세요.
		 * (for문 이용)
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			// 빈칸 출력
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			
			// 별 출력
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice20() {
		/*
		 * 실습 문제 20
		 * 다음과 같은 실행 예제를 구현하세요.
		 * (for문 이용)
		 * *
		 * **
		 * ***
		 * **
		 * *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		/*
		 * 실습 문제 21
		 * 다음과 같은 실행 예제를 구현하세요.
		 * (for문 이용)
		 * 
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			// 빈칸 출력
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			
			// 별 출력
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice22() {
		/*
		 * 실습 문제 22
		 * 다음과 같은 실행 예제를 구현하세요.
		 * (for문 이용)
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {		
			if (i == 0 || i == num - 1) {
				// top or bottom
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
			} else {
				// side
				
				// 별
				System.out.print("*");
				
				// 빈칸
				for (int j = 0; j < num - 2; j++) {
					System.out.print(" ");
				}
				
				// 별
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
