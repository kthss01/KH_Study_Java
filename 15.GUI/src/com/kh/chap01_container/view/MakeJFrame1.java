package com.kh.chap01_container.view;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MakeJFrame1 extends JFrame {

	public MakeJFrame1() {
		super("MyFrame"); // title

		this.setBounds(300, 200, 600, 500); // x, y, width, height
		// 컨테이너 위치 (x, y) 크기 (w, h)

		// title, 프레임의 위치 크기 수정
		this.setTitle("abc");
		this.setLocation(200, 300);
		this.setSize(800, 500);

		try {
			this.setIconImage(ImageIO.read(new File("images/cat.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 필수
		this.setVisible(true);
		// 컨테이너가 화면에 보이도록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼 눌러도 프로세스가 계속 실행 중이므로 종료할 때 확실히 꺼질 수 있게 하는 코드
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeJFrame1 frame = new MakeJFrame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
