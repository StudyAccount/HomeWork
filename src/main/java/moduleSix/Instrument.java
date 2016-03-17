package modulesix;

/**
 * Created by User on 17.03.2016.
 */
public abstract class Instrument {

    protected String name;
    protected String manufacturer;
    protected int price;

    public Instrument(String name,String manufacturer, int price){
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

    public void lot(){
        System.out.println("*" + name + " " + manufacturer + " " + price);
    }

    public abstract void sound();
}
