import java.util.Scanner;

public class StringFromInitialString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println ("Put in the word ");
        String word = scan.nextLine();

        if (word.length() <= 2)
            System.out.println(word);
        else {
            System.out.println(word.substring(0, 2));
        }
    }
}
