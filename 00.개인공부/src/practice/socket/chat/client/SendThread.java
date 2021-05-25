package practice.socket.chat.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {
	
	private Socket mSocket;
	
	@Override
	public void run() {
		super.run();
		
		try {
			
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter sendWriter = new PrintWriter(mSocket.getOutputStream());
			
			String sendString;
			
			while (true) {
				sendString = tmpbuf.readLine();
				
				if (sendString.equals("exit")) {
					break;
				}
				
				sendWriter.println(sendString);
				sendWriter.flush();
			}
			
			sendWriter.close();
			tmpbuf.close();
			mSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		mSocket = socket;
	}
	
}
