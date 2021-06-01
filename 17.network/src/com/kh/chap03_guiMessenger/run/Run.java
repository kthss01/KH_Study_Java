package com.kh.chap03_guiMessenger.run;

import javax.swing.JOptionPane;

import com.kh.chap03_guiMessenger.model.Messenger;
import com.kh.chap03_guiMessenger.view.MyFrame;

public class Run {

	public static void main(String[] args) {

		// 동일한 포트 준거
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트를 입력하세요.")); // 8500
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("상대의 포트를 입력하세요.")); // 8500
		
		Messenger a = new Messenger(myPort, otherPort);
		MyFrame f = a.getMyFrame();
		f.process();
	}

}
