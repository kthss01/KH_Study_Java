package com.kh.part01_thread.run;

import com.kh.part01_thread.model.thread.Thread1;
import com.kh.part01_thread.model.thread.Thread2;

public class Run {
	// Runnable 인터페이스 vs Thread 클래스의 차이점
	// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
	// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
	// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.

	public static void main(String[] args) {
		
		// 스레드를 만드는 조건
		// main 메소드에서
		// 1. Thread 객체 필요
		// 2. run() 필요
		// 3. start() 필요
		
		Thread1 th1 = new Thread1();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2); // Runnable 타입이므로 생성한 객체를 스레드로 생성한다.
		
		// 생성한게 아니라 run만 호출한거
//		th1.run();
//		th.run();
		
		th1.start();
		th.start();
		
		System.out.println(" 메인메소드");
		
		// IllegalThreadStateException 발생
		// 이미 사용한 객체는 다시 사용할 수 없음 -> 예외 발생
//		th1.start();
		// 에러 발생, 한번 start() 하여 사용한 객체는 다시 사용 되지 않으니 새로 객체를 생성해서 사용
	}

}
