package task3;

public class Car extends Vehicle {
    int numberOfSeats = 4;

    public Car(String name, String size) {
        super(name, size);   // invoking base-class constructor
    }

    protected int numberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("The car has stopped...");
    }
}
