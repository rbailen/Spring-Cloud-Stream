package com.rbailen.cloudstream.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.rbailen.cloudstream.model.Payment;
import com.rbailen.cloudstream.processor.Processor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@EnableBinding(Processor.class)
public class QueueToExChangeService {
	
	private static final Double INTEREST = 1.21;

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Payment eventHandler(Payment payment) {
		log.debug(payment.toString());		
		payment.setTotal(payment.getTotal() * INTEREST);	
		return payment;
	}
	
}
