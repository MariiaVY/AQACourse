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
