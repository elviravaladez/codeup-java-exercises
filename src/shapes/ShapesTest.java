package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        //Variable of the type Rectangle named box1. Assigned it
        // a new instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5, 4);

        //Testing to see if the methods return the correct output
        System.out.println(box1.getPerimeter()); //18
        System.out.println(box1.getArea()); //20
    }
}
