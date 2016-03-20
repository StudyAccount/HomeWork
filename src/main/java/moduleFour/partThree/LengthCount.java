package moduleFour.partThree;

import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class LengthCount {

    public double counterOfLength (Point first, Point second){
        double currentLength = sqrt(pow(first.getxCoordinate() - second.getxCoordinate(),2) +
                pow(first.getyCoordinate() - second.getyCoordinate(),2));
        return currentLength;
    }

}
