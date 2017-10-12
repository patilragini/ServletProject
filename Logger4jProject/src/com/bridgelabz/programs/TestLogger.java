
package com.bridgelabz.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.simple.SimpleLogger;

public class TestLogger {
	static Logger logger = LoggerFactory.getLogger(TestLogger.class);

	public static void main(String[] args) {
		 System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "TRACE");
		logger.trace("trace");
		logger.debug("DEBUG");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("Error");
		logger.info("INFO");
		logger.info("FATAL");
		Foo f = new Foo();
		f.doIt();
		logger.info("info Exiting application.");

	}
}
