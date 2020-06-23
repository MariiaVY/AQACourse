//9) What is the difference between static and non-static field of a class? Create an example to demonstrate this concept.
// - Static variables are shared among all instances of a class. Non static variables are specific to that instance of a class.
// Static variable is like a global variable and is available to all methods.
// Non static variable is like a local variable and they can be accessed through only instance of a class
package task9;

public class Example {

    static class X {
        static int zoo = z1();
        static
        {
            System.out.println("Static is eating");
        }

        static int z1() {
            System.out.println("Static is sleeping");
            return 4;
        }

        public static void main(String[] args) {
            System.out.println(zoo);
            System.out.println("Value of a is " + zoo);
        }
    }
}
    class Y {
        int non = 50;
        void method2()
        {
            System.out.println("Non static is playing");
        }
        public static void main(String[] args) {
            Y y = new Y();
            y.method2();
            System.out.println("Non Static variable " + y.non);
        }
    }

