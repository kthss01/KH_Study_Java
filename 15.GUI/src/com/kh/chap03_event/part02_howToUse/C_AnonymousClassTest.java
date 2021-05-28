package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.chap03_event.part02_howToUse.B_InnerClassTest.MyEvent;

public class C_AnonymousClassTest {
	
	// 3. 익명 클래스 - 인터페이스에서의 abstract 메소드를 바로 구현해서 인터페이스 객체화 시킬 수 있다
	public static void main(String[] args) {

		JFrame mf = new JFrame("익명클래스");

		mf.setSize(300, 200);

		JButton button;
		JLabel label;

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");

		button.addActionListener(new ActionListener() {

			// 리스너를 구현한 클래스를 이용하는 것이 아니라
			// 리스너 인터페이스 자체를 객체화 하여 사용
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
		});

		panel.add(button);
		panel.add(label);

		mf.add(panel);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
