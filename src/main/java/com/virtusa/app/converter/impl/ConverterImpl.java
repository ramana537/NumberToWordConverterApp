package com.virtusa.app.converter.impl;

import com.virtusa.app.converter.Converter;

/**
 * This class is used to convert given input number to English words.
 * 
 * @author nramana
 *
 */
public class ConverterImpl implements Converter {

	ConverterImpl converterImpl;
	StringBuilder stringBuilder = new StringBuilder();
	public static final String[] NUMBERS_IN_ENGLISH_0_TO_19 = { "", " one", " two", " three", " four", " five", " six",
			" seven", " eight", " nine", " ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public static final String[] NUMBERS_IN_ENGLISH_IN_TENS = { "", "", " twenty", " thirty", " forty", " fifty",
			" sixty", " seventy", " eighty", " ninety" };

	public String convert(int num) {
		converterImpl = new ConverterImpl();
		converterImpl.convertToWords((num / 100000000), " hundred", (num / 1000000) % 100, " million");
		converterImpl.convertToWords(((num / 100000) % 10), " hundred", ((num / 1000) % 100), " thousand");
		converterImpl.convertToWords(((num / 100) % 10), " hundred", (num % 100), "");
		return converterImpl.stringBuilder.toString().trim();
	}

	private void convertToWords(int n1, String ch1, int n2, String ch2) {
		if (n1 > 19) {
			stringBuilder.append(NUMBERS_IN_ENGLISH_IN_TENS[n1 / 10] + "" + NUMBERS_IN_ENGLISH_0_TO_19[n1 % 10]);
		} else {
			stringBuilder.append(NUMBERS_IN_ENGLISH_0_TO_19[n1]);
		}
		if (n1 > 0)
			stringBuilder.append(ch1);
		if (n1 != 0 && n2 > 0)
			stringBuilder.append(" and");

		if (n2 > 19) {
			stringBuilder.append(NUMBERS_IN_ENGLISH_IN_TENS[n2 / 10] + "" + NUMBERS_IN_ENGLISH_0_TO_19[n2 % 10]);
		} else {
			stringBuilder.append(NUMBERS_IN_ENGLISH_0_TO_19[n2]);
		}
		if (n1 > 0 || n2 > 0)
			stringBuilder.append(ch2);
	}
}
