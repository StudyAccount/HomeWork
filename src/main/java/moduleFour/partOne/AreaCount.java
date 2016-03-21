package moduleFour.partOne;

//import static java.lang.Math.*;

/**
 * Created by User on 13.03.2016.
 */
public class AreaCount {

    public double triangleSquare(double firstSide, double secondSide, double thirdSide){

        double square = 0;

        if(firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            throw new IllegalArgumentException("Triangle cannot have negative side[-s]");
        }

        if ((firstSide + secondSide ) <= thirdSide || (firstSide + thirdSide) <= secondSide || (secondSide + thirdSide) <= firstSide){
            try {
                throw new WrongTriangleSidesException(firstSide, secondSide, thirdSide);
            } catch (WrongTriangleSidesException e) {
                System.out.println("No one of triangle sides could be lager then the sum of another two");
            }
        }
            double p = (firstSide + secondSide + thirdSide) / 2;
            square = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));

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
        return Math.PI*Math.pow(radius,2);
    }

}
