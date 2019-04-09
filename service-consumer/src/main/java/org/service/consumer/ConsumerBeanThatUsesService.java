package org.service.consumer;

import org.slf4j.LoggerFactory;
import org.service.provider.CamelRass;
import org.slf4j.Logger;

public class ConsumerBeanThatUsesService {

	private final static Logger log = LoggerFactory.getLogger(ConsumerBeanThatUsesService.class);
	
	private CamelRass camelRass;
    
	public Integer useCamelRouteInsideServiceOneParameter() {
		log.info("inside seviceoneparameter");
		return camelRass.methodOne("Hello, I am using standard java interface ");
	}
	
	public Integer userCamelRouteInsideServiceTwoParameters() {
		log.info("Inside service two method");
		return camelRass.methodTwo("Java interface with two parameters....", "Will this work?");
	}
	
	public void setCamelRass(CamelRass camelRass) {
		this.camelRass = camelRass;
	}
	
	public CamelRass getCamelRass() {
		return this.camelRass;
	}
	
}
