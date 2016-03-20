package moduleFour.partTwo;

/**
 * Created by User on 13.03.2016.
 */
public class TemperatureConverter {
    public float convertCelsiusToFahrenheit(Temperature temperature){
        float celsiusTemperature = ((temperature.getTemperature() - 32)*5)/9;
        return celsiusTemperature;
    }

    public float convertFahrenheitToCelsius(Temperature temperature){
        float fahrenheitTemperature = 9*temperature.getTemperature()/5 + 32;
        return fahrenheitTemperature;

    }
}
