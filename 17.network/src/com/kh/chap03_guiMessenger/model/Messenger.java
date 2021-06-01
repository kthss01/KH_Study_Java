package com.kh.chap03_guiMessenger.model;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.kh.chap03_guiMessenger.view.MyFrame;

public class Messenger {

	private MyFrame f;
	private DatagramSocket socket;
	private InetAddress address = null;
	private final int MP; // myPort
	private final int OTHMP; // otherPort

	public Messenger(int myPort, int otherPort) {
		this.MP = myPort;
		this.OTHMP = otherPort;

		// 자신을 가리키는 포트 127.0.0.1
		try {
			address = InetAddress.getByName("127.0.0.1");

			socket = new DatagramSocket(myPort);

			f = new MyFrame(address, otherPort, socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

	public MyFrame getMyFrame() {
		return f;
	}

}
