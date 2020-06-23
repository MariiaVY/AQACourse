//package-private (often just called package) means that other members of the same package have access to the item.
// package-private is the default access modifier and does not have a keyword, because package is used to specify the
// package for a class or interface. To declare package access for something, use no access modifier.

//7) What is the difference between package-private access and protected access? -
// A member with no access modifier is only accessible within classes in the same package.
// A protected member is accessible within all classes in the same package and within subclasses in other packages
package task3;

public class A {
    private void display()
    {
        System.out.println("Private");
    }
    public void print()
    {
        System.out.println("Print"); // Create a simple program to demonstrate the public access. You can use tips from the task 3.

    }
}
