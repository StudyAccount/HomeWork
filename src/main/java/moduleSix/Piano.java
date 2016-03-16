package moduleSix;

/**
 * Created by User on 17.03.2016.
 */
public class Piano extends Instrument {

    public Piano(String name, String manufacturer, int price) {
        super("Piano", manufacturer, price);
    }

    @Override
    public void sound() {
        System.out.println("Has a piano sound");
    }
}
