package com.virtusa.app;

import java.util.Scanner;
import com.virtusa.app.exception.InputRangeException;
import com.virtusa.app.service.Service;
import com.virtusa.app.service.impl.ServiceImpl;

/**
 * This is the main class, take a number and convert to equivalent number in British English words.
 * 
 * @author nramana
 *
 */
public class NumberToWordConverter {

	public static final String ENTER_NUMBER = "Please enter a number : ";
	public static final String INVALID_NUMBER = "You entered an Invalid Integer Number or out of integer Range";
	
	public static void main(String[] args) {
		Service service;
		String result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(ENTER_NUMBER);
		String inputNumber = scanner.nextLine();
		service = new ServiceImpl();
		
		try {
			result = service.convertorService(inputNumber);
		} catch(InputRangeException e) {
			result = e.getMessage();
		} catch(NumberFormatException e) {
			result = INVALID_NUMBER;
		}
		System.out.println(result);
		scanner.close();
	}
}
