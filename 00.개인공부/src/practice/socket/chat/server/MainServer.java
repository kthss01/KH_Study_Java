package practice.socket.chat.server;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket sSocket = new ServerSocket(8888);
			
			Socket cSocket = sSocket.accept();
			
			ReceiveThread recThread = new ReceiveThread();
			recThread.setSocket(cSocket);
			
			SendThread sendThread = new SendThread();
			sendThread.setSocket(cSocket);
			
			recThread.start();
			sendThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
