package moduleSix;

import java.util.*;

/**
 * Created by User on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Instrument instrument = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument2 = new Guitar("Guitar", "Cord", 2235);
        Instrument instrument3 = new Piano("Piano", "Mason&Hamlin", 1235);
        Instrument instrument4 = new Trumpet("Trumpet", "Sovok", 123);
        Instrument instrument5 = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument6 = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument7 = new Piano("Piano", "Mason&Hamlin", 1235);
        Instrument instrument8 = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument9 = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument10 = new Piano("Piano", "Mason&Hamlin", 1235);
        Instrument instrument11 = new Guitar("Guitar", "Yamaha", 1235);
        Instrument instrument12 = new Trumpet("Trumpet", "Sovok", 123);
        Instrument instrument13 = new Guitar("Guitar", "Cord", 2235);
        Instrument instrument14 = new Trumpet("Trumpet", "S&B", 123);

        MusicShop shop = new MusicShop();
        shop.addInstrument(instrument);
        shop.addInstrument(instrument2);
        shop.addInstrument(instrument3);
        shop.addInstrument(instrument4);
        shop.addInstrument(instrument5);
        shop.addInstrument(instrument6);

        Map<String, Integer> order1 = shop.order;
        order1.put("Guitar",4);
        order1.put("Piano",1);

        Map<String, Integer> order2 = shop.order;
        order2.put("Guitar",2);

        Map<String, Integer> order3 = shop.order;
        order3.put("Trumpet",1);

        shop.prepareInstruments(order1);
       // shop.prepareInstruments(order2);
        //shop.prepareInstruments(order3);

        shop.availableInstruments();


    }

}
