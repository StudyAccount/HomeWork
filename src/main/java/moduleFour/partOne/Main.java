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
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Something went wrong");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("------------------Counting Triangle square-----------------");
        float firstTriangleSide = readFloat("Input first side length: ");
        float secondTriangleSide = readFloat("Input second side length: ");
        float thirdTriangleSide = readFloat("Input third side length: ");

        Triangle triangle = new Triangle(firstTriangleSide, secondTriangleSide, thirdTriangleSide);

        AreaCount countTriangleSquare = new AreaCount();
        double squareOfTriangle = countTriangleSquare.triangleSquare(triangle);
        System.out.println("Yours rectangle square is: " + squareOfTriangle);

        System.out.println("------------------Counting Rectangle square-----------------");

        float firstRectangleSide = readFloat("Input first side length: ");
        float secondRectangleSide = readFloat("Input second side length: ");

        Rectangle rectangle = new Rectangle(firstRectangleSide, secondRectangleSide);

        AreaCount countRectangleArea = new AreaCount();

        double squareOfRectangle = countRectangleArea.rectangleSquare(rectangle);
        System.out.println("Yours rectangle square is: " + squareOfRectangle);

        System.out.println("------------------Counting Triangle square-----------------");

        float circleRadius = readFloat("Input radius: ");

        Circle circle = new Circle(circleRadius);

        AreaCount countCircleArea = new AreaCount();

        double squareOfCircle = countCircleArea.circleSquare(circle);
        System.out.println("Yours rectangle square is: " + squareOfCircle);


    }

}
