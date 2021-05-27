package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MakeJFrame2 {


	public MakeJFrame2() {
		
		JFrame mainFrame = new JFrame("MyFrame2");
		
//		mainFrame.setBounds(300, 300, 400, 400);
		
		Rectangle r = new Rectangle(300, 300, 400, 400);
		mainFrame.setBounds(r);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("images/icecream.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setVisible(true);;
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
