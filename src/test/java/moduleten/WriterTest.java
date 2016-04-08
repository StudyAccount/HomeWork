package moduleten;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 08.04.2016.
 */
public class WriterTest {

    @Test(timeout = 1000)
    public void testWriteToFile() throws Exception {
        Writer.writeToFile("TestWriter","some text");
        String message = Reader.readFromFile("TestWriter");
        assertEquals("some text", message);
    }
}