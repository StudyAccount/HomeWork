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

    public static void main(String[] args) {

        System.out.println("Choose what do you want to convert:\nCelsius press 1;\nFahrenheit press 2.");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();


        if (selection.equals("1")){
            float currentTemperature = readFloat("Enter the temperature in Celsius: ");
            Temperature temperatureInCelsius = new Temperature(currentTemperature);
            temperatureInCelsius.setTemperature(currentTemperature);

            TemperatureConverter temperatureInFahrenheit= new TemperatureConverter();
            float result = temperatureInFahrenheit.convertCelsiusToFahrenheit(temperatureInCelsius);
            System.out.println("Current temperature in Fahrenheit is "+ result);
        }else

        if(selection.equals("2")){
            float currentTemperature = readFloat("Enter the temperature in Fahrenheit: ");
            Temperature temperatureInFahrenheit = new Temperature(currentTemperature);
            temperatureInFahrenheit.setTemperature(currentTemperature);

            TemperatureConverter temperatureInCelsius = new TemperatureConverter();
            float result = temperatureInCelsius.convertFahrenheitToCelsius(temperatureInFahrenheit);
            System.out.println("Current temperature in Celsius is "+ result);
        } else {

            System.out.println("Entered incorrect value");
        }

    }
}
