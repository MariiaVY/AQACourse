//1) Write a simple java program to demonstrate composition of classes.
//Tips:
// a) Create several classes A, B, C;
// b) Add functionality of classes B and C to the class A without using inheritance.
// c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;
package task1;

public class A {
    private String a1, a2;
    private B b = new B();
    private C c = new C();

    @Override
    public String toString() {
        return "a1 = " + a1 +
                " a2 = " + a2 +
                " b = " + b +
                " c = "  + c;
    }
}
