//3. Finish the program to handle all the possible exceptions:
// Print the cause of the exception to the console.
package task3;

public class Main {

    public static void main(String[] args) {
        int a = args.length;
        try {
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        }
        System.out.println("Division by zero");
    }
}
