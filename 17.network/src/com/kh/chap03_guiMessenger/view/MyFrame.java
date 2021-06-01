package com.kh.chap03_guiMessenger.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	private DatagramSocket socket;
	private DatagramPacket packet;
	private JTextField textField;
	private JTextArea textArea;
	private InetAddress address;
	private int otherPort;
	
	public MyFrame() {
		
	}
	
	public MyFrame(InetAddress address, int otherPort, DatagramSocket socket) {
		this.address = address;
		this.otherPort = otherPort;
		this.socket = socket;
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		textArea.setEditable(false);
		
		this.add(textField, BorderLayout.PAGE_END);
		this.add(textArea, BorderLayout.CENTER);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack(); // JFrame의 내용물에 알맞게 크기 조정
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = textField.getText();
		byte[] buffer = str.getBytes(); // UDP 방식은 바이트 배열 방식으로 통신
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, address, otherPort);
		
		try {
			socket.send(sendPacket);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		textArea.append("SENT : " + str + "\n"); // 보낸 내용 출력
		textField.selectAll(); // 보낸 내용이 바로 선택되게
	}

	public void process() {
		while (true) {
			byte[] buf = new byte[256];
			packet = new DatagramPacket(buf, buf.length);
			
			try {
				socket.receive(packet);
				textArea.append("RECEIVE : " + new String(buf) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
