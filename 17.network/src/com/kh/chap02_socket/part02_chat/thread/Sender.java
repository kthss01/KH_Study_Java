package com.kh.chap02_socket.part02_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Sender implements Runnable {

	private String name; // 데이터를 보내는 사용자명
	private DataOutputStream out; // 데이터 출력용 스트림

	private Scanner sc; //

	// sender 객체 생성시 매개변수로 socket과 name을 받아온다.
	// server에서 생성 : 요청을 수락한 Client 소켓, 서버명을 받아옴
	// client에서 생성 : 연결된 Server의 소켓, 클라이언트명을 받아옴
	public Sender() {
	}

	public Sender(Socket socket, String name) {
		this.name = name;
		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 스레드 처리작업
	// 채팅을 한번에 입력할 것이 아니기 때문에 무한루프를 이용 scanner로 데이터를 입력받고
	// 입력받은 내용을 연결된 출력 스트림을 통해ㅓ 출력 한다.
	@Override
	public void run() {
		
		sc = new Scanner(System.in);
		
		while (true) {
			try {
				out.writeUTF(name + " > "  + sc.nextLine()); // utf8로 인코딩해서 write
				// out.flush() 안해줘도 문제는 없었음
			} catch (IOException e) {
				e.printStackTrace();
				
//				System.out.println("종료");
				break; // 서버나 클라이언트 중에서 한쪽이 먼저 종료되면 에러 발생해서 종료시킴
			}
		}
	}

}
