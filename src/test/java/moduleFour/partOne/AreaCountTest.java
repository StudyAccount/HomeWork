package moduleFour.partOne;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.Math.*;
import static org.junit.Assert.*;

/**
 * Created by User on 07.04.2016.
 */
public class AreaCountTest {

    private static AreaCount areaCount;

    @BeforeClass
    public static void setUpClass() throws Exception {
        areaCount = new AreaCount();

    }

    @Test (timeout = 1000)
    public void testTriangleSquare() throws Exception {
        double a = 13;
        double b = 13;
        double c = 10;
        double expectation = 60;


        final Triangle triangle = new Triangle(a, b, c);

        final double result = areaCount.triangleSquare(triangle);
        assertEquals(expectation, result, 0.0001);
    }

    @Test (timeout = 1000)
    public void rectangleSquare() throws Exception {
        double a = 5;
        double b = 5;

        final  Rectangle rectangle = new Rectangle(a, b);

        final double result = areaCount.rectangleSquare(rectangle);
        assertEquals(a * b, result, 0.0001);
    }

    @Test (timeout = 1000)
    public void circleSquare() throws Exception {
        double r = 5;

        final Circle circle = new Circle(r);

        final double result = areaCount.circleSquare(circle);
        assertEquals((PI* pow(r, 2)), result, 0.0001);

    }
}