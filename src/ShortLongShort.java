//6. Given 2 strings, a and b. Create a string c of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
//   Task: a = "hop", b = "hello"
public class ShortLongShort {

    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        int len1 = a.length();
        int len2 = b.length();
        if (len1 > len2) {
            System.out.println(b + a + b);
        } else
            System.out.println(a + b + a);

    }

}
