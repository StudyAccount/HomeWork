package moduleSix;

/**
 * Created by User on 17.03.2016.
 */
public abstract class Instrument {

    private String name;
    private String manufacturer;
    private int price;

    public Instrument(String name, String manufacturer, int price){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String  getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("*** " + name + " " + manufacturer + " " + price);
    }

    enum InstrumentName{
        GUITAR, TRUMPET, PIANO
    }
}
