package modulenine;

import moduleeigth.AudioFile;
import moduleeigth.Directory;
import moduleeigth.File;

/**
 * Created by User on 03.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        int encryptionCode = 13;
        CaesarCryptography cryptographyExample = new CaesarCryptography();

        File audioTrack1 = new AudioFile("", "Nigthwish", ".mp3", 323);
        File audioTrack2 = new AudioFile("", "Linkin Park", ".mp3", 419);
        File audioTrack3 = new AudioFile("", "AC/DC", ".mp3", 223);
        File audioTrack4 = new AudioFile("", "Nickelback", ".mp3", 895);
        File audioTrack5 = new AudioFile("", "Nirvana", ".mp3", 544);
        File audioTrack6 = new AudioFile("", "Prodigy", ".mp3", 358);

        Directory music = new Directory();
        music.setDirectoryName("Music");

        music.placeFilesToDirectory(audioTrack1);
        music.placeFilesToDirectory(audioTrack2);
        music.placeFilesToDirectory(audioTrack3);
        music.placeFilesToDirectory(audioTrack4);
        music.placeFilesToDirectory(audioTrack5);
        music.placeFilesToDirectory(audioTrack6);

        String encodedMessage = cryptographyExample.encode(music.getFiles().toString(), encryptionCode);
        String decodedMessage = cryptographyExample.decode(encodedMessage, encryptionCode);

        System.out.println(music.getFiles());
        System.out.println(encodedMessage);
        System.out.println(decodedMessage);



    }
}
