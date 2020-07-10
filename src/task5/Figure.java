//5) Create an abstract class Figure. Add fields width and height to it.
// Add an abstract method "calculateArea" which should be overriden by the concrete figures to calculate its area.
package task5;

abstract class Figure {
    public double width;
    public double height;
    abstract public double calculateArea();

}