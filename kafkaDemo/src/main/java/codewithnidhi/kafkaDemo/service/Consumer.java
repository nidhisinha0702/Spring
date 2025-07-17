package codewithnidhi.kafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "codewithnidhi_Topic", groupId = "codewithnidhi_group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message received is "+receivedMessage);
	}
}
