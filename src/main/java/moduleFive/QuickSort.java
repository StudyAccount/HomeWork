package moduleFive;

import static java.lang.Math.random;

/**
 * Created by User on 13.03.2016.
 */
public class QuickSort {

    public int reshuffle(int array[], int first, int last) {
        int i = first, j = last;
        int temp;
        int support = array[first + (int)(random() * ((last - first) + 1))];

        while (i <= j) {
            while (array[i] < support)
                i++;
            while (array[j] > support)
                j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        };

        return i;
    }

    public int[] quickSort(int array[], int first, int last) {
        int index = reshuffle(array, first, last);
        if (first < index - 1)
            quickSort(array, first, index - 1);
        if (index < last)
            quickSort(array, index, last);
        return array;
    }
}
