package moduleFour.partThree;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * Created by User on 07.04.2016.
 */
@RunWith(value = Parameterized.class)
public class LengthCountTest {

    private static int firstPointXCoordinate;
    private static int firstPointYCoordinate;
    private static int secondPointXCoordinate;
    private static int secondPointYCoordinate;
    private static double expectation;
    private static final LengthCount lengthCount = new LengthCount();

    public LengthCountTest(int firstPointXCoordinate, int firstPointYCoordinate,
                           int secondPointXCoordinate, int secondPointYCoordinate, double expectation) {

        this.firstPointXCoordinate = firstPointXCoordinate;
        this.firstPointYCoordinate = firstPointYCoordinate;
        this.secondPointXCoordinate = secondPointXCoordinate;
        this.secondPointYCoordinate = secondPointYCoordinate;
        this.expectation = expectation;
    }

    @Parameterized.Parameters (name = "{index}: A({0}, {1}); B({2}, {3}); distance = {4}")
    public static Iterable<Object[] > getData() {
        return Arrays.asList(new Object[][]{
                {5, 5, 3, 3, sqrt(8)},
                {0, 0, 1, 1, sqrt(2)},
                {3, -1, -4, 3, sqrt(65)},
        });
    }

    @Test
    public void testCounterOfLength() throws Exception {
        final Point firstPoint = new Point(firstPointXCoordinate, firstPointYCoordinate);
        final Point secondPoint = new Point(secondPointXCoordinate, secondPointYCoordinate);
        final double result = lengthCount.counterOfLength(firstPoint, secondPoint);
        Assert.assertEquals(expectation, result, 0.0001);
    }
}