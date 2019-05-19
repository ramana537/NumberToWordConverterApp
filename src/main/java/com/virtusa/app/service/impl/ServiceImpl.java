package com.virtusa.app.service.impl;

import com.virtusa.app.converter.Converter;
import com.virtusa.app.converter.impl.ConverterImpl;
import com.virtusa.app.exception.InputRangeException;
import com.virtusa.app.service.Service;

/**
 * This class is used to handle input number validations and act as a service layer between main class and actual number converter class.
 * This Service is redirect the request to Converter class.
 * 
 * @author nramana
 *
 */
public class ServiceImpl implements Service {
	public static final String INVALID_NUMBER = "You entered an Invalid Integer Number";
	public static final String NUMBER_BETWEEN_RANGE = "Enter numbers between 0 and 999,999,999.";

	public String convertorService(String inputNumb) throws InputRangeException {

		String converterStr;
		Converter converter;
		int inputNumber;
		try {
			inputNumber = Integer.parseInt(inputNumb.trim());
		} catch (NumberFormatException e) {
			return INVALID_NUMBER;
		}
		if (inputNumber <= 0 || inputNumber > 999999999) {
			throw new InputRangeException(NUMBER_BETWEEN_RANGE);
		} else {
			converter = new ConverterImpl();
			converterStr = converter.convert(inputNumber);
			return converterStr;
		}
	}
}
