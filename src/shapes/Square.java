package shapes;

public class Square extends Quadrilateral {

    //Because the length of all sides of a square are the same,
    // the methods for setting the length and the width
    // should set BOTH protected properties

    //Constructor
    public Square(double length, double width) {
        super(length, width);
    }

    //Constructor
    public Square(double length) {
        super(length, length);
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
        System.out.println("Square implementation of perimeter");
        return 4 * length;
    }

    @Override
    public double getArea() {
        System.out.println("Square implementation of area");
        return Math.pow(length, 2);
    }
}
