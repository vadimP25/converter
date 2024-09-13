package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to convert (enter 'C' for Celsius to Fahrenheit, 'F' for Fahrenheit to Celsius):");
        String result = scanner.nextLine();

        if (result.equalsIgnoreCase("C")) {
            System.out.println("Enter your value (Celsius):");
            double celsius = scanner.nextDouble();
            System.out.println("Result in Fahrenheit: " + converter.convertToFahrenheit(celsius));
        } else if (result.equalsIgnoreCase("F")) {
            System.out.println("Enter your value (Fahrenheit):");
            double fahrenheit = scanner.nextDouble();
            System.out.println("Result in Celsius: " + converter.convertToCelcius(fahrenheit));
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }

        // Закриття сканера після завершення роботи
        scanner.close();
    }
}