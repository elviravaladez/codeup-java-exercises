package shapes;

public class Rectangle {
    private int length;
    private int width;

    //Constructor that accepts two numbers for length and width, and sets those properties
    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    //Getter and Setter Methods for Length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //Getter and Setter Methods for Width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //getArea and getPerimeter that returns length * width
    public int getArea() {
        return length * width;
    }

    //getPerimeter Method that returns 2 * length + 2 * width
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
