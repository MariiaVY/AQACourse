//Write your data to a file using appropriate classes from nio package.

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class Task9 {

    public static void main(String[] args) throws IOException {

        try {
            String data = "Hey, man!\nHow are u doing?";
            Files.write(Paths.get("outputFile.txt"), data.getBytes());

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            String data = "\nI'm fine, thanks!";
            Files.write(Paths.get("outputFile.txt"), data.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            List<String> contents = Arrays.asList("Do you like the weather today?", "yes, I do!");
            Files.write(Paths.get("File.txt"), contents,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

