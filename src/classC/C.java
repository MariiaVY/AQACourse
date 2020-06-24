//3. Create a simple program to demonstrate the package-private access.
//Tips:
// - Create two different packages
// - Create 3 classes. 2 classes should be in the first package, 3rd class - in the second package.
// - Create in one of the classes some package-private members(fields or methods).
// - In another two classes create objects of the class with package-private members and try to access its members.
package classC;
import task3.*;

public class C {

        void dis () {
            System.out.println("Hello World!");
        }

    public static void main(String args[])
    {
        A obj = new A();
        C c = new C();
       // obj.display();
        obj.print(); // demonstration of public access
        // obj.display();  error: display() has private access in A (demonstration of package-private access)
    }
    }


