package com.kh.chap02_layout.view;

import java.awt.GridLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame {

	public C_GridLayout() {

		super("GridLayout");

		this.setBounds(300, 300, 600, 400);
		this.setLayout(new GridLayout(5, 5));

		// 좌에서 우로 증가하는 1~25 버튼 만들기
//		for (int i = 1; i < 26; i++) {
//			String input = Integer.valueOf(i).toString();
//			
//			this.add(new JButton(input));
//		}

		// 빙고판 만들기
		// 중복제거, 랜덤으로

		Set<Integer> set = new LinkedHashSet<>();

		while (set.size() < 25) {
			int num = (int) (Math.random() * 25) + 1;

			set.add(num);
		}

		System.out.println(set);

		Iterator<Integer> iter = set.iterator();

		while (iter.hasNext()) {
			String str = Integer.valueOf(iter.next()).toString();
			this.add(new JButton(str));
		}

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
