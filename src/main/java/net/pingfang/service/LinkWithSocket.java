package net.pingfang.service;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by hdhong on 2018/03/27.
 */
@Service
public class LinkWithSocket {
	@Value("${outerlink.internal.outgoing.socket.ip}")
	private String ip;
	
	@Value("${outerlink.internal.outgoing.socket.port}")
	private int port;
	
	//向内部服务发消息，用UTF-f (内部固定用utf-8)
	public void sendMessageBySocket(String message) throws  IOException {
		Socket server = new Socket(ip, port);
		OutputStreamWriter out = new OutputStreamWriter(server.getOutputStream(), "UTF-8");
		out.write(message);
		out.close();
		server.close();
		
	}

}
