package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        int a = 5;
        int b = 5;
        int result = App.calculatorApp(1, a, b);

        assertEquals(result, 10);

        int multiplyResult = App.calculatorApp(2, a, b);

        assertEquals(multiplyResult, 25);
    }
}
