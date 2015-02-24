package com.fdm.ExrciseExceptions;

public class InventoryLowException extends OutOfStockException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InventoryLowException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InventoryLowException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InventoryLowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InventoryLowException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
