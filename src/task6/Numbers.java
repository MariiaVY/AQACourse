//6. Write a program that will enter numbers from the keyboard.
//The code for reading numbers from the keyboard must be in the readData method.
//The code inside the readData is wrapped in a try..catch.
//If the user entered some text, instead of entering a number, the method should
// catch the exception and display all previously entered numbers as a result.
//Numbers output from a new line preserving the order of input.
package task6;
import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter number: ");
                myList.add(s.nextInt());
            }
        }
        catch (InputMismatchException e) {
            System.out.println(myList);
        }
    }
}


