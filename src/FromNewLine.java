//8. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
public class FromNewLine {

    public static void main(String[] args) {

        String names = "Den, John, Will, Kate, Adam, Robin";
        String[] words = names.split(", ");
        for(String w: words){
            System.out.println(w);
        }
    }
}


