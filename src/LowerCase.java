//5. Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.
public class LowerCase {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJK";
        String newString = str.replaceAll("[AEI]", "");
        System.out.println(newString.toLowerCase());
    }
}
