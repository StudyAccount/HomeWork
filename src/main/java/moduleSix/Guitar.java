package modulesix;

/**
 * Created by User on 17.03.2016.
 */
public class Guitar extends Instrument {

    public Guitar(String name, String manufacturer, int price){
        super("Guitar", manufacturer, price);
    }

    @Override
    public String getName() {
        return "Guitar";
    }
}
