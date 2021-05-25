package practice.socket.chat2.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	public static ArrayList<PrintWriter> mOutputList;
	
	public static void main(String[] args) {
		
		mOutputList = new ArrayList<PrintWriter>();
		
		try {
			
			ServerSocket sSocket = new ServerSocket(8888);
			
			while (true) {
				Socket cSocket = sSocket.accept();
				ClientManagerThread cThread = new ClientManagerThread();
				cThread.setSocket(cSocket);
				
				mOutputList.add(new PrintWriter(cSocket.getOutputStream()));
				
				cThread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
