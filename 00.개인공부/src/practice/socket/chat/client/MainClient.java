package practice.socket.chat.client;

import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		try {
			
			Socket cSocket = new Socket("192.168.35.30", 8888);
			
			ReceiveThread recThread = new ReceiveThread();
			recThread.setSocket(cSocket);
			
			SendThread sendThread = new SendThread();
			sendThread.setSocket(cSocket);
			
			sendThread.start();
			recThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
