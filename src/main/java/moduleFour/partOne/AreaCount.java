package moduleFour.partOne;

import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class AreaCount {

    public double triangleSquare(double firstSide, double secondSide, double thirdSide){

        double square = 0;

        if(firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            throw new IllegalArgumentException("Triangle cannot have negative side[-s]");
        }

        if ((firstSide + secondSide )< thirdSide || (firstSide + thirdSide) < secondSide || (secondSide + thirdSide) < firstSide){
            System.out.println("Your rectangle could not exist");
        } else {
            double p = (firstSide + secondSide + thirdSide) / 2;
            square = sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
        }
        return square;

    }

    public double rectangleSquare(double firstSide, double secondSide){
        if (firstSide < 0 || secondSide < 0){
            throw new IllegalArgumentException("Rectangle cannot have negative side[-s]");
        }
        return firstSide*secondSide;
    }

    public double circleSquare(double radius){
        if (radius < 0){
            throw new IllegalArgumentException("Circle cannot have negative radius");
        }
        return PI*pow(radius,2);
    }

}
