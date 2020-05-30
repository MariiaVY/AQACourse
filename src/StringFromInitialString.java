import java.util.Scanner;

//2. Given a string. Write a code that will creates a new string made of its first two chars of the initial string, so the String "Hello" yields "He".
//   If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

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
