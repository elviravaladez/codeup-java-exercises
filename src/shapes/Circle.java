package shapes;

public class Circle {

    //TODO: Inside of src, create a directory named shapes.
    // Inside of shapes, create a class named Circle.
    // This class should have a private radius property that is set through the constructor,
    // and various methods for getting information about the circle, detailed below.
        //    public Circle(double radius)
        //    public double getArea()
        //    public double getCircumference()
    private double radius;

    //Constructor
    public Circle(double rad) {
        this.radius = rad;
    }

    //Methods
    public double getArea() {
        double userInput = this.radius;
        return Math.PI * Math.pow(userInput, 2);
    }
    public double getCircumference() {
        double userInput = this.radius;
        return 2 * Math.PI * userInput;
    }

    //Inside of shapes, create a class named CircleApp that prompts the user for the
    // radius of the circle using your Input class, creates a Circle object,
    // and displays the circumference and area. (Note that you will need
    // to import your Input class.)
    
}