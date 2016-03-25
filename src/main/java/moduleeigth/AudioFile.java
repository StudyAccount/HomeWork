package moduleeigth;

/**
 * Created by User on 25.03.2016.
 */
public class AudioFile extends File {

    protected static final String AUDIO = ".mp3" ;

    public AudioFile(String location, String name, String extension, int size) {
        super(location, name, extension, size);
    }

    @Override
    public String getExtension() {
        return AUDIO;
    }
}
