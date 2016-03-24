package moduleseven;

import java.lang.ref.SoftReference;

/**
 * Created by User on 24.03.2016.
 */

public abstract class File {
    protected String name;
    protected String extension;
    protected float size;
    protected String location;

    public File(String location, String name, String extension, float size) {
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

    public void setSize(float size) {
        this.size = size;
    }
}
