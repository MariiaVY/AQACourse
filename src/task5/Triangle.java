package task5;

public class Triangle extends Figure{

    Triangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * width;
    }
}
