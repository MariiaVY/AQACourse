//4) Answer the question:
// What is a public access? -The public access modifier has the widest scope among all other access modifiers.
//Classes, methods or data members which are declared as public are accessible from every where in the program.
// There is no restriction on the scope of a public data members.
package task3;
import classC.C;
import task3.*;

public class B {
    public static void main(String args[])
    {
        A obj = new A();
        C c = new C();
       // obj.display();
        obj.print(); // demonstration of public access
        // obj.display();  error: display() has private access in A (demonstration of package-private access)
    }

   public void dis()
    {
        System.out.println("Hello World!");
    }
}