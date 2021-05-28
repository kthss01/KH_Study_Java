package com.kh.chap03_event.part01_mouseAndkeyEvent.run;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A1_MouseEvent extends MouseAdapter {

	// 2 마우스 어댑터를 상속 받을 때 MousePressed 상황만 고려

	public A1_MouseEvent() {

		// 컨테이너
		JFrame jf = new JFrame();
		jf.setTitle("Mouse Event Adapter");
		jf.setSize(300, 200);

		JPanel panel = new JPanel();
		panel.addMouseListener(this);

		jf.add(panel);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new A1_MouseEvent();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Clicked : " + e.getClickCount() + " x = " + e.getX() + ", y = " + e.getY() + " 클릭버튼 "
				+ e.getButton());
	}

}
