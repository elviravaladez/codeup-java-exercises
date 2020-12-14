package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //Empty Constructor
    public Rectangle() {

    }

    //Constructor that accepts two numbers for length and width, and sets those properties
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    //Getter and Setter Methods for Length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Getter and Setter Methods for Width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //getArea that returns length * width
    public double getArea() {
        return this.length * this.width;
    }

    //getPerimeter Method that returns 2 * length + 2 * width
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}
