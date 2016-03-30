package moduleeigth;

import java.util.Comparator;

/**
 * Created by User on 24.03.2016.
 */

public abstract class File implements Comparable{
    private String name;
    private String extension;
    private int size;
    private String location;

    public File(String location, String name, String extension, int size) {
        this.location = location;
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public float getSize() {
        return size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Object object) {
        File entry = (File) object;
        return name.compareTo(entry.name);

    }
}
