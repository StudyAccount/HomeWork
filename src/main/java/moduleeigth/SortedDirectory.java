package moduleeigth;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by User on 29.03.2016.
 */

public class SortedDirectory extends Directory {
    private SortedSet<File> sortedFiles = new TreeSet<File>();


    public SortedSet<File> getSortedFiles() {
        return sortedFiles;
    }

    public SortedSet<File> fillSortedSet(Directory filesInArrayList){
        sortedFiles.addAll(filesInArrayList.getFiles());
        return sortedFiles;
    }

}
