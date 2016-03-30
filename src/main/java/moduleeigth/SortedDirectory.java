package moduleeigth;

import moduleSix.Instrument;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by User on 29.03.2016.
 */
public class SortedDirectory {
    private static SortedSet<File> files = new TreeSet<File>();

    public SortedSet<File> getFiles() {
        return files;
    }

    public static SortedSet<File> fillSortedSet(Directory filesInArrayList){
        files.addAll((Collection<? extends File>) filesInArrayList);
        return files;
    }

}
