package com.rbailen.cloudstream.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

import com.rbailen.cloudstream.model.Payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@EnableBinding(Sink.class)
public class ExchangeToQueueService {

	@StreamListener(Sink.INPUT)
	public void processRegisterEmployees(Payment payment) {
		log.debug(payment.toString());	
	}
	
}
