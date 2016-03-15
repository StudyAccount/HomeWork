package moduleFive;

import java.util.Scanner;

/**
 * Created by User on 13.03.2016.
 */
public class Main {

    private static int readInt(String message){
        while(true) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("You have to type int expression, try again");
            }
        }
    }

    public static void main(String[] args) {

        int selection = readInt("Select arrays length: ");

        Array newArray = new Array();
        newArray.setSize(selection);

        int[] inputArray = newArray.initArray(selection);

        System.out.println("Your input array is:");
        newArray.printArray(inputArray);

        QuickSort makeSort = new QuickSort();

        int[] outputArray =makeSort.quickSort(inputArray,0,inputArray.length-1);
        System.out.println("Your sorted array is:");
        newArray.printArray(outputArray);

        System.out.println("min and max elements are:");
        System.out.println("min: "+outputArray[0]);
        System.out.println("max: "+outputArray[outputArray.length-1]);

    }

}
