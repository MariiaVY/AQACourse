//5) 1.Answer the question: What is a private access? -
// The methods or data members declared as private are accessible only within the class in which they are declared.
//Any other class of same package will not be able to access these members.
//Top level Classes or interface can not be declared as private because
//private means “only visible within the enclosing class”.

// 2.Create a simple program to demonstrate the private access.
//Tips:
// - Create two classes
// - In one of them create private members
// - In the second class create an object of the first class
// - Try to access the private members

package task5;

public class PrivateClass {

    private void sing()
    {
        System.out.println("Singing... ");
    }
}
