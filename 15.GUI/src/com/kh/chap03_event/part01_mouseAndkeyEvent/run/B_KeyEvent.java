package com.kh.chap03_event.part01_mouseAndkeyEvent.run;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_KeyEvent extends JFrame implements KeyListener {
	// 3. 프레임 상속 받고 인터페이스 구체화하여 구현
	
	public B_KeyEvent() {
		super("키 이벤트");
		this.setSize(300, 200);
		this.setLayout(null);

		JTextField tf = new JTextField();
		tf.setSize(100, 50);
		
		tf.addKeyListener(this);
		
		this.add(tf);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new B_KeyEvent();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 치는 중입니다.");
		System.out.println(e.isShiftDown()); // 시프트 키 눌렀는지
		System.out.println(e.isControlDown()); // 컨트롤 키 눌렀는지
		
		if (e.getKeyChar() == 'q') {
			System.exit(0); // 정상 종료
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키가 떼어질 때");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("유니코드 키인 경우 누른 키를 떼는 순간"); // 영어도 다됨
		
	}

}
