package com.kh.chap03_event.part02_howToUse;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_OtherClassTest extends JFrame {

	// 1. 다른 클래스에 변수 값을 넘겨줌으로써 리스너 인터페이스를 구현한 클래스 활용

	public A_OtherClassTest() {
		this.setSize(300, 200);

		JButton button;
		JLabel label;

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");

		button.addActionListener(new A_MyEvent(label));

		panel.add(button);
		panel.add(label);

		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new A_OtherClassTest();

	}

}
