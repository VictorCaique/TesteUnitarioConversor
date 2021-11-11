/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAB202
 */
public class TesteConversorTest {
    
    @Test
    public void testConverteFahrenheitParaCelsius() {
        System.out.println("converteFahrenheitParaCelsius");
        double fahrenheit = 30;
        double expResult = -3.6;
        double result = TesteConversor.converteFahrenheitParaCelsius(fahrenheit);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testConverteCelsiusParaFahrenheit() {
        System.out.println("converteCelsiusParaFahrenheit");
        double celsius = 10.0;
        double expResult = 50.0;
        double result = TesteConversor.converteCelsiusParaFahrenheit(celsius);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
