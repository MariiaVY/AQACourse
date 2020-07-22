//5. Throw a NullPointerException from the method iCanThrowException();
//Handle it in the main method.
package task5;

public class Main {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception was caught");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
