package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		/*
		 * 실습 문제 1
		 * 
		 * 키보드로 입력 받은 하나의 정수가 양수이면 "양수다.", 양수가 아니면 "양수가 아니다."를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println(result);
	}
	
	public void practice2() {
		/*
		 * 실습 문제 2
		 * 
		 * 키보드로 입력 받은 하나의 정수가 양수이면 "양수다"
		 * 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다" ;
		
		System.out.println(result);		
	}
	
	public void practice3() {
		/*
		 * 실습 문제 3
		 * 
		 * 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}
	
	public void practice4() {
		/*
		 * 실습 문제 4
		 * 
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
		 * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / num);
		System.out.println("남는 사탕 개수 : " + candy % num);
	}
	
	public void practice5() {
		/*
		 * 실습 문제 6
		 * 
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		 * 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		String student = (gender == 'M') ? "남학생" : "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, classNum, num, name, student, score);
	}
	
	public void practice6() {
		/*
		 * 실습 문제 6
		 * 
		 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 
		 * 청소년(13세 초과 ~ 19세 이하)인지, 
		 * 성인(19세 초과)인지 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		
		System.out.println(result);
	}
	
	public void practice7() {
		/*
		 * 실습 문제 7
		 * 
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		 * 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * 세 과목의 점수와 평균을 가지고 합격 엽루르 처리하는데
		 * 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		
		System.out.println(result);
	}
	
	public void practice8() {
		/*
		 * 실습 문제 8
		 * 
		 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String ssn = sc.nextLine(); // Social Security Number SSN
		
		char pid = ssn.charAt(7);
		
		String result = (pid == '1' || pid == '3') ? "남자" : (pid == '2' || pid == '4') ? "여자" : "잘못 입력하셨습니다.";
		
		System.out.println(result);
	}
	
	public void practice9() {
		/*
		 * 실습 문제 9
		 * 
		 * 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		 * 그리고 또 다른 정수를 입력 받아 
		 * 그 수가 num1 이하거나 num2 초과이면 true를 출려가고 아니면 false를 출력하세요.
		 * (단, 입력할 때 num1은 num2보다 작아야 함)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num <= num1 || num > num2);
	}
	
	public void practice10() {
		/*
		 * 실습 문제 10
		 * 
		 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 == num2 && num2 == num3);
	}
	
	public void practice11() {
		/*
		 * 실습 문제 11
		 * 
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만"을 출력하세요.
		 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		double salaryA = sc.nextDouble();
		
		System.out.print("B사원의 연봉 : ");
		double salaryB = sc.nextDouble();
		
		System.out.print("C사원의 연봉 : ");
		double salaryC = sc.nextDouble();
		
		double incentiveA = salaryA * 1.4;
		double incentiveB = salaryB * 1.0;
		double incentiveC = salaryC * 1.15;
		
		String result1 = incentiveA >= 3000 ? "3000 이상 " : "3000 미만";
		String result2 = incentiveB >= 3000 ? "3000 이상 " : "3000 미만";
		String result3 = incentiveC >= 3000 ? "3000 이상 " : "3000 미만";
		
		System.out.println("A사원의 인센티브포함 연봉 : " + incentiveA);
		System.out.println(result1);
		
		System.out.println("B사원의 인센티브포함 연봉 : " + incentiveB);
		System.out.println(result2);
		
		System.out.println("C사원의 인센티브포함 연봉 : " + incentiveC);
		System.out.println(result3);
	}
}
