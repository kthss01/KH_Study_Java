package com.kh.chap01_container.run;

import com.kh.chap01_container.view.MakeJFrame2;

public class Run {

	/*
	 * 1. GUI(Graphical User Interface)란?
	 * 	 - GUI는 GUI 기반 환경에서 구동시켜야 될 때만 만들고 웹에서는 html을 쓴다.
	 *   - 키보드나 마우스로 들어오는 신호가 event로 동작되게 하고
	 *     event를 핸들링해서 기능 구현을 함
	 *   - 컨테이너 위에 컴포넌트들을 추가해서 사용함
	 *   
	 * 2. GUI객체
	 *   - AWT : OS의 컴포넌트를 그대로 사용(Java로 구현한게 X)(초기버전)
	 *   - Swing : AWT보다 더 많은 종류의 컴포넌트를 제공하고 Java로 구현
	 *   			(앞에 J를 붙여 AWT와 구분)
	 *   
	 * 3. 컨테이너 객체 생성하기
	 *   (1). JFrame 상속을 이용한 방법
	 *   (2). 상속 받지 않고 JFrame 객체 생성하는 방법 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 1. 상속을 통한 컨테이너 객체 생성
//		new MakeJFrame1();
		
		// 2. 상속을 받지 않고 JFrame 객체 생성
		new MakeJFrame2();
	}

}
