package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    //protected properties for length and width
    protected double length;
    protected double width;

    //Constructor that accepts two numbers for the length and width and sets those properties
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Methods for getting the length and width
    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    //Abstract methods for setting the length and width
    public abstract void setWidth(double width);
    public abstract void setLength(double length);
}
