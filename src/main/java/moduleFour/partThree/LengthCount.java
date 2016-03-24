package moduleFour.partThree;

//import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class LengthCount {

    public static final int CONSTANT = 2;

    public double counterOfLength (Point first, Point second){
        double currentLength = Math.sqrt(Math.pow(first.getXCoordinate() - second.getXCoordinate(), CONSTANT) +
                Math.pow(first.getYCoordinate() - second.getYCoordinate(), CONSTANT));
        return currentLength;
    }

}
