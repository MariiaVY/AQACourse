package Car;
//3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a".
// They can be anything you want. For example: Car - Engine - Wheels
public class Relationship {

    public static class Engine {
        int capacity;
        public Engine(int capacity) {
            this.capacity = capacity;
            System.out.println("The capacity is: " + capacity);
        }
    }
    public static class Wheels {
        int numberOfWheels;
        public Wheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
            System.out.println("The number of wheels in a car is: " + numberOfWheels);
        }
    }
    public static class Car {
        public static void main(String[] args) {
            Engine engine = new Engine(10000);
            Wheels wheels = new Wheels(4);
            System.out.println(engine.capacity);
            System.out.println(wheels.numberOfWheels);
        }
    }
}
