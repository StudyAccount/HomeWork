package modulenine;

/**
 * Created by User on 03.04.2016.
 */
public class CaesarCryptography {
    private final int ASCII_DIGIT_0 = 48;
    private final int ASCII_UPPER_A = 65;
    private final int ASCII_LOWER_A = 97;
    private final int ALPHABET_LENGTH = 26;
    private final int NUMERALS_SIZE = 10;
    //private final int ASCII_SPECIAL_CHARACTER_FIRST = 32;
    //private final int NUMBER_OF_SPECIAL_CHARACTERS = 16;

    public String encode(String inputMessage, int key){
        StringBuilder stringBuilder = new StringBuilder();
        char characterReceived;

        for(char character : inputMessage.toCharArray()){

            if(Character.isLetter(character)){

                if (Character.isUpperCase(character)){

                    characterReceived = encodedCycleOfProcessingData(character, ASCII_UPPER_A, ALPHABET_LENGTH, key);
                    stringBuilder.append(characterReceived);

                } else if (Character.isLowerCase(character)){

                    characterReceived = encodedCycleOfProcessingData(character, ASCII_LOWER_A, ALPHABET_LENGTH, key);
                    stringBuilder.append(characterReceived);
                }

            } else if (Character.isDigit(character)){

                characterReceived = encodedCycleOfProcessingData(character, ASCII_DIGIT_0, NUMERALS_SIZE, key);
                stringBuilder.append(characterReceived);

            } else {

                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }

    public String decode(String codedMessage, int key){
        StringBuilder stringBuilder = new StringBuilder();
        char characterReceived;

        for (char character : codedMessage.toCharArray()){
            if(Character.isLetter(character)){

                if (Character.isUpperCase(character)){

                    characterReceived = decodedCycleOfProcessingData(character, ASCII_UPPER_A, ALPHABET_LENGTH, key);
                    stringBuilder.append(characterReceived);

                } else if (Character.isLowerCase(character)){

                    characterReceived = decodedCycleOfProcessingData(character, ASCII_LOWER_A, ALPHABET_LENGTH, key);
                    stringBuilder.append(characterReceived);
                }

            } else if (Character.isDigit(character)){

                characterReceived = decodedCycleOfProcessingData(character, ASCII_DIGIT_0, NUMERALS_SIZE, key);
                stringBuilder.append(characterReceived);

            } else  {

                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }

    public static char encodedCycleOfProcessingData(char character, int firstSymbolInASCII, int alphabetSize, int key){
        StringBuilder stringBuilder = new StringBuilder();

        int asciiCodeOfCharacter = (character - firstSymbolInASCII - key) % alphabetSize;
        int myCodeOfCharacter = asciiCodeOfCharacter + firstSymbolInASCII;

        if (asciiCodeOfCharacter >= 0) {

            stringBuilder.appendCodePoint(myCodeOfCharacter);
        } else {

            stringBuilder.appendCodePoint(myCodeOfCharacter + alphabetSize);
        }

        return stringBuilder.charAt(0);
    }


    public static char decodedCycleOfProcessingData(char character, int firstSymbolInASCII, int alphabetSize, int key){
        StringBuilder stringBuilder = new StringBuilder();

        int asciiCodeOfCharacter = (character - firstSymbolInASCII - key + alphabetSize) % alphabetSize;
        int myCodeOfCharacter = asciiCodeOfCharacter + firstSymbolInASCII;

        if (asciiCodeOfCharacter >= 0) {

            stringBuilder.appendCodePoint(myCodeOfCharacter);
        } else {

            stringBuilder.appendCodePoint(myCodeOfCharacter + alphabetSize);
        }

        return stringBuilder.charAt(0);
    }



}