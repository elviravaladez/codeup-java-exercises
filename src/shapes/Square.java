package shapes;

public class Square extends Rectangle {
    private double side;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    //Overriding the getArea method with the following definition
    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    //Overriding the getPerimeter method with the following definition
    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }
}
