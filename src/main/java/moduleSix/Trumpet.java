package moduleSix;

/**
 * Created by User on 17.03.2016.
 */
public class Trumpet extends Instrument {
    public Trumpet(String name, String manufacturer, int price) {
        super("Trumpet", manufacturer, price);
    }

    @Override
    public String getName() {
        return "Trumpet";
    }
    //    @Override
//    public void setName(String name) {
//        super.setName("Trumpet");
//    }

}
