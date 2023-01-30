package com.uninorte.edu.co.distributed.programming.tcp.client.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninorte.edu.co.distributed.programming.tcp.client.tcpclientagent.TCPClientGateway;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MessageServiceImplementation implements MessageServiceInterface{
	
	private Logger LOGGER=LoggerFactory.getLogger(MessageServiceImplementation.class);
	
	
	private TCPClientGateway tcpClientGateway;
	
	@Autowired
	public MessageServiceImplementation(TCPClientGateway tcpClientGateway) {
		this.tcpClientGateway=tcpClientGateway;
	}

	@Override
	public void sendMessage() {
		LocalDateTime datetime=LocalDateTime.now();
		String messageToBeSent=datetime.toString();
		byte[] messageReceived=tcpClientGateway.send(messageToBeSent.getBytes());
		LOGGER.info("Client Agent - Message Received: "+(new String(messageReceived)));
		
	}

}
