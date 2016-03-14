package moduleFive;
import static java.lang.Math.*;
/**
 * Created by User on 13.03.2016.
 */
public class QuickSort {

    public void Sort(int array[], int first, int last){

        int i = first, j = last;
        int pivot = first + (int)(random() * ((last - first) + 1));

        while (i < j) {
            while (i < pivot && (array[i] <= array[pivot])) {
                i++;
            }
            while (j > pivot && (array[pivot] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == pivot)
                    pivot = j;
                else if (j == pivot)
                    pivot = i;
            }
        }
        Sort(array, first, pivot);
        Sort(array, pivot+1, last);
    }
     
}
