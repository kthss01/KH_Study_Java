package com.kh.chap03_event.part02_howToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.chap03_event.part02_howToUse.B_InnerClassTest.MyEvent;

public class D_MethodTest extends JFrame implements ActionListener {

	// 4. 클래스에서 리스너 인터페이스를 직접 구현 해서 메소드 오버라이딩
	JButton button;
	JLabel label;

	public D_MethodTest() {
		this.setSize(300, 200);

		JPanel panel = new JPanel();
		button = new JButton("버튼을 눌러보세요");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");

		button.addActionListener(this);

		panel.add(button);
		panel.add(label);

		this.add(panel);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new D_MethodTest();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("드디어 버튼이 눌려졌습니다.");
	}

}
