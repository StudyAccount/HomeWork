package moduleten;

import java.io.*;

/**
 * Created by User on 04.04.2016.
 */
public class Reader {
    public static String readFromFile(String fileName) {

        StringBuilder outputMessage = new StringBuilder();
        File file = new File(fileName);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsoluteFile()))){
            String inputLine = null;

            do {
                inputLine = bufferedReader.readLine();
                if (inputLine != null){
                    outputMessage.append(inputLine);
                }
            }while (inputLine != null);

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " does not exist");

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        return outputMessage.toString();
    }
}
