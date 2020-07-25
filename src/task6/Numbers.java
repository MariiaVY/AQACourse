//6. Write a program that will enter numbers from the keyboard.
//The code for reading numbers from the keyboard must be in the readData method.
//The code inside the readData is wrapped in a try..catch.
//If the user entered some text, instead of entering a number, the method should
// catch the exception and display all previously entered numbers as a result.
//Numbers output from a new line preserving the order of input.
package task6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[]args){
        System.out.println("Enter numbers ");
        int i = readData();
        System.out.println("You entered " + i);
    }
    public static int readData() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("That’s not "
                        + "an integer. Try again: ");
            }
        }
    }
}
