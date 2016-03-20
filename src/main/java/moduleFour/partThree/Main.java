package moduleFour.partThree;

import java.util.Scanner;

/**
 * Created by User on 13.03.2016.
 */
public class Main {

    private static int readInt(String message){
        while(true) {
            try {
                System.out.print(message);
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception E) {
                System.out.println("You have to print Integer values");
            }
        }
    }

    public static void main(String[] args) {

        int firstPointXCoordinate = readInt("Enter first x coordinate: ");
        int firstPointYCoordinate = readInt("Enter first y coordinate: ");
        int secondPointXCoordinate = readInt("Enter second x coordinate: ");
        int secondPointYCoordinate = readInt("Enter second y coordinate: ");

        Point firstPoint = new Point(firstPointXCoordinate,firstPointYCoordinate);
        Point secondPoint = new Point(secondPointXCoordinate,secondPointYCoordinate);

        firstPoint.setxCoordinate(firstPointXCoordinate);
        firstPoint.setyCoordinate(firstPointYCoordinate);
        secondPoint.setxCoordinate(secondPointXCoordinate);
        secondPoint.setyCoordinate(secondPointYCoordinate);

        LengthCount currentLength = new LengthCount();
        double length = currentLength.counterOfLength(firstPoint,secondPoint);
        System.out.println(length);

    }
}
