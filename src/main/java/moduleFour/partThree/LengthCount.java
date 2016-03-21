package moduleFour.partThree;

//import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class LengthCount {

    public double counterOfLength (Point first, Point second){
        double currentLength = Math.sqrt(Math.pow(first.getxCoordinate() - second.getxCoordinate(),2) +
                Math.pow(first.getyCoordinate() - second.getyCoordinate(),2));
        return currentLength;
    }

}
