//4. Create a class Calculator. It should have three fields: double firstValue, double secondValue and String operation.
// Create all required constructors to properly initialize your object. Consider the case when user does not provide any parameters when creates a new object.
// Write a method "calculate" that takes these two values and return the result of the calculation according to the operation. Write the test class which contains the main method.
// In this main method you should create your Calculator object and do some calculation to test your code, by calling your "calculate" method.
// Print all results to the console.

public class Calculator {

    double firstValue;
    double secondValue;
    String operation;

    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public void calculate() {

        if (operation.equals("+")) {
            double sum = firstValue + secondValue;
            System.out.println("The sum is " + sum);
        }
        else if (operation.equals("-")) {
            double dif = firstValue - secondValue;
            System.out.println("The difference is " + dif);
        }
        else {
            System.out.println("Please select correct operator!");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(4, 3, "+");
        calc.calculate();
    }
}
