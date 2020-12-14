package shapes;

public class Square extends Rectangle {
    private double sides;

    public Square(double sides) {
        super(sides, sides);
    }

    //getArea that returns sides ^2
    public double getArea() {
        return (double) Math.pow(sides, 2);
    }

    //getPerimeter Method that returns 4 * sides
    public double getPerimeter() {
        return 4 * sides;
    }

}
