import java.util.Scanner;
//9. Given some random string s. Verify if that string ends with ".". If so, leave this string as is. If not - add it. Test strings create on your own.

public class StringS {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Put in any string ");
        String s = scan.nextLine();

        if (s.endsWith(".")) {
            System.out.println(s);
        }
        else
            System.out.println(s + ".");
        }
    }

