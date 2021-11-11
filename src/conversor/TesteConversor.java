/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author LAB202
 */
public class TesteConversor {

    /**
     * @param args the command line arguments
     */
    public static double converteFahrenheitParaCelsius(double fahrenheit) {
       double celcius = 1.8*(fahrenheit-32);
       // double celcius = 0.55555555*(fahrenheit-32);
        return celcius;
    }
    
    public static double converteCelsiusParaFahrenheit(double celsius){
        double fahrenheit = 1.8*celsius+32;
        return fahrenheit;
    }
}
