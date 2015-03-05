package com.fdmgroup.phase1.exceptions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StorableNullException extends StorableExceptions {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(StorableExceptions.class);

	public StorableNullException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StorableNullException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public StorableNullException(String message) {
		super(message);
		PropertyConfigurator.configure("log4j.properties");
		log.error(message);
	}

	public StorableNullException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
