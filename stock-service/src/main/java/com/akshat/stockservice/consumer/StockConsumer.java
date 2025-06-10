package com.akshat.stockservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.akshat.basedomains.dto.OrderEvent;

@Component
public class StockConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(StockConsumer.class);
	
	@KafkaListener(topics = "${order.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void consume(OrderEvent orderEvent) {
		
		LOGGER.info(String.format("Order event received in stock service => %s", orderEvent.toString()));
	}
}
