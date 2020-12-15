package shapes;

public class Square extends Quadrilateral {

    //Because the length of all sides of a square are the same,
    // the methods for setting the length and the width
    // should set BOTH protected properties

    //Constructor
    public Square(double side) {
        super(side, side);
    }

    //Setters for width and length (Quadrilateral abstract class says we have to define these here
    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    //Methods we have to define due to the Measure
    @Override
    public double getPerimeter() {
        System.out.println("Square implementation of perimeter");
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        System.out.println("Square implementation of area");
        return Math.pow(this.length, 2);
    }
}
