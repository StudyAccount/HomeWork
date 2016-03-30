package moduleeigth;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by User on 25.03.2016.
 */
public class Directory {

    private List<File> files = new ArrayList<File>();
   // private SortedSet<File> sortedFiles = new TreeSet<>();
    private String directoryName;

    public void placeFilesToDirectory(File file){
        if (files.contains(file)) {
            System.out.println("This file already exist in directory");;
        } else {
            files.add(file);
            file.setLocation(this.directoryName);
        }
    }

//    public void turnDirectorySorted(List<File> files){
//        sortedFiles.addAll(files);
//    }

    public void deleteFilesFromDirectory(File file){
        files.remove(file);
        file.setLocation("No location");
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<File> getFiles() {
        return files;
    }
}
