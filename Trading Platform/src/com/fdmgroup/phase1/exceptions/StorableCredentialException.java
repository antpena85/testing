package com.fdmgroup.phase1.exceptions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StorableCredentialException extends StorableExceptions {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(StorableExceptions.class);
	public StorableCredentialException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StorableCredentialException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public StorableCredentialException(String message) {
		super(message);
		PropertyConfigurator.configure("log4j.properties");
		log.error(message);
	}
	public StorableCredentialException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


}
