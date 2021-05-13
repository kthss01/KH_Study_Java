package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberView {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberView() {
	}

	public void mainMenu() {
		System.out.print("아이디 입력하시오 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine();

		// 입력 받은 아이디, 비밀번호 값을
		// MemberController 클래스의 login 메소드에 전달하고
		// 그 결과값을 result 변수에 받는다.

		int result = mc.login(id, pwd);

		// 성공적으로 로그인 했을 겨우 => 즉, result 변수 값이 1일 경우 아래의 메뉴 출력
		if (result == 1) {
			while (true) {
				System.out.println("로그인 성공");
				
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");

				System.out.print("메뉴 번호 선택 : ");

				int select = sc.nextInt();
				sc.nextLine();

				switch (select) {
				case 1:
					System.out.println(mc.readInfo().information());
					break;
				case 2:
					System.out.println("나이 : " + mc.readAge());
					break;
				case 3:
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다");
					return;
				default:
					System.out.println("잘못 입력했습니다. 다시 입력하세요");
					break;
				}
			}
		} else {
			System.out.println("로그인 실패");
			return;
		}
	}

	public void updateHeight() {
		System.out.print("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		mc.updateHeight(height);
	}
}
