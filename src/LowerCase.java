public class LowerCase {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJK";
        String newString = str.replaceAll("[AEI]", "");
        System.out.println(newString.toLowerCase());
    }
}
