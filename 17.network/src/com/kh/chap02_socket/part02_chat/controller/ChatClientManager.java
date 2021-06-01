package com.kh.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.chap02_socket.part02_chat.thread.Receiver;
import com.kh.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {

	public void startClient() {
		String name = "Client"; // 클라이언트명
		
		int port = 8500;
		String serverIP = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("Client Start");
			
			// 클라이언트 소켓용 객체 생성
			Socket socket = new Socket(serverIP, port);
			System.out.println("서버와 연결이 되었습니다.");
			
			// 송수신작업용 스레드 만들기
			// 채팅프로그램은 무전기처럼 송신을 받고 수신을 하는 것이 아니라 
			// 전화기처럼 송신을 받으면서 수신도 할 수 있어야 하기 때문에
			// 이를 위해 송신과 수신을 별도의 스레드로 처리하면 동시에 처리가 가능하다
			
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender);

			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver);
			
			sth.start();
			rth.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
