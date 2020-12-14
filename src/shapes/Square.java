package shapes;

public class Square extends Rectangle {
    private double side;

    //Empty Constructor
    public Square() {

    }

    //Constructor that accepts 1 number for side, and set that property
    public Square(double side) {
        super(side, side);
    }

    //Overriding the getArea method with the following definition
    @Override
    public double getArea() {
        System.out.println("Square implementation of area");
        return Math.pow(length, 2);
    }

    //Overriding the getPerimeter method with the following definition
    @Override
    public double getPerimeter() {
        System.out.println("Square implementation of perimeter");
        return 4 * length;
    }
}
