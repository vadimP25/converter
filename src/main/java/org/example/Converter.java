package org.example;

public class Converter {

    public double convertToCelcius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }
    public double convertToFahrenheit(double celcius){
        return celcius * 1.8 + 32;
    }
}
