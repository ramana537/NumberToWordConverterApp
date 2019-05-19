package com.virtusa.app.service;

import com.virtusa.app.exception.InputRangeException;

/**
 * Functional interface service is used to redirect to converter.  
 * 
 * @author nramana
 *
 */
@FunctionalInterface
public interface Service {
	public String convertorService(String inputNum) throws InputRangeException;
}
