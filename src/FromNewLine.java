//8. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
public class FromNewLine {

    public static void main(String[] args) {

        String names = "Den, John, Will, Kate, Adam, Robin";
        System.out.println(names.substring(0, 3));
        System.out.println(names.substring(5, 9));
        System.out.println(names.substring(11, 15));
        System.out.println(names.substring(17, 21));
        System.out.println(names.substring(23, 27));
        System.out.println(names.substring(29, 34));
    }
}

