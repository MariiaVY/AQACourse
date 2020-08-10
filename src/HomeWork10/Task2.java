package HomeWork10;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws Exception {

            List<String> lines = Files.readAllLines(Paths.get("alice.txt"));
            List < String > newList = new ArrayList < > ();

        for (String line : lines) {
            Collections.addAll(newList, line.split("\\W+"));
        }
            int size = newList.size();
            int i = 0;

            Map < String, Integer > numberOfUnique = new HashMap < > ();

            for (int j = 0; size > j; j++) {
                int count = 0;
                for (i = 0; size > i; i++) {
                    if (newList.get(j).equals(newList.get(i))) {
                        count++;
                        numberOfUnique.put(newList.get(j), count);
                    }
                }
            }
            System.out.println(numberOfUnique);
        }
}




