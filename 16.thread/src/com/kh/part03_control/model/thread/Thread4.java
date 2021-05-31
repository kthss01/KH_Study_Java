package com.kh.part03_control.model.thread;

public class Thread4 implements Runnable {

	// sleep() : 지정한 시간만큼 스레드를 정지시키는 메소드
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				
				System.out.println(i + " 초 ");
			} catch (InterruptedException e) {
				// 프로그램이 무한 지연될 수 있기 때문에 발생하는 예외,
				// Interrupt 호출로 Thread가 중단되었을 때 발생하는 예외 
				e.printStackTrace();
			} // 1000 -> 1초 
		}
	}

}
