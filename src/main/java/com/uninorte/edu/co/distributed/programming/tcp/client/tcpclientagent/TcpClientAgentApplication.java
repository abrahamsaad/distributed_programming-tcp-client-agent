package com.uninorte.edu.co.distributed.programming.tcp.client.tcpclientagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.uninorte.edu.co.distributed.programming.*")
public class TcpClientAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcpClientAgentApplication.class, args);
	}

}
