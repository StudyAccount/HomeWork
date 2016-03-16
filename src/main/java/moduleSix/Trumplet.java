package moduleSix;

/**
 * Created by User on 17.03.2016.
 */
public class Trumplet extends Instrument {
    public Trumplet(String name, String manufacturer, int price) {
        super("Trumplet", manufacturer, price);
    }

    @Override
    public void sound() {
        System.out.println("Has a trumplet sound");
    }
}
