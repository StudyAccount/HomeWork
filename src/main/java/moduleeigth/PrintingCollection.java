package moduleeigth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 25.03.2016.
 */
public class PrintingCollection {

    public static void printCollection(Directory folder) {
        Iterator<File> iterator  = Directory.getFiles().iterator();
        while (iterator.hasNext()){
            File file = iterator.next();
            System.out.println("asd     "+ file.getLocation() + file.getName() + file.getExtension());
        }

    }
}
