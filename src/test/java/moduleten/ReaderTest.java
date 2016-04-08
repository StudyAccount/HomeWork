package moduleten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 08.04.2016.
 */
public class ReaderTest {

    @Test(timeout = 1000)
    public void testReadFromFile() throws Exception {
        String result = Reader.readFromFile("TestWriter");
        assertEquals("some text", result);
    }
}