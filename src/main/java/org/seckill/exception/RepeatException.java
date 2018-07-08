package org.seckill.exception;

public class RepeatException extends SeckillException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RepeatException(String message){
		super(message);
	}
	
	public RepeatException(String message,Throwable cause){
		super(message, cause);
	}
	
	
	

}
