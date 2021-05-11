package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		/*
		 * 실습 문제 2
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
		 * 	1) 1 ~ 16까지 값을 차례대로 저장하세요.
		 *  2) 저장된 값들을 차례대로 출력하세요.
		 */
		
		int[][] arr = new int[4][4];
		
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		/*
		 * 실습 문제 3
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
		 * 	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		 *  2) 저장된 값들을 차례대로 출력하세요.
		 */
		
		int[][] arr = new int[4][4];
		
		int value = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		/*
		 * 실습 문제 1
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고
		 * 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0, 0)"과 같은 형식으로 저장 후 출력하세요.
		 */
		
		String[][] arr = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")"; 
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		/*
		 * 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		 * 아래의 내용처럼 처리하세요.
		 */
		
		int[][] arr = new int[4][4];
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			
//			if (i != arr.length - 1) { // 3행이 아닐 때
//				int sum = 0;
//				
//				for (int j = 0; j < arr[i].length - 1; j++) {
//					arr[i][j] = (int) (Math.random() * 10) + 1;
//					sum += arr[i][j];
//				}
//				
//				// 열들의 합 처리 (3열)
//				arr[i][arr.length-1] = sum;
//			} 
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			// 3행일 때 처리
//			// 행들의 합 처리 (3행)
//			int sum = 0;
//			
//			for (int j = 0; j < arr[i].length-1; j++) {
//				sum += arr[j][i];
//			}
//			
//			arr[arr.length-1][i] = sum;
//		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;
				arr[arr.length-1][j] += arr[i][j]; // 열 값들의 합 (3행)
				arr[i][arr.length-1] += arr[i][j]; // 행 값들의 합 (3열)
				arr[arr.length-1][arr.length-1] += arr[i][j]; // 3행, 3열
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		/*
		 * 실습 문제 5
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면
		 * "반드시 1~10 사이의 정수를 입력해야 합니다." 출력 후 다시 정수를 받게 하세요.
		 * 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어아게 한 뒤 출력하세요.
		 * (char 형은 숫자를 더해서 문자를 표현할 수 잇고 65는 A를 나타내고 90은 Z를 나타냄) 
		 */
		
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int col = 0;
		
		while (true) {
			if (row < 1 || row > 10) {
				System.out.print("행의 크기 : ");
				row = sc.nextInt();
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			if (col < 1 || col > 10) {
				System.out.print("열의 크기 : ");
				col = sc.nextInt();
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			break;
		}
		
		char[][] arr = new char[row][col];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random() * (90 - 65 + 1)) + 65);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		/*
		 * 실습 문제 6
		 * 
		 * String[][] strArr = new String[][] 
		 * {{"이", "까", "왔", "앞", "힘"}, 
		 * {"차", "지", "습", "으", "냅"}, 
		 * {"원","열", "니", "로", "시"}, 
		 * {"배", "심", "다", "좀", "다"}, 
		 * {"열", "히", "! ", "더", "!! "}};
		 * 
		 * 위의 초기화 되어 있는 배열을 가지고 아래의 [그림] 실습문제 6 흐름과 같은 방식으로 출력
		 * 단, print()를 사용하고 값 사이에 띄어쓰기(" ")가 존재하도록 출력
		 * 한 줄로 다 출력
		 */
		
		String[][] strArr = new String[][] 
			   {{"이", "까", "왔", "앞", "힘"}, 
				{"차", "지", "습", "으", "냅"}, 
				{"원", "열", "니", "로", "시"}, 
				{"배", "심", "다", "좀", "다"}, 
				{"열", "히", "! ", "더", "!! "}};
				
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
	}
	
	public void practice7() {
		/*
		 * 실습 문제 7
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
		 * 문자형 가변 배열을 선언 및 할당하세요.
		 * 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int col = sc.nextInt();
			arr[i] = new char[col];
		}
		
		char ch =  'a';
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		/*
		 * 실습 문제 8
		 * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		 * 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
		 * 
		 * 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		 * 
		 * <출석부>
		 * 1.강건강 2.남나나 3.도대담 4.류라라 5.문미미 6.박보배
		 * 7.송성실 8.윤예의 9.진재주 10.차천축 11.피풍표 12.홍하하
		 */
		
		String[] students = {
				"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
		};
		
		int index = 0;
		
		String[][] group1 = new String[3][2];
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[index++];
			}
		}
		
		String[][] group2 = new String[3][2];
		
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[index++];
			}
		}
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				System.out.printf("%s ", group1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				System.out.printf("%s ", group2[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		/*
		 * 실습 문제 9
		 * 위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여 
		 * 해당 학생이 어느 자리에 앉았는지 출력하세요. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {
				"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
		};
		
		int index = 0;
		
		String[][] group1 = new String[3][2];
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				group1[i][j] = students[index++];
			}
		}
		
		String[][] group2 = new String[3][2];
		
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				group2[i][j] = students[index++];
			}
		}
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				System.out.printf("%s ", group1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for (int i = 0; i < group2.length; i++) {
			for (int j = 0; j < group2[i].length; j++) {
				System.out.printf("%s ", group2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int group = 0;
		int row = 0;
		int col = 0;
		boolean isFound = false;
		
		for (int i = 0; i < group1.length; i++) {
			for (int j = 0; j < group1[i].length; j++) {
				if (name.equals(group1[i][j])) {
					row = i;
					col = j;
					isFound = true;
					break;
				}
			}
		}
		
		if (isFound == false) {
			group++; // 2분단
			
			for (int i = 0; i < group2.length; i++) {
				for (int j = 0; j < group2[i].length; j++) {
					if (name.equals(group2[i][j])) {
						row = i;
						col = j;
						isFound = true;
						break;
					}
				}
			}
		}
		
		if (isFound == true) {
			System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
					name, group+1, row+1, col == 0 ? "왼쪽" : "오른쪽");
		}
	}
}
