package moduleFive;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
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
        for (int i = 0; i <size; i++) {
            Random rand = new Random();
            inputArray[i] = rand.nextInt();
            System.out.println(inputArray[i]);
        }
        return inputArray;
    }

    public void printArray(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
