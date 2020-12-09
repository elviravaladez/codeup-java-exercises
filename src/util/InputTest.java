package util;


public class InputTest {
    public static void main(String[] args) {
        //TODO: OOP EXERCISE-CREATE AN INPUT VALIDATION
        //  Create another class named InputTest that has a static main method
        //  that uses all the methods from the Input class.

        //If you want to get access to the methods within a class instantiate that class

        // This is instantiation: When you call a constructor of a Class which creates an an instance or object, of the type of that Class.
        // Instantiation allocates the initial memory for the object and returns a reference.

        Input userInput = new Input(); //Creating a new instance of Scanner, that makes new user input available

        //Utilizing all the methods from the Input class
//        System.out.print("Enter a String: ");
//        System.out.println(userInput.getString()); //return type of getString is a String

//        System.out.println(userInput.yesNo());
//        userInput.getInt(1, 10);
        userInput.getDouble(1.0, 10.0);
        //It's a good idea to make a scanner in the input class b/c we only have to make it once
    }
}
