package org.service.provider.impl;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author rootlinear
 *
 */

public class ServiceProcessor implements Processor {

	private final static Logger log = LoggerFactory.getLogger(ServiceProcessor.class);

	public void process(Exchange exchange) throws Exception {
     Integer value;
     
     String body = exchange.getIn().getBody(String.class);
     if(body != null)
     {
       log.info("Route invoke from methodOne");
        value = body.length();
     }
     else {
       log.info("Rout invokde from methodTwo");
       String arg0 = exchange.getIn().getHeader("ARG0", String.class);
       String arg1 = exchange.getIn().getHeader("ARG1", String.class);
       value = arg0.length() + arg1.length();
     }
     exchange.getIn().setBody(value);
	}
}
