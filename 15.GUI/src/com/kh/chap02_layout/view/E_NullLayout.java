package com.kh.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {

	public E_NullLayout() {
		
		super("NullLayout");
		
		this.setBounds(300, 210, 510, 510);
		this.setLayout(null); // 레이아웃 사용하지 않겠다
		// 아예 설정 안하면 borderlayout
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(200, 50);
		
		JTextField tf = new JTextField();
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		JButton btn = new JButton("추가");
		btn.setLocation(350, 100);
		btn.setSize(100, 50);
		
		// 컨테이너에 컴포넌트 붙이기
		this.add(lb);
		this.add(tf);
		this.add(btn);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
