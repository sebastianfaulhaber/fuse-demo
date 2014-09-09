package com.redhat.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyPersonProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// Get message body
		String xml = exchange.getIn().getBody(String.class);
		
		// Process payload
		xml = xml.replaceAll("firstName", "myPersonProcessorFirstName");
		
		// Write back to exchange
		exchange.getIn().setBody(xml);
	}

}
