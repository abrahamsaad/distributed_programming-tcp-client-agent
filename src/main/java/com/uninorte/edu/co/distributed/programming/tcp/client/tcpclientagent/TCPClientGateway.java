package com.uninorte.edu.co.distributed.programming.tcp.client.tcpclientagent;


import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway(defaultRequestChannel = "outboundChannel")
public interface TCPClientGateway {
	
	byte[] send(byte[] data);

}
