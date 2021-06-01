package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	// 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
	// 서버와의 입출력 스트림 오픈
	// 보조 스트림을 통해 성능 개선
	// 스트림을 통해 읽고 쓰기
	// 통신 종료
	
	public void clientStart() {
		
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 먼저 알아야함
		
		int port = 8500;
		String serverIP = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 2. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			// 서버IP : 172.30.1.28 
			// 정해져있으면 serverIP 매개변수 String으로 넣어주면 됨
			// 시험에 나오는듯
			Socket server = new Socket(serverIP, port);
			
			System.out.println("서버와 연결이 되었습니다");
			
			// 3. 서버와의 입출력 스트림 오픈
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			
			// 4. 스트림을 통해 읽고 쓰기
			pw.println("반가워요");
			pw.flush();
			
			String message = br.readLine();
			System.out.println("서버가 보낸 메시지 : " + message);
			
			// 통신 종료
			br.close();
			pw.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
