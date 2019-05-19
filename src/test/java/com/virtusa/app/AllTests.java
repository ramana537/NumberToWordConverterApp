package com.virtusa.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;;

/**
 * This is the JUnit test Suite runner class to perform/execute all test cases in ConverterTest and ServiceTest classes.
 * 
 * @author nramana
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ ConverterTest.class})
public class AllTests {

}
