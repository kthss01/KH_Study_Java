package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class Sports {

	private int people; // 참여하는 사람 수

	public Sports() {
	}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	public abstract void rule();
	// 추상 메소드 (미완성된 메소드로 내용이 구현되지 않은 메소드
	// --> {} 몸통부가 아직 구현되지 않은 상태
	
	// --> 미완성된 추상 메소드가 있다는 것은 이 클래스 또한 미완성 클래스 라는 것
	// --> 추상 클래스로 명시를 해줘야 한다.
	// public abstract class Sports 
}
