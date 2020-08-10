package HomeWork10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Task1 {

    public static void main(String... args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("alice.txt"));
            ArrayList<String> newArray = new ArrayList<>();

            for (String line : lines) {
                Collections.addAll(newArray, line.split("\\W+"));
            }

            System.out.println("The array number is: " + newArray.size());

            HashSet<String> uniqueAliceWords = new HashSet<>(lines);
            for (String line : lines) {
                Collections.addAll(uniqueAliceWords, line.split("\\W+"));
            }
            System.out.println("Unique words number: " + uniqueAliceWords.size());


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
