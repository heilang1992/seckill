package org.seckill.exception;

public class SeckillCloseExcuption extends SeckillException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeckillCloseExcuption(String message){
		super(message);
	}
	
	public SeckillCloseExcuption(String message,Throwable cause){
		super(message, cause);
	}
	
}
