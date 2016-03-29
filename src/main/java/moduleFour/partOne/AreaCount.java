package moduleFour.partOne;

/**
 * Created by User on 13.03.2016.
 */
public class AreaCount {

    public static final int HERON_CONSTANT = 2;

    public double triangleSquare(Triangle triangle){

        double square = 0;

        if(triangle.getFirstSide() < 0 || triangle.getSecondSide() < 0 || triangle.getThirdSide() < 0) {
            throw new IllegalArgumentException("Triangle cannot have negative side[-s]");
        }

        if ((triangle.getFirstSide() + triangle.getSecondSide() ) <= triangle.getThirdSide() ||
                (triangle.getFirstSide() + triangle.getThirdSide()) <= triangle.getSecondSide() ||
                (triangle.getSecondSide() + triangle.getThirdSide()) <= triangle.getFirstSide()){
            try {
                throw new WrongTriangleSidesException(triangle.getFirstSide(), triangle.getSecondSide(), triangle.getThirdSide());
            } catch (WrongTriangleSidesException e) {
                System.out.println("No one of triangle sides could be lager then the sum of another two");
            }
        }
            double p = (triangle.getFirstSide() + triangle.getSecondSide() + triangle.getThirdSide()) / HERON_CONSTANT;
            square = Math.sqrt(p * (p - triangle.getFirstSide()) * (p - triangle.getSecondSide()) * (p - triangle.getThirdSide()));

        return square;

    }

    public double rectangleSquare(Rectangle rectangle){
        if (rectangle.getFirstSide() < 0 || rectangle.getSecondSide() < 0){
            throw new IllegalArgumentException("Rectangle cannot have negative side[-s]");
        }
        return rectangle.getFirstSide() * rectangle.getSecondSide();
    }

    public double circleSquare(Circle circle){
        if (circle.getRadius()< 0){
            throw new IllegalArgumentException("Circle cannot have negative radius");
        }
        return Math.PI*Math.pow(circle.getRadius(),2);
    }

}
