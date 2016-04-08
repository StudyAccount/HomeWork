package modulenine;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 08.04.2016.
 */
public class CaesarCryptographyTest {
    private static CaesarCryptography caesarCryptography;

    @BeforeClass
    public static void setUpClass() throws Exception {

        caesarCryptography = new CaesarCryptography();
    }

    @Test(timeout = 1000)
    public void testEncode() throws Exception {
        int key = 3;
        String string = "AbcD";
        String expectedString = "DefG";

        String result = caesarCryptography.encode(string, key);
        assertEquals(expectedString, result);
    }


    @Test(timeout = 1000)
    public void testDecode() throws Exception {
        int key = 2;
        String string = "CdEf";
        String expectedString = "AbCd";

        String result = caesarCryptography.decode(string, key);
        assertEquals(expectedString, result);
    }
}