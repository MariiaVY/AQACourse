public class HelloASCII {

    static void ASCIIHello(String str) {
        int l = str.length();
        int convert;
        for (int i = 0; i < l; i++) {
            convert = str.charAt(i);
            System.out.print(convert);
        }
    }
        public static void main(String[]args){

            String str = "Hello";
            System.out.println("ASCII Sentence:");
            ASCIIHello(str);

        }
}
//H = 72
//e = 101
//l = 108
//o = 111