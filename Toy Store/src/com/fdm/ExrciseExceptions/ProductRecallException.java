package com.fdm.ExrciseExceptions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ProductRecallException extends OutOfStockException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(OutOfStockException.class);

	public ProductRecallException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductRecallException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ProductRecallException(String message) {
		super(message);
		PropertyConfigurator.configure("log4j.properties");
		log.error(message);
	}

	public ProductRecallException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
