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

        Array array = new Array();
        array.setSize(selection);

        array.initArray(selection);


        //array.printArray();

    }

}
