package com.kh.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {

	public B_FlowLayout() {
		super("FloyLayout");
		
		this.setBounds(300, 200, 400, 400);
		
//		this.setLayout(new FlowLayout()); // 기본은 가운데 정렬
//		this.setLayout(new FlowLayout(FlowLayout.LEFT)); // 좌측 정렬
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 우측 정렬
//		this.setLayout(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
//		this.setLayout(new FlowLayout(FlowLayout.LEADING)); // 좌측 정렬
		this.setLayout(new FlowLayout(FlowLayout.TRAILING)); // 우측 정렬
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		this.add(new JButton("5번"));
		this.add(new JButton("6번"));
		this.add(new JButton("7번"));
		this.add(new JButton("8번"));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
