package task5;

public class Rectangle extends Figure {

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
