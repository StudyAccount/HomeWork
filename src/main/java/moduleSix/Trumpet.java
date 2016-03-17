package modulesix;

/**
 * Created by User on 17.03.2016.
 */
public class Trumpet extends Instrument {
    public Trumpet(String name, String manufacturer, int price) {
        super("Trumpet", manufacturer, price);
    }

    @Override
    public void sound() {
        System.out.println("Has a trumpet sound");
    }
}
