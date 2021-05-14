package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {
	
	// MemberController 클래스 접근을 위해 필드로 선언
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in); // 키보드로 입력 받기 위해서

	public void mainMenu() {
		// 메뉴 출력
		while (true) {
			System.out.println("====== 회원 관리 메뉴 ======");

			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");

			System.out.print("번호 입력 : ");
			int select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void insertMember() {
		// 1. 현재 회원 수 (memberCount)가 최대 회원 수 (SIZE)를 넘어설 경우 return 처리
		// MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
		// 최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능

		if (mc.getMemberCont() > MemberController.SIZE) {
			System.out.println("더 이상 회원 등록을 할 수 없습니다.");
			return;
		}

		// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달
		// 결과값 받기

		System.out.print("아이디 : ");
		String userId = sc.nextLine();

		Member member = mc.checkId(userId);

		// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		// "동일한 아이디가 존재합니다. 회원 등록 실패" 출력
		if (member != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		} else {
			// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
			// 나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
			// 입력 받은 정볼르 Member의 매개변수 생성자를 이용하여 객체 생성 후
			// MemberController의 insertMember() 메소드로 전ㄴ달
			// "성공적으로 회원 등록이 되었습니다." 출력

			System.out.print("비밀번호 : ");
			String userPwd = sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);

			System.out.print("이메일 : ");
			String email = sc.nextLine();

			mc.insertMember(new Member(userId, userPwd, name, age, gender, email));
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}
	}

	public void searchMember() {
		// 메뉴 출력
		while (true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 9) {
				return;
			}

			System.out.print("검색 내용 :");
			String search = sc.nextLine();

			// 1. MemberController의 serachMemer() 메소드로 menu와 search 문자열 전달
			// >> 결과값
			Member member = mc.searchMember(menu, search);

			// 1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 겨우
			if (member == null) {
				// "검색된 결과가 없습니다." 출력
				System.out.println("검색된 결과가 없습니다.");
			} else {
				// 1_2. 결과 값이 null이 아닌 경우, 즉 검색 결과가 존재하는 경우 >> 회원 정보 출력
				System.out.println(member.information());
			}

		}
	}

	public void updateMember() {
		// 메뉴 출력
		while (true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if (menu == 9) {
				return;
			}

			System.out.print("변경할 회원 아이디 : ");
			String userId = sc.nextLine();

			// 1. MemberController의 checkId()로 userId 전달
			Member m = mc.checkId(userId);

			if (m == null) {
				// 1_1. 결과 값이 null인 경우
				// "변경할 회원이 존재하지 않습니다" 출력
				System.out.println("변경할 회원이 존재하지 않습니다");
			} else {
				// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
				// 변경 내용 (update) 입력 받고
				// MemberController의 updateMember()에 m, menu, update 전달
				// "회원의 정보가 변경되었습니다." 출력

				System.out.println(m.information());

				System.out.print("변경할 내용 입력 : ");
				String update = sc.nextLine();

				mc.updateMember(m, menu, update);

				System.out.println("회원의 정보가 변경되었습니다.");
			}
		}
	}

	public void deleteMember() {
		// 삭제할 회원 아이디 : 키보드로 입력 받기

		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();

		// 1. MemberController의 checkId()로 userId 전달
		Member m = mc.checkId(userId);

		if (m == null) {
			// 1_1. 결과 값이 null인 경우
			// "삭제할 회원이 존재하지 않습니다" 출력
			System.out.println("삭제할 회원이 존재하지 않습니다");
		} else {
			// 1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
			// "정말 삭제하시겠습니까? (y/n) : " 출력 후 키보드로 입력 받기
			// 대소문자 구분 없이 "Y"인 경우 MemberController의 deleteMember()에 userId 전달
			// "회원의 정보가 삭제되었습니다." 출력

			System.out.println(m.information());

			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			String answer = sc.nextLine();

			if (answer.toUpperCase().charAt(0) == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}

		}
	}

	public void printAllMember() {

		// MemberController의 getMem() 메소드 호출
		Member[] mem = mc.getMem();

		// 반복문을 통해 결과 값 안의 존재하는 회원들 정보 출력
		for (int i = 0; i < mc.getMemberCont(); i++) {
			System.out.println(mem[i].information());
		}
	}

	public void sortMember() {
		Member[] sortMem = null; // 정렬 결과를 받아 줄 객체배열 초기화

		while (true) {
			// 메뉴 출력
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;

			case 9:
				return;

			default:
				break;
			}

			// 반복문을 통해 sortMem 객체 배열 출력
			for (Member member : sortMem) {
				System.out.println(member.information());
			}

		}
	}
}
