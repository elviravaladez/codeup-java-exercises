package shapes;

import util.Input; //importing Input class

//TODO: Inside of shapes, create a class named CircleApp that
// prompts the user for the radius of the circle
// using your Input class,
// creates a Circle object, and displays the circumference
// and area. (Note that you will need to import your Input class.)

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input(); //Creating a new instance of Scanner, that makes new user input available

        System.out.println("Please enter the circle radius: "); //Prompting the user
        double radius1 = input.getDouble(); //storing the radius from the user input

        Circle circle1 = new Circle(radius1); //creating a new circle using radius1

        System.out.println("Circumference: " + circle1.getCircumference()); //Print circumference
        System.out.println("Area: " + circle1.getArea()); //Print area
    }
}