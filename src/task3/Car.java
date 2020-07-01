package task3;

public class Car extends Vehicle {
    int numberOfSeats;

    public Car(String name, String size, int numberOfSeats) {
        super(name, size);   // invoking base-class constructor
        this.numberOfSeats = numberOfSeats;
    }

    protected int numberOfSeats() {
        return numberOfSeats;
    }
}
