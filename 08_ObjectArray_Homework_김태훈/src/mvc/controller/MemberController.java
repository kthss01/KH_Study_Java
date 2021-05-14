package mvc.controller;

import java.util.Arrays;
import java.util.Comparator;

import mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10; // 최대 회원 수, 상수 필드로 10 초기화

	private int memberCount; // 현재 회원 수 필드
	
	private Member[] mem = new Member[SIZE]; // 회원 객체 배열

	// 초기화 블럭을 이용하여 기본적인 회원 5명의 정보 초기화, memberCount 수 5 초기화
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}

	public int getMemberCont() {

		// memberCount 리턴
		return memberCount;
	}

	public Member[] getMem() {

		// mem 주소 값 리턴
		return mem;
	}

	public Member checkId(String userId) {

		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화

		
		// mem에서 매개변수로 전달 받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				m = mem[i];
				break;
			}
		}

		// m 리턴
		return m;
	}

	public void insertMember(Member m) {

		// 매개 변수로 전달 받은 회원 객체를 mem 배열에 추가
		mem[memberCount] = m;

		// memberCount 1 증가
		memberCount++;
	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null; // 검색된 회원 정보를 담을 변수 초기화

		// 매개 변수로 전달 받은 search 문자열을 menu 번호에 따라

		for (int i = 0; i < memberCount; i++) {
			// 1인 경우 아이디로 검색 후 결과를 searchMember에 대입
			if (menu == 1 && mem[i].getUserId().equals(search)) {
				searchMember = mem[i];
				break;
			} else if (menu == 2 && mem[i].getName().equals(search)) {
				// 2인 경우 이름으로 검색 후 결과를 searchMember에 대입
				searchMember = mem[i];
				break;
			} else if (menu == 3 && mem[i].getEmail().equals(search)) {
				// 3인 경우 이메일로 검색 후 결과를 searchMember에 대입
				searchMember = mem[i];
				break;
			}
		}

		// serachMember 주소 값 리턴
		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {

		// 매개 변수로 전달 받은 m 회원과 변경 내용인 update 문자열을 menu에 따라

		if (menu == 1) {
			// 1인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
			m.setUserPwd(update);
		} else if (menu == 2) {
			// 2인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
			m.setName(update);
		} else if (menu == 3) {
			// 1인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경
			m.setEmail(update);
		}
	}

	public void deleteMember(String userId) {

		// 매개 변수로 전달 받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId)) {
				mem[i] = null;

				if (i < SIZE - 1) { // 마지막 배열인 경우 제외
					for (int j = i + 1; j < memberCount; j++) {
						mem[j - 1] = mem[j];
					}
				}
			}
		}

		// 실행 시 NullPointerException 발생할 수 있음 -> 생각해보고 해결하기
		// 발생 원인 배열의 끝에있는 회원 삭제할 경우 앞으로 이동시키려고 할 때 배열을 벗어나기 때문
		// i < SIZE - 1이란 조건문을 통해 마지막 배열에 있는 경우 제외

		// memberCount 1 감소
		memberCount--;
	}

	public Member[] sortIdAsc() {

		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		// clone으로 하면 memberCount만큼 밖에서 for문 돌아야함 안그러면 NullPointException 발생
		
		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		// copy 배열을 아이디별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주고 값 리턴

		// 삽입 정렬
		for (int i = 1; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				/*
				 * A.compareTo(B) 
				 * A == B 0 반환 
				 * A > B 양수 반환
				 * A < B 음수 반환
				 */
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) <= 0) {
					// swap
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
//		Arrays.sort(copy, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o1.getUserId().compareTo(o2.getUserId());
//			}
//			
//		});

		return copy;
	}

	public Member[] sortIdDesc() {
		
		// 아이디별 내림차순으로 정렬

		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		// copy 배열을 아이디별 내림차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용
		// copy 주고 값 리턴

		// 삽입 정렬
		for (int i = 1; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				/*
				 * A.compareTo(B) 
				 * A == B 0 반환 
				 * A > B 양수 반환
				 * A < B 음수 반환
				 */
				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					// swap
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
//		Arrays.sort(copy, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o2.getUserId().compareTo(o1.getUserId()); // 뒤집으면 내림차순
//			}
//			
//		});

		return copy;
	}
	
	public Member[] sortAgeAsc() {
		
		// 나이별 오름차순으로 정렬
		
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		// copy 배열을 나이별 오름차순 정렬 진행
		// copy 주고 값 리턴

		// 삽입 정렬
		for (int i = 1; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() < copy[j].getAge()) {
					// swap
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
//		Arrays.sort(copy, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o1.getAge() - o2.getAge(); // < 이거랑 같다고 보면 됨 a < b == a - b < 0
//			}
//			
//		});

		return copy;
	}
	
	public Member[] sortAgeDesc() {
		
		// 나이별 내림차순으로 정렬
		
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		// copy 배열을 나이별 오름차순 정렬 진행
		// copy 주고 값 리턴

		// 삽입 정렬
		for (int i = 1; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getAge() > copy[j].getAge()) {
					// swap
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
//		Arrays.sort(copy, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o2.getAge() - o1.getAge(); // > 이거랑 같다고 보면 됨 a > b == a - b > 0
//			}
//			
//		});

		return copy;
	}
	
	public Member[] sortGenderDesc() {
		
		// 성별별 내림차순으로 정렬
		// (남여 순으로 정렬)
		
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사)

		Member[] copy = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);

		// copy 배열을 성별별 내림차순 정렬 진행
		// copy 주고 값 리턴

		// 삽입 정렬
//		for (int i = 1; i < memberCount; i++) {
//			String genderIStr = String.valueOf(copy[i].getGender());
//			for (int j = 0; j < i; j++) {
//				String genderJStr = String.valueOf(copy[j].getGender());
//				/*
//				 * A.compareTo(B) 
//				 * A == B 0 반환 
//				 * A > B 양수 반환
//				 * A < B 음수 반환
//				 */
//				if (genderIStr.compareTo(genderJStr) > 0) {
//					// swap
//					Member temp = copy[i];
//					copy[i] = copy[j];
//					copy[j] = temp;
//				}
//			}
//		}
		
		for (int i = 1; i < memberCount; i++) {
			for (int j = 0; j < i; j++) {
				if (copy[i].getGender() > copy[j].getGender()) {
					// swap
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
		// 성별도  M F 문자 이기 때문에 숫자처럼 정렬이 가능함 F가 M보다 앞이기 때문에 내림차순으로 정렬하면 됨 
		// F < M 따라서 내림차순 정렬시 F부터 나옴 M - F > 0 이렇게 정렬
		
//		Arrays.sort(copy, new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o2.getGender() - o1.getGender();
//			}
//		});

		return copy;
	}
}
