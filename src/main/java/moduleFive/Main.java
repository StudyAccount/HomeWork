package moduleFive;

import java.util.InputMismatchException;
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
            }  catch (InputMismatchException e){
                System.out.println("You have entered not Integer number");
            }
        }
    }

    private static void negativeInput(int input){

        if (input <= 0){
            throw new NegativeArraySizeException();
        }
    }

    public static void main(String[] args) {

        int selection = readInt("Select arrays length: ");

        try {
            negativeInput(selection);

            Array newArray = new Array();
            newArray.setSize(selection);

            int[] inputArray = newArray.initArray(selection);
            System.out.println("-------------------------------------------------");
            System.out.println("Your input array is:");
            newArray.printArray(inputArray);

            int[] outputArray = QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
            System.out.println("-------------------------------------------------");
            System.out.println("Your sorted array is:");
            newArray.printArray(outputArray);

            System.out.println("-------------------------------------------------");
            System.out.println("min and max elements are:");
            System.out.println("min: " + outputArray[0]);
            System.out.println("max: " + outputArray[outputArray.length - 1]);

        } catch (NegativeArraySizeException e){
            System.out.println("Your array must contain at least 1 element");
        }
    }


}
