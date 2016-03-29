package moduleSix;

import java.util.*;

/**
 * Created by User on 17.03.2016.
 */
public class MusicShop {

    private static List<Instrument> instruments = new ArrayList<Instrument>();
    private int revenue;

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {
        ArrayList<Instrument> result = new ArrayList<Instrument>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {

            String instrumentType = orderEntry.getKey();
            Integer numberOfInstrumentsToBeRemoved = orderEntry.getValue();

            int numberOfInstrumentsShouldBeRemoved=0;

            for (Instrument instrument : MusicShop.getInstruments()) {
                if (instrument.getName().equals(instrumentType) && numberOfInstrumentsShouldBeRemoved < numberOfInstrumentsToBeRemoved){
                    result.add(instrument);
                    numberOfInstrumentsShouldBeRemoved++;
                }
            }

            if (numberOfInstrumentsShouldBeRemoved < numberOfInstrumentsToBeRemoved) {
                throw new IllegalArgumentException("Shop does not have enough " + instrumentType +
                        "s for order " + order.entrySet() + "\n"
                        + "Available " + instrumentType + "s are: " + numberOfInstrumentsShouldBeRemoved);
            }
        }
        return result;
    }

    public void sellInstruments ( Map<String, Integer> order){

        for (Map.Entry<String,Integer>orderEntry : order.entrySet()) {

            String instrumentType = orderEntry.getKey();
            Integer numberOfInstrumentsToBeRemoved = orderEntry.getValue();

            int numberOfInstrumentsRemoved = 0;

            Iterator<Instrument> iterator = MusicShop.getInstruments().iterator();

            while (iterator.hasNext()){

                Instrument instrument = iterator.next();
                if (instrument.getName().equals(instrumentType) && numberOfInstrumentsRemoved <  numberOfInstrumentsToBeRemoved){

                    iterator.remove();
                    numberOfInstrumentsRemoved++;
                }
            }
        }
    }

    public void availableInstruments(){
        if (!instruments.isEmpty()){
            for (Instrument instrumentsAvailable : instruments) {
                System.out.println(instrumentsAvailable.toString());
            }
        }
    }

    public static List<Instrument> getInstruments() {
        return instruments;
    }

    public void addInstrument(Instrument instrument){
        instruments.add(instrument);
    }


    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public int getRevenue() {
        return revenue;
    }

}
