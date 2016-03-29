package moduleSix;

import java.util.HashMap;
import java.util.Map;

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
        shop.addInstrument(instrument8);
        shop.addInstrument(instrument10);
        shop.addInstrument(instrument13);

        System.out.println("<<< Instruments in the shop >>>");
        shop.availableInstruments();

        Map<String, Integer> order1 = new HashMap<String, Integer>();
        order1.put("Guitar", 4);
        order1.put("Piano", 1);

        try {
            shop.prepareInstruments(order1);
            shop.sellInstruments(order1);
            System.out.println("<<< Instruments in the shop after 1 order >>>");
            shop.availableInstruments();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }

        Map<String, Integer> order2 = new HashMap<String, Integer>();
        order2.put("Trumpet", 1);
        order2.put("Piano",1);
        order2.put("Guitar", 1);

        try {
            shop.prepareInstruments(order2);
            shop.sellInstruments(order2);
            System.out.println("<<< Instruments in the shop after 2 order >>>");
            shop.availableInstruments();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        Map<String, Integer> order3 = new HashMap<String, Integer>();
        order3.put("Piano",1);

        try {
            shop.prepareInstruments(order3);
            shop.sellInstruments(order3);
            System.out.println("<<< Instruments in the shop after 2 order >>>");
            shop.availableInstruments();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
