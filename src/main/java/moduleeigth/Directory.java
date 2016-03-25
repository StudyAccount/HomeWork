package moduleeigth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.03.2016.
 */
public class Directory {

    protected static List<File> files = new ArrayList<File>();
    protected String directoryName;

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public static List<File> getFiles() {
        return files;
    }

    public void placeFilesToDirectory(File file){
        if (files.contains(file)) {
            System.out.println("This file already exist in directory");;
        } else {
            files.add(file);
            file.setLocation(this.directoryName);
        }
    }

    public void deleteFilesFromDirectory(File file){
        files.remove(file);
        file.setLocation("No location");
    }
}
