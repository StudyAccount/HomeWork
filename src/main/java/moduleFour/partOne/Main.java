package moduleFour.partOne;

import java.util.Scanner;

/**
 * Created by User on 13.03.2016.
 */
public class Main {

    private static float readFloat(String message){
        while(true) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (Exception E) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("------------------Counting Triangle square-----------------");
        float firstTriangleSide = readFloat("Input first side length: ");
        float secondTriangleSide = readFloat("Input second side length: ");
        float thirdTriangleSide = readFloat("Input third side length: ");

        Triangle triangle = new Triangle(firstTriangleSide,secondTriangleSide,thirdTriangleSide);
        triangle.setFirstSide(firstTriangleSide);
        triangle.setSecondSide(secondTriangleSide);
        triangle.setThirdSide(thirdTriangleSide);

        AreaCount countTriangleSquare = new AreaCount();
        double squareOfTriangle = countTriangleSquare.triangleSquare(firstTriangleSide,secondTriangleSide,thirdTriangleSide);
        System.out.println("Yours rectangle square is: "+ squareOfTriangle);



        System.out.println("------------------Counting Rectangle square-----------------");

        float firstRectangleSide = readFloat("Input first side length: ");
        float secondRectangleSide = readFloat("Input second side length: ");
        Rectangle rectangle = new Rectangle(firstRectangleSide,secondRectangleSide);
        rectangle.setFirstSide(firstRectangleSide);
        rectangle.setSecondSide(secondRectangleSide);

        AreaCount countRectangleArea = new AreaCount();
        double squareOfRectangle = countRectangleArea.rectangleSquare(firstRectangleSide,secondRectangleSide);
        System.out.println("Yours rectangle square is: "+ squareOfRectangle);

        System.out.println("------------------Counting Triangle square-----------------");

        float circleRadius = readFloat("Input radius: 3");
        Circle circle = new Circle(circleRadius);
        circle.setRadius(circleRadius);

        AreaCount countCircleArea = new AreaCount();
        double squareOfCircle = countCircleArea.circleSquare(circleRadius);
        System.out.println("Yours rectangle square is: "+ squareOfCircle);


    }

}
