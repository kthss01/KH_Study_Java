package com.hw1.controller;

import com.hw1.model.vo.Guests;
import com.hw1.model.vo.RollerCoaster;

public class RideController {

	Guests[] gs;
	Guests[] onboard;
	
	public RideController() {
		gs = new Guests[4];
		int count = 0;
		
		gs[count++] = new Guests("홍길동", 17, 'M', 120.2);
		gs[count++] = new Guests("유관순", 20, 'F', 102.3);
		gs[count++] = new Guests("김유신", 23, 'M', 110.4);
		gs[count++] = new Guests("김흥부", 21, 'M', 112.5);
		
		onboard = new Guests[RollerCoaster.PREMITNUMBER];
	}
	
	public void cutGuests() {
		// 4명의 탑승 대기자를 생성자를 통한 Guests객체 배열 초기화 (Guests[] gs)
		
		//RollerCoaster 클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성 (Guests[] onBoard)
		
		int count = 0;
		
		try {
			// for문과 if문을 통해 RollerCoaster 클래스의 허용키 상수값 크기
			// 이상인 사람을 Guests 객체 배열에 onBoard에 담는다.
			
			for (Guests guests : gs) {
				if (guests.getHeight() >= RollerCoaster.CUTHEIGHT) {
					onboard[count] = guests; // 여기서 count++ 하면 예외처리 발생할 때도 증가해서 3됨
					count++; // 끝나고 처리
				}
			}
			
			// 배열 크기를 넘어가면 발생되는 예외 클래스 참조형 변수 e를 받는 매개변수 자리
		} catch (ArrayIndexOutOfBoundsException e) {
			// 문제가 발생한 해당 배열의 인덱스 번호가 몇 번에서 발생하는지
			// Throwable 클래스의 getMessage() 메소드를 통해 출력
			
			System.out.printf("문제가 발생한 해당 배열의 인덱스 번호 : %s\n", e.getMessage());
			
		} finally {
			// "인원이 가득 찼습니다. 다음 차례를 기다리세요"
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			
			// "이번 차례 탑승 명단"
			System.out.println("이번 차례 탑승 명단");
			
			// 탑승자 각각의 이름, 키를 출력하고 두 탑승자의 요금 합계를 출력 하시오.
			for (Guests guests : onboard) {
				System.out.println(guests);
			}
			
			System.out.println("탑승자 요금 : " + RollerCoaster.PRICE * count);
		}
	}
}
