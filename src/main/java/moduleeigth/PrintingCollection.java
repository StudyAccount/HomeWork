package moduleeigth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 25.03.2016.
 */
public class PrintingCollection {

    public static void printCollection(Directory folder)
    {
        Iterator<File> iterator  = folder.getFiles().iterator();
        int maxLength = 0;
        int counter = 0;
        while (iterator.hasNext()){
            File file = iterator.next();
            int localMaxLength = file.getName().length();

            if (localMaxLength > maxLength){
                maxLength = localMaxLength;
            }
            counter = ++counter;

            System.out.println("| "+ counter + "\t|" + file.getName() + "\t | \t" + file.getExtension()+ "\t | \t" + file.size + "\t | \t" );
        }
        System.out.println( maxLength);




    }
}
