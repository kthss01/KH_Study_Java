package practice.socket.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {
	private Socket mSocket;
	
	@Override
	public void run() {
		super.run();
		
		try {
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(mSocket.getInputStream())); 
			
			String receiveString;
			
			while (true) {
				receiveString = tmpbuf.readLine();
				
				if (receiveString == null) {
					System.out.println("상대방 연결이 끊겼습니다.");
					break;
				} else {
					System.out.println("상대방(Client) : " + receiveString);
				}
			}
			
			tmpbuf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		mSocket = socket;
	}
}
