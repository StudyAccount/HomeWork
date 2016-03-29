package moduleFour.partTwo;

import java.util.Scanner;

/**
 * Created by User on 13.03.2016.
 */
public class Main {

    private static float readFloat(String message){
        while(true) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (Exception E) {
                System.out.println("Wrong input");
            }
        }
    }

    public static String chooseInput(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        String selection = chooseInput("Choose what do you want to convert:\nCelsius press 1;\nFahrenheit press 2.");

        if ("1".equals(selection)) {

            float currentTemperature = readFloat("Enter the temperature in Celsius: ");

            Temperature temperatureInCelsius = new Temperature(currentTemperature);
            temperatureInCelsius.setTemperature(currentTemperature);

            TemperatureConverter temperatureInFahrenheit = new TemperatureConverter();
            float result = temperatureInFahrenheit.convertCelsiusToFahrenheit(temperatureInCelsius);
            System.out.println("Current temperature in Fahrenheit is " + result);

        } else {

            if ("2".equals(selection)) {
                float currentTemperature = readFloat("Enter the temperature in Fahrenheit: ");

                Temperature temperatureInFahrenheit = new Temperature(currentTemperature);
                temperatureInFahrenheit.setTemperature(currentTemperature);

                TemperatureConverter temperatureInCelsius = new TemperatureConverter();
                float result = temperatureInCelsius.convertFahrenheitToCelsius(temperatureInFahrenheit);
                System.out.println("Current temperature in Celsius is " + result);
            } else {
                System.out.println("Entered incorrect value");
            }

        }
    }
}
