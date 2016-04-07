package moduleFour.partTwo;

/**
 * Created by User on 13.03.2016.
 */
public class TemperatureConverter {

    public static final int DEGREE_CONSTANT = 32;
    public static final int CONVERSION_FACTOR_FIRST = 5;
    public static final int CONVERSION_FACTOR_SECOND = 9;

    public float convertCelsiusToFahrenheit(Temperature temperature){
        float celsiusTemperature = CONVERSION_FACTOR_SECOND * temperature.getTemperature() /
                CONVERSION_FACTOR_FIRST + DEGREE_CONSTANT;
//        float celsiusTemperature = ((temperature.getTemperature() - DEGREE_CONSTANT) *
//                CONVERSION_FACTOR_FIRST) / CONVERSION_FACTOR_SECOND;
        return celsiusTemperature;
    }


    public float convertFahrenheitToCelsius(Temperature temperature){
        float fahrenheitTemperature = ((temperature.getTemperature() - DEGREE_CONSTANT) *
                CONVERSION_FACTOR_FIRST) / CONVERSION_FACTOR_SECOND;
//        float fahrenheitTemperature = CONVERSION_FACTOR_SECOND * temperature.getTemperature() /
//                CONVERSION_FACTOR_FIRST + DEGREE_CONSTANT;
        return fahrenheitTemperature;

    }
}
