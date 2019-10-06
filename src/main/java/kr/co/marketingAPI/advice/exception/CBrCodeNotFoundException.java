package kr.co.marketingAPI.advice.exception;

public class CBrCodeNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public CBrCodeNotFoundException(String msg, Throwable t) {
		super(msg, t);
	}
	public CBrCodeNotFoundException(String msg) {
		super(msg);
	}
	public CBrCodeNotFoundException() {
		super();
	}
}
