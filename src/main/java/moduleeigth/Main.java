package moduleeigth;

/**
 * Created by User on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        File audioTrack1 = new AudioFile("", "Nigthwish", ".mp3", 323);
        File audioTrack2 = new AudioFile("", "Linkin Park", ".mp3", 419);
        File audioTrack3 = new AudioFile("", "AC/DC", ".mp3", 223);
        File audioTrack4 = new AudioFile("", "Nickelback", ".mp3", 895);
        File audioTrack5 = new AudioFile("", "Nirvana", ".mp3", 544);
        File audioTrack6 = new AudioFile("", "Prodigy", ".mp3", 358);

        File textFile1 = new TextFile("", "New text file", ".txt", 14);
        File textFile2 = new TextFile("", "Reading", ".txt", 11);
        File textFile3 = new TextFile("", "My speech", ".txt", 12);
        File textFile4 = new TextFile("", "For diploma", ".txt", 14);
        File textFile5 = new TextFile("", "Questions", ".txt", 16);
        File textFile6 = new TextFile("", "Book", ".txt", 44);

        File newVideo1 = new VideoFile("", "Sherlock Episode 1", ".avi", 123345);
        File newVideo2 = new VideoFile("", "Sherlock Episode 1", ".avi", 123235);
        File newVideo3 = new VideoFile("", "Sherlock Episode 1", ".avi", 123354);
        File newVideo4 = new VideoFile("", "Sherlock Episode 1", ".avi", 123233);
        File newVideo5 = new VideoFile("", "Sherlock Episode 1", ".avi", 123433);
        File newVideo6 = new VideoFile("", "Sherlock Episode 1", ".avi", 123245);

        Directory firstFolder = new Directory();
        firstFolder.setDirectoryName("Music");

        firstFolder.placeFilesToDirectory(audioTrack1);
        firstFolder.placeFilesToDirectory(audioTrack2);
        firstFolder.placeFilesToDirectory(audioTrack3);
        firstFolder.placeFilesToDirectory(audioTrack4);
        firstFolder.placeFilesToDirectory(audioTrack5);
        firstFolder.placeFilesToDirectory(audioTrack6);

        Directory secondFolder = new Directory();
        secondFolder.setDirectoryName("Video");

        secondFolder.placeFilesToDirectory(newVideo1);
        secondFolder.placeFilesToDirectory(newVideo2);
        secondFolder.placeFilesToDirectory(newVideo3);
        secondFolder.placeFilesToDirectory(newVideo4);
        secondFolder.placeFilesToDirectory(newVideo5);
        secondFolder.placeFilesToDirectory(newVideo6);

        Directory thirdFolder = new Directory();
        thirdFolder.setDirectoryName("Trash");

        thirdFolder.placeFilesToDirectory(newVideo1);
        thirdFolder.placeFilesToDirectory(textFile2);
        thirdFolder.placeFilesToDirectory(audioTrack5);
        thirdFolder.placeFilesToDirectory(newVideo6);
        thirdFolder.placeFilesToDirectory(textFile5);
        thirdFolder.placeFilesToDirectory(audioTrack6);
        thirdFolder.placeFilesToDirectory(textFile4);
        thirdFolder.placeFilesToDirectory(newVideo3);
        thirdFolder.placeFilesToDirectory(textFile3);

        System.out.println("-------------------------------------------");
        System.out.println("Files in first folder " + firstFolder.getDirectoryName() + " are:");
        System.out.println("-------------------------------------------");
        PrintingCollection.printCollection(firstFolder);
        System.out.println("-------------------------------------------");
        System.out.println("Files in second folder " + secondFolder.getDirectoryName() + " are:");
        System.out.println("-------------------------------------------");
        PrintingCollection.printCollection(secondFolder);
        System.out.println("-------------------------------------------");
        System.out.println("Files in third folder " + thirdFolder.getDirectoryName() + " are:");
        System.out.println("-------------------------------------------");
        PrintingCollection.printCollection(thirdFolder);
    }
}
