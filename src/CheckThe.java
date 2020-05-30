//4. Given two strings. Check if they start with "The".
//   Task: word1 = "The End", word2="End The";
public class CheckThe {

    public static void main(String[] args) {
        String word1 = "The End";
        String word2 = "End The";

        System.out.println("String word1 starts with The: " + word1.startsWith("The"));
        System.out.println("String word2 starts with The: " + word2.startsWith("The"));
    }
}
