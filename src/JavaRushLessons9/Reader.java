package JavaRushLessons9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {
    public static void main(String[] args) throws IOException {
        String fileName = "file1.txt";
        String content = Files.lines(Paths.get(fileName)).reduce("file.txt", String::concat);
        System.out.println(content);
    }
}
