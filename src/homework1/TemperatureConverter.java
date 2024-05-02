package homework1;

import java.util.Scanner;
//Create a program that converts temperature from Celsius to Fahrenheit. Prompt the user to enter a temperature in Celsius, perform the conversion, and display the result.

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Input the temperature in Celsius no convert it to Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);

        double celsiusTemperature = scanner.nextDouble();
        double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheitTemperature);
    }
}
