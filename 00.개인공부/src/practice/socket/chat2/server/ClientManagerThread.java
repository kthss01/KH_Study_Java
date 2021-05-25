package practice.socket.chat2.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManagerThread extends Thread {

	private Socket mSocket;
	private String mID;
	
	@Override
	public void run() {
		super.run();
		
		try {
			
			BufferedReader tmpbuffer = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
			
			String text;
			
			while (true) {
				text = tmpbuffer.readLine();
				
				if (text == null) {
					System.out.println(mID + "이(가) 나갔습니다.");
					for (int i = 0; i < ChatServer.mOutputList.size(); i++) {
						ChatServer.mOutputList.get(i).println(mID + "이(가) 나갔습니다.");
						ChatServer.mOutputList.get(i).flush();
					}
					break;
				}
				
				String[] split = text.split("highkrs12345");
				if (split.length == 2 && split[0].equals("ID")) {
					mID = split[1];
					System.out.println(mID + "이(가) 입장하였습니다.");
					for (int i = 0; i < ChatServer.mOutputList.size(); i++) {
						ChatServer.mOutputList.get(i).println(mID + "이(가) 입장하였습니다.");
						ChatServer.mOutputList.get(i).flush();
					}
					continue;
				}
				
				for (int i = 0; i < ChatServer.mOutputList.size(); i++) {
					ChatServer.mOutputList.get(i).println(mID + "> " + text);
					ChatServer.mOutputList.get(i).flush();
				}
			}
			
			ChatServer.mOutputList.remove(new PrintWriter(mSocket.getOutputStream()));
			mSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		mSocket = socket;
	}

}
