//4) Create a class A. Add several fields, two methods and parameterized constructors to it. Create a class B that extends class A.
//Demonstrate in you program how class's B constructor should call class's A constructor to create a new object. Override one method of the class A to fully change it's behavior. Override another method to add some extra functionality to it, but it should then call class's A method.
// Create a test class and create several objects of class A and class B and call their methods.
package task4;

public class B extends A{

    public B(String city, String country) {
        super(city, country);
    }
    A call = new A("Kiev", "UK");

    @Override
    public void showCity(String city) {
        System.out.println("The next city is: " + city);;
    }

    @Override
    public void showCountry(String country) {
        String address = country + ". You are welcome here, my Friend!";
        super.showCountry(address);
    }
}
