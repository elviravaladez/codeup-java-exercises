package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //Declare a variable of the type Measurable named myShape.
        Measurable myShape;

        //Creating instance of Square and assigning it to myShape
        // so you can display the shape's area and perimeter
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        //Creating instance of Rectangle and assigning it to myShape
        // so you can display the shape's area and perimeter
        myShape = new Rectangle(5, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        //TODO: Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
            // B/C it extends from the abstract class Quadrilateral, therefore make it a REQUIREMENT
            // for the Rectangle to include a getPerimeter method

        //TODO: What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//        myShape.getLength(); //ERROR!
//        myShape.getWidth(); //ERROR!

//        B/C the compiler checks the class REFERENCE TYPE, not the object type, to see if you can call
//        a method using that reference

//        In this case the reference type of myShape is Measurable, which has no getLength/getWidth methods
    }
}
