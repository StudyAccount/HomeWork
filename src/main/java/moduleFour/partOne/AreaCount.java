package moduleFour.partOne;

import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class AreaCount {

    public double triangleSquare(double firstSide, double secondSide, double thirdSide){

        if(firstSide < 0 || secondSide < 0 || thirdSide < 0 || (firstSide+secondSide)<thirdSide || (firstSide+thirdSide)<secondSide || (secondSide+thirdSide)<firstSide) {
            System.out.println("Wrong values");
        }
        double p = (firstSide + secondSide + thirdSide) / 2;
        return sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    public double rectangleSquare(double firstSide, double secondSide){
        if (firstSide < 0 || secondSide < 0){
            System.out.println("Wrong values");
        }
        return firstSide*secondSide;
    }

    public double circleSquare(double radius){
        if (radius < 0){
            System.out.println("Wrong values");
        }
        return PI*pow(radius,2);
    }

}
