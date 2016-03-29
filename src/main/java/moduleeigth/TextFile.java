package moduleeigth;

/**
 * Created by User on 25.03.2016.
 */
public class TextFile extends File {
    private static final String TEXT = ".txt" ;

    public TextFile(String location, String name, String extension, int size) {
        super(location, name, extension, size);
    }

    @Override
    public String getExtension() {
        return TEXT;
    }
}
