package practice.socket.example.server;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		try {
			ServerSocket sSocket = new ServerSocket(8888);
			
			Socket cSocket = sSocket.accept();
			
			OutputStream outputData = cSocket.getOutputStream();
			
			String sendDataString = "Welcome to My Server";
			outputData.write(sendDataString.getBytes());
			
			sSocket.close();
			cSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
