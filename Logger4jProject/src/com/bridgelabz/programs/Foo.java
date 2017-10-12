package com.bridgelabz.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
	static final Logger logger = LoggerFactory.getLogger(Foo.class);

	public void doIt() {
		System.out.println("in foo ");
		logger.debug(" Did it again!");
		logger.trace("trace");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("Error");
		logger.info("INFO");
		logger.info("FATAL");
	}
}