package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {

	private Scanner sc;
	
	public EmpMenu() {
		sc = new Scanner(System.in);
	}
	
	public void mainMenu() {
		/*
		 * 사원 정보관리 프로그램에 해당하는 메인 메뉴 출력
		 * -> 반복 출력되게 함
		 * 
		 * * 초기 사원 객체 null로 초기화 후 진행
		 */
		
		Employee emp = null;
		
		// 메뉴 화면 출력 --> 반복 실행 처리
		
		while (true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");	
			System.out.println("2. 사원 정보 수정");	
			System.out.println("3. 사원 정보 삭제");	
			System.out.println("4. 사원 정보 출력");	
			System.out.println("9. 프로그램 종료"); 	// return 처리
			
			System.out.print("메뉴 번호 선택 : ");		// 입력 받음
			int select = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
			switch (select) {
			case 1:
				// inputEmployee() 실행 -> 바환 값으로 emp 초기화
				emp = inputEmployee();
				break;
			case 2:
				// modifyEmployee() 실행
				modifyEmployee(emp);
				break;
			case 3:
				// 가비지 컬렉터가 지워주게끔
				emp = null;
				break;
			case 4:
				// Employee의 information() 사용
				if (emp == null) {
					System.out.println("사원 정보가 삭제되어있습니다. 새로 입력하세요.");
				} else {
					System.out.println("사원명\t부서명\t직급\t나이\t성별\t급여\t보너스포인트\t전화번호\t주소");
					System.out.println(emp.information());
				}
				break;
			case 9:
				// 프로그램 종료
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}
	
	public Employee inputEmployee() {
		/*
		 * 메인 메뉴의 1번을 눌렀을 때 호출되는 메소드로 사원 정보를 키보드로 입력 받아
		 * 매개 변수 생성자를 이용하여 객체 생성 후 그 주소 값을 반환
		 */
		
		// 키보드를 통해 사원 정보를 입력 받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 반환
		
		System.out.print("사원명 : ");
		String empName = sc.nextLine();
		
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급 : ");
		String job = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		System.out.print("보너스 포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		Employee emp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		
		return emp;
	}
	
	public void modifyEmployee(Employee emp) {
		/*
		 * 메인 메뉴의 2번을 눌렀을 때 호출되는 서브 메뉴
		 * 각 서브 메뉴에 해당하는 변경 값을 입력 받고 
		 * setter 메소드를 이용하여 사원 정보 수정
		 * -> 반복 출력되게 함
		 */
		
		// 서브 메뉴 화면 출력 --> 반복 실행 처리
		
		while (true) {
			System.out.println("==== 사원 정보 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			
			
			// 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여 수정
			int select = sc.nextInt();
			sc.nextLine();
			
			switch (select) {
			case 1:
				// 이름 변경
				System.out.printf("변경할 이름 [현재 : %s] : ", emp.getEmpName());
				String empName = sc.nextLine();
				emp.setEmpName(empName);
				break;
			case 2:
				// 급여 변경
				System.out.printf("변경할 급여 [현재 : %d] : ", emp.getSalary());
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
			case 3:
				// 부서 변경
				System.out.printf("변경할 부서 [현재 : %s] : ", emp.getDept());
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4: 
				// 직급 변경
				System.out.printf("변경할 직급 [현재 : %s] : ", emp.getJob());
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				// 프로그램 종료
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}
}
