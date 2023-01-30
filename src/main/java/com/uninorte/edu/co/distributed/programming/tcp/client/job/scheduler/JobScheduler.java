package com.uninorte.edu.co.distributed.programming.tcp.client.job.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.uninorte.edu.co.distributed.programming.tcp.client.service.MessageServiceInterface;

@Component
public class JobScheduler {
	
	@Autowired
	private MessageServiceInterface messageServiceInterface;
	
	@Scheduled(fixedDelay = 1000l)
	public void sendMessageJob() {
		messageServiceInterface.sendMessage();
	}

}
