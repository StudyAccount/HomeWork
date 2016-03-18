package modulesix;

/**
 * Created by User on 17.03.2016.
 */
public class Piano extends Instrument {

    public Piano(String name, String manufacturer, int price) {
        super(name, manufacturer, price);
    }

    @Override
    public void setName(String name) {
        super.setName("Piano");
    }
}
