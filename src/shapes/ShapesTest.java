package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //Variable of the type Rectangle named box1. Assigned it
        // a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5.0, 4.0);

        //Testing to see if the methods return the correct output
        System.out.println(box1.getPerimeter()); //18.0
        System.out.println(box1.getArea()); //20.0

        //Variable of the type Rectangle named box2.
        // Assigned it as a new instance of the Square class that has a side value of 5.
        Rectangle box2 = new Square(5.0); //Example of Polymorphism

        //Testing to see if the methods return the correct output
        System.out.println(box2.getPerimeter()); //20.0
        System.out.println(box2.getArea()); //25.0


        //TODO: How can you determine which getArea and getPerimeter methods
        // are being called on each object?
            //Add a sout message into the getArea and getPerimeter methods
            // "Square/Rectangle implementation of getArea/getPerimeter"
    }
}
