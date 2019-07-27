package com.rbailen.cloudstream.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface Processor {

	final String INPUT = "processorInput";
	final String OUTPUT = "processorOuput";
	 
    @Input(INPUT)
    SubscribableChannel myInput();
 
    @Output(OUTPUT)
    MessageChannel anOutput();
    
}
