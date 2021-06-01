package com.kh.chap02_socket.part02_chat.run;

import com.kh.chap02_socket.part02_chat.controller.ChatClientManager;

public class ClientRun {

	public static void main(String[] args) {
		ChatClientManager c = new ChatClientManager();
		c.startClient();
	}

}
