package practice.socket.chat.client;

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
				
				System.out.println("상대방(Server) : " + receiveString);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		mSocket = socket;
	}
}
