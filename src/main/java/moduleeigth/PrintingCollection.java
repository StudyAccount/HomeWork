package moduleeigth;

import java.util.Iterator;

/**
 * Created by User on 25.03.2016.
 */
public class PrintingCollection {

    public static void printCollection(Directory folder)
    {
        Iterator<File> iteratorCounting  = folder.getFiles().iterator();
        int maxLength = 0;
        int counter = 0;

        while (iteratorCounting.hasNext()){
            File file = iteratorCounting.next();
            int localMaxLength = file.getName().length();

            if (localMaxLength > maxLength){
                maxLength = localMaxLength;
            }
        }

        Iterator<File> iteratorPrinting = folder.getFiles().iterator();

        while (iteratorPrinting.hasNext()){
            File file = iteratorPrinting.next();
            counter = ++counter;
            System.out.print("| " + counter + "\t|");
            System.out.printf("%-20s", file.getName());
            System.out.print("|" + file.getExtension() + "\t|");
            System.out.printf("%-8s", file.getSize());
            System.out.println("|");
        }
    }

//    public static void  printSortedCollection(SortedDirectory folder){
//        Iterator<File> iteratorPrinting = folder.getFiles().iterator();
//        int counter = 0;
//
//        while (iteratorPrinting.hasNext()){
//            File file = iteratorPrinting.next();
//            counter = ++counter;
//            System.out.print("| " + counter + "\t|");
//            System.out.printf("%-20s", file.getName());
//            System.out.print("|" + file.getExtension() + "\t|");
//            System.out.printf("%-8s", file.getSize());
//            System.out.println("|");
//        }
//
//    }
}
