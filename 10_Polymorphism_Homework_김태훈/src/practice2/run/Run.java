package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// 2개의 객체를 저장할 수 있는 객체배열 생성 (SmartPhone 타입)
		
		SmartPhone[] phone = new SmartPhone[2];
		
		// 각각의 인덱스에 GalaxyNote9, V40 객체 생성 (기본 생성자 이용) --> 다형성
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for (SmartPhone p : phone) {
			/*
			 * printMaker() 
			 * makeaCall()
			 * takeaCall()
			 * touch()
			 * charge()
			 * picture()
			 * System.out.println(); // 한 줄 띄기
			 */
			p.printMaker();
			p.makeaCall();
			p.takeaCall();
			p.touch();
			p.charge();
			p.picture();
			System.out.println();
		}
	}

}
