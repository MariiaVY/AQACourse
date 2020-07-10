package task5;

public class Circle extends Figure{
    public double r = 2;

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
