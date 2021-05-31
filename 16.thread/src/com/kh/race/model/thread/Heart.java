package com.kh.race.model.thread;

import com.kh.race.run.Run;

public class Heart implements Runnable {

	@Override
	public void run() {

		int ran = 0;

		try {
			for (int i = 0; i < 10; i++) {
				// 콘솔창 클리어용 개행 (30줄)
				for (int k = 0; k < 30; k++) {
					System.out.println();
				}

				// 처음 출력 시
				if (i == 0) {
					System.out.println(" 준비");
					System.out.println("♡");
					System.out.println("★");
				} else {
					ran = (int) (Math.random() * 5) + 1;
					Run.tot1 += ran; // 값 누적 시키기

					// 생성되어 누적되어 수만큼 -로 표시
					// 하트 출력
					for (int j = 0; j < Run.tot1; j++) {
						System.out.print("-");
					}
					System.out.println("♡");

					// 별 출력
					for (int j = 0; j < Run.tot2; j++) {
						System.out.print("-");
					}
					System.out.println("★");
				}

				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
