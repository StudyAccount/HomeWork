package moduleSix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17.03.2016.
 */
public class MusicShop {

    protected List<Instrument> instruments = new ArrayList<Instrument>();

    protected float revenue;

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }

    public void sellInstrument(Instrument instrument){

    }

    public void sale(Instrument instruments) {


    }
}
