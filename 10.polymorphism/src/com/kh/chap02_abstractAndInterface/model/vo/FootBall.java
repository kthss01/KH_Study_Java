package com.kh.chap02_abstractAndInterface.model.vo;

// 상속
// 미완성 클래스 / 클래스 extends (하나만 상속 가능)
// 인터페이스 : implements (여러 개 가능)

public class FootBall extends Sports implements ISports1 {

	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야한다.");
	}

	@Override
	public void startTime() {
		System.out.println("Interface ISports2 Method --> startTime");
	}

	@Override
	public void endTime() {
		System.out.println("Interface ISports2 Method --> endTime");

	}

	@Override
	public void rule1() {
		System.out.println("Interface ISports1 Method --> rule1()");
	}

}
