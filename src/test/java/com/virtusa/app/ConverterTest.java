package com.virtusa.app;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import com.virtusa.app.converter.impl.ConverterImpl;
import com.virtusa.app.exception.InputRangeException;
import com.virtusa.app.service.impl.ServiceImpl;

/**
 * This class is used to all execute all possible test scenarios.
 * 
 * @author nramana
 *
 */
public class ConverterTest {
		
	private static ConverterImpl converter;
	private static ServiceImpl service;
	
	@BeforeClass
	public static void init() throws Exception {
		converter = new ConverterImpl();
		service = new ServiceImpl();
	}

	@Test
	public void convertTest() {
		assertEquals("one",converter.convert(1));
	}
	
	@Test
	public void convertTestFor96845632() {
		assertEquals("ninety six million eight hundred and forty five thousand six hundred and thirty two", converter.convert(96845632));
	}
	
	@Test
	public void validInputOnetest() throws InputRangeException {
		assertEquals("one",service.convertorService("1"));
	}
	
	@Test
	public void validInputSixtyOneTest() throws InputRangeException {
		assertEquals( "sixty one",service.convertorService("61"));
	}
	
	@Test
	public void validInputoneHundredAndFiveTest() throws InputRangeException {
		assertEquals("one hundred and five", service.convertorService("105"));
	}
	
	@Test
	public void validInputtest() throws InputRangeException {
		assertEquals( "fifty six million nine hundred and forty five thousand seven hundred and eighty one", service.convertorService("56945781"));
	}
	
	@Test(expected = InputRangeException.class)
	public void inputMoreThanRangetest() throws InputRangeException {
		assertEquals(service.convertorService("1000000000"), "jkdjfkldj");
	}
	
	@Test(expected = InputRangeException.class)
	public void inputBelowRangetest() throws InputRangeException {
		assertEquals(service.convertorService("0"), "oifndfj");
	}
}
