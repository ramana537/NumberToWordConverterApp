package com.virtusa.app.exception;

/**
 * Created Custom Input Range handled exception class.
 * 
 * @author nramana
 *
 */
public class InputRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	private String messageKey;

	public InputRangeException() {
        super();
    }
	
	public InputRangeException(String message) {
		super(message);
	}
	
	public InputRangeException(String message, String messageKey) {
		super(message);
		this.messageKey = messageKey;
	}
	
    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }
}
