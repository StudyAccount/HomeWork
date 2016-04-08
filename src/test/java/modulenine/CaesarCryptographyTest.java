package modulenine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 08.04.2016.
 */
public class CaesarCryptographyTest {

    @Test
    public void testEncode() throws Exception {
        int key = 3;
        String string = "AbcD";
        String expectedString = "DefG";

        CaesarCryptography caesarCryptography = new CaesarCryptography();

        String result = caesarCryptography.encode(string, key);
        assertEquals(expectedString, result);
    }


    @Test
    public void testDecode() throws Exception {
        int key = 2;
        String string = "CdEf";
        String expectedString = "AbCd";

        CaesarCryptography caesarCryptography = new CaesarCryptography();

        String result = caesarCryptography.decode(string, key);
        assertEquals(expectedString, result);
    }
}