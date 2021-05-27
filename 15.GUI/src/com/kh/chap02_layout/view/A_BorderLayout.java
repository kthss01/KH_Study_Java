package com.kh.chap02_layout.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {

	public A_BorderLayout() {
		
		// 1. 컨테이너 셋팅
		super("BorderLayout");
		
		this.setBounds(300, 200, 700, 400);
		
		// 2. 레이아웃 설정
//		this.setLayout(new BorderLayout()); // 레이아웃 정의 안하면 기본이 BorderLayout
		
		// 3. 컴포넌트 객체 생성 (버튼)
		JButton jb1 = new JButton("남");
		JButton jb2 = new JButton("동");
		JButton jb3 = new JButton("서");
		JButton jb4 = new JButton("가운데");

		
		// 4. 레이아웃의 위치별로 컴포넌트 배치 (대소문자 주의)
		this.add(new JButton("북"), BorderLayout.NORTH);
//		this.add(new JButton("북"), "North");
		this.add(jb1, "South");
		this.add(jb2, "East");
		this.add(jb3, "West");
		this.add(jb4, "Center");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
