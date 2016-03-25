package moduleigth;

/**
 * Created by User on 25.03.2016.
 */
public class VideoFile extends File {
    protected static final String VIDEO = ".avi" ;

    public VideoFile(String location, String name, String extension, int size) {
        super(location, name, extension, size);
    }

    @Override
    public String getExtension() {
        return VIDEO;
    }
}
