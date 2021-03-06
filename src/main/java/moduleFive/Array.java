package moduleFive;

import java.util.Random;

/**
 * Created by User on 14.03.2016.
 */
public class Array {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] initArray(int size) {

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            inputArray[i] = rand.nextInt();
        }

        return inputArray;
    }

    public void printArray(int[] array) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i : array) {
            stringBuilder.append(i++ + ", ");
        }

        System.out.println(stringBuilder.toString());
    }


}
