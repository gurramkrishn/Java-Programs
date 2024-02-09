package exception;

import org.junit.Assert;
import org.junit.Test;

public class FileReaderTest
{
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("C:\\Users\\rama krishna\\IdeaProjects\\Core-Java\\src\\main\\resources\\Data.txt");
        Assert.assertEquals("HelloI am rama krishna", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}
