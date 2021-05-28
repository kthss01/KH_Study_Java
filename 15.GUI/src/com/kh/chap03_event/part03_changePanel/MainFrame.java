package com.kh.chap03_event.part03_changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	JPanel panel;
	
	public MainFrame() {
		this.setSize(200, 300);
		this.setTitle("패널바꾸기");
		
		// 파란색 패널 만들기
		panel = new Panel1();
		
		// 패널 이벤트 (익명 클래스)
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				replace();
			}
			
		});
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void replace() {
		this.remove(panel); // 기존 패널 삭제
		this.panel = callPanel2();
		this.add(panel); // 핑크색 패널 프레임에 부착
		this.repaint(); // 반드시 실행해야 패널이 바뀜
	}

	private JPanel callPanel2() {
		return new Panel2();
	}

	public static void main(String[] args) {
		new MainFrame();
	}

}
