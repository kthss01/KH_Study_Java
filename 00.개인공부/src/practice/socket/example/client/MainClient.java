package practice.socket.example.client;

import java.io.InputStream;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		try {
			
			Socket cSocket = new Socket("192.168.35.30", 8888);
			
			InputStream inputData = cSocket.getInputStream();
			
			byte[] receiveBuffer = new byte[100];
			inputData.read(receiveBuffer);
			
			System.out.println(new String(receiveBuffer));
			
			cSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
