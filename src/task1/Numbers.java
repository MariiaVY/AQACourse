//1. Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception.
package task1;

public class Numbers {

    void number(int number) {

            if (number < 0) {
                System.out.println("Number < 0");
            } else if (number > 0) {
                System.out.println("Number > 0");
            }

            if (number == 0) {
                throw new ArithmeticException("Please, change the number");
            }
        }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.number(0);
    }
}
