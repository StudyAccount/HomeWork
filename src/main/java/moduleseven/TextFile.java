package moduleseven;

/**
 * Created by User on 25.03.2016.
 */
public class TextFile extends File {
    protected static final String TEXT = ".txt" ;

    public TextFile(String location, String name, String extension, float size) {
        super(location, name, extension, size);
    }

    @Override
    public String getExtension() {
        return TEXT;
    }
}
