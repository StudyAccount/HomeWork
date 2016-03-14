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

    public void initArray(int size) {
        int[] inputArray = new int[size];
        for (int i = 0; i <size; i++) {
            Random rand = new Random();
            inputArray[i] = rand.nextInt();
            System.out.println(inputArray[i]);
        }
    }

    public void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");

        }
    }
}
