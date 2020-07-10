//1) Write a simple java program to demonstrate composition of classes.
//Tips:
// a) Create several classes A, B, C;
// b) Add functionality of classes B and C to the class A without using inheritance.
// c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;
package task1;

public class C {
    private String c1;

    C() {
        System.out.println("Composition C");
        c1 = "The Second Word";
    }

    @Override
    public String toString() {
        return c1;
    }
}
