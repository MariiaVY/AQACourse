import java.util.ArrayList;
//10. Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.

public class HelloWorld {

    public static void main(String[] args) {

       printList(transformIntToChar(72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}
