package moduleten;

import modulenine.CaesarCryptography;

import java.util.Scanner;

/**
 * Created by User on 04.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        int key = 2;
        String encodedFileName = "Encode";
        String decodedFileName = "Decode";
        String temporaryFileName = "Notes";

        System.out.println("Enter your text for message");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();

        Writer.writeToFile(temporaryFileName, message);

        CaesarCryptography caesarCryptography = new CaesarCryptography();

        String encodedMessage = caesarCryptography.encode(message, key);
        Writer.writeToFile(encodedFileName, encodedMessage);

        String readMessage = Reader.readFromFile(encodedFileName);

        String decodedMessage = caesarCryptography.decode(readMessage, key);
        Writer.writeToFile(decodedFileName, decodedMessage);

    }

}
