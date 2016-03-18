package moduleSix;

import java.util.*;

/**
 * Created by User on 17.03.2016.
 */
public class MusicShop {

    protected static List<Instrument> instruments = new ArrayList<Instrument>();

    public static List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    protected float revenue;

    public float getRevenue() {
        return revenue;
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }

    Map<String, Integer> order = new HashMap<String, Integer>();

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {
        ArrayList<Instrument> result = new ArrayList<Instrument>();

        for (Map.Entry<String,Integer> orderEntry:order.entrySet()) {
            String instrumentType = orderEntry.getKey();
            Integer numberOfInstrumentsToBeRemoved = orderEntry.getValue();
            int numberOfAnimalsRemoved=0;
            for (Instrument instrument : MusicShop.getInstruments()) {
                if (instrument.getName().equals(instrumentType)&& numberOfAnimalsRemoved<numberOfInstrumentsToBeRemoved){
                    result.add(instrument);
                    numberOfAnimalsRemoved++;
                }
            }
            if (numberOfAnimalsRemoved<numberOfInstrumentsToBeRemoved)
                throw new IllegalArgumentException("Shop does not have enough " + instrumentType + "s");
        }
        return result;
    }

    public static void sellInstruments ( Map<String,Integer> order){
        for (Map.Entry<String,Integer>orderEntry :order.entrySet()) {
            String instrumentType = orderEntry.getKey();
            Integer numberOfInstrumentsToBeRemoved = orderEntry.getValue();
            int numberOfAnimalsRemoved=0;
            Iterator<Instrument> iterator = MusicShop.getInstruments().iterator();
            while (iterator.hasNext()){
                Instrument instrument = iterator.next();
                if (instrument.getName().equals(instrumentType)&& numberOfAnimalsRemoved<numberOfInstrumentsToBeRemoved){
                    iterator.remove();
                    numberOfAnimalsRemoved++;
                }
            }
        }
    }

    public static List<Instrument> availableInstruments(){
        ArrayList<Instrument> result = new ArrayList<Instrument>();
        if (!instruments.isEmpty()){
            for (Instrument instrumentsAvailable : instruments) {
                instrumentsAvailable.lot();
            }
        }
        return result;
    }


}
