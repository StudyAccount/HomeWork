package moduleFive;

import java.util.Scanner;

/**
 * Created by User on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Select arrays length: ");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

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
