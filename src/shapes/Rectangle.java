package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    //Constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Rectangle implementation of perimeter");
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        System.out.println("Rectangle implementation of area");
        return length * width;
    }
}
