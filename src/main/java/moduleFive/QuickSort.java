package moduleFive;

import static java.lang.Math.random;

/**
 * Created by User on 13.03.2016.
 */
public class QuickSort {

    public static int reshuffle(int array[], int firstIndex, int lastIndex) {

        int temp;
        int numberOfSupportElement = firstIndex + (int)(random() * ((lastIndex - firstIndex) + 1));
        int supportElement = array[numberOfSupportElement];

        while (firstIndex <= lastIndex) {

            while (array[firstIndex] < supportElement) {
                firstIndex++;
            }

            while (array[lastIndex] > supportElement) {
                lastIndex--;
            }

            if (firstIndex <= lastIndex) {
                temp = array[firstIndex];
                array[firstIndex] = array[lastIndex];
                array[lastIndex] = temp;
                firstIndex++;
                lastIndex--;
            }
        };

        return firstIndex;
    }

    public static int[] quickSort(int array[], int firstIndex, int lastIndex) {

        int calculatedIndex = reshuffle(array, firstIndex, lastIndex);

        if (firstIndex < calculatedIndex - 1) {
            quickSort(array, firstIndex, calculatedIndex - 1);
        }

        if (calculatedIndex < lastIndex) {
            quickSort(array, calculatedIndex, lastIndex);
        }
        return array;
    }
}
