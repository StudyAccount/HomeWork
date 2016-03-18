package moduleSix;

/**
 * Created by User on 17.03.2016.
 */
public class Guitar extends Instrument {

    public Guitar(String name, String manufacturer, int price){
        super(name, manufacturer, price);
    }

    @Override
    public void setName(String name) {
        super.setName("Guitar");
    }

}
