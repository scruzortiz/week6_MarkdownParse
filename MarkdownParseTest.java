import static org.junit.Assert.*;
import java.nio.file.Path;
import org.junit.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Path;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MarkdownParseTest {
    ArrayList<String> expectedlinks;

    @Before
    public void setup() {
        expectedlinks = new ArrayList<>();
        expectedlinks.add("https://something.com");
        expectedlinks.add("some-thing.html");
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMarkdownParse() {
        Path filePath = Path.of("C:/Users/drake/OneDrive/Documents/GitHub/markdown-parser-fork/test-file.md");

        try {
            String fileContents = Files.readString(filePath);
            ArrayList<String> parsedLinks = MarkdownParse.getLinks(fileContents);

            for (int i = 0; i < parsedLinks.size(); ++i) {
                assertEquals(expectedlinks.get(i), parsedLinks.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error: file not found!");
        }

    }
}