package com.virtusa.app.converter;

/**
 * This Functional Interface is used to convert the given number to English words and perform the logic computations.
 * 
 * @author nramana
 *
 */
@FunctionalInterface
public interface Converter {
	public String convert(int num);
}
