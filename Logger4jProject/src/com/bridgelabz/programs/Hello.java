package com.bridgelabz.programs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
	public static void main(String args[])
	{
	Logger logger=LoggerFactory.getLogger(Hello.class);
	 java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger("Hello");
javaLogger.severe("severe");
javaLogger.finer("finer");
javaLogger.fine("fine");
logger.warn("warn");
logger.debug("debug");
	
		
	}
}
