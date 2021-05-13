package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {
	private Member mem = new Member("admin", "1234", "홍길동", "901022-156234", 163.0);

	public MemberController() {
	}

	public int login(String id, String pwd) {
		// 전달 받은 id, pwd 값과 mem의 memberId와 memberPwd 비교 했을 때

		// 모두 같으면 1을 리턴

		// 아니면 0을 리턴

		if (mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public Member readInfo() {
		// mem의 주소 값을 리턴
		
		return mem;
	}
	
	public int readAge() {
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		
		// HINT : String 클래스의 substring() 메소드 Integer 클래스의 parseInt() 메소드 참고
		
		// 나이 = 올해년도 - 출생년도 + 1
		
		// 구한 나이 값 리턴
		
		int bonYear = Integer.parseInt(mem.getCitizenNo().substring(0, 2));
//		System.out.println(bonYear);
		
		int check = mem.getCitizenNo().charAt(7) - '0';
		
		if (check == 1 || check == 2) {
			// 1900년대 생
			bonYear += 1900;
		} else if (check == 3 || check == 4) {
			// 출생년도 2000년대 생
			bonYear += 2000;
		} else { 
			bonYear += 1900; // 외국인 등록인데 그냥 1900으로 처리
		}
		
		int year = 2021;
		
		int age = year - bonYear + 1;
		
		return age;
	}
	
	public void updateHeight(double height) {
		// 전달 받은 height 값으로 mem의 height 값 수정
		mem.setHeight(height);
	}

}
