package com.kh.part01_thread.model.thread;

// 스레드 생성
// 1. Thread 상속 받기
public class Thread1 extends Thread {

	@Override
	public void run() { // 새로운 스레드의 메인 메소드로 생각
		for (int i = 1; i <= 10; i++) {
			System.out.println("스레드1 [" + i + "]");
		}
	}

}
