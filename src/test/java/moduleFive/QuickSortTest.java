package moduleFive;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 08.04.2016.
 */
public class QuickSortTest {

    private static int[] inputArray;
    private static int[] expectedArray;

    @Before
    public void setUp() throws Exception {
        inputArray = new int[]{-5, 5, 0, 65, 7};
        expectedArray = new int[]{-5, 0, 5, 7, 65};
    }
    @Test(timeout = 1000)
    public void testQuickSort() throws Exception {

        final int[] result =
                QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertEquals(inputArray, result);
    }
}