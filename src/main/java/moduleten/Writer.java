package moduleten;

import java.io.*;

/**
 * Created by User on 04.04.2016.
 */
public class Writer {
    public static void writeToFile(String fileName, String message) {
        File file = new File(fileName);

        try {
            if (!file.exists()){
                file.createNewFile();
            }
        }   catch (IOException e){
            System.out.println("Can not create a file");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsoluteFile()))) {
            bufferedWriter.write(message);
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Can not write to file");
        }

    }
}
