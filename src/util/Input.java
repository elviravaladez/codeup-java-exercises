package util;

import java.util.Scanner;
    //TODO: OOP EXERCISE-CREATE AN INPUT VALIDATION
    //  TODO: Create a package inside of src named util.
public class Input {
    //  TODO: Inside of util, create a class named Input that has a private property named scanner.
    private Scanner scanner;

    //  TODO: When an instance of this object is created, the scanner property
    //   should be set to a new instance of the Scanner class.
    //These directions mean to create the input constructor

    //This means when the Input instance is created we
    // can create a new instance of the Scanner class
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    //  TODO: The class should have the following methods, all of which return
    //   command line input from the user:
    //      String getString()
    //      boolean yesNo()
    //      int getInt(int min, int max)
    //      int getInt()
    //      double getDouble(double min, double max)
    //      double getDouble()

    public String getString(){
        return this.scanner.nextLine();
    }

    //TODO: The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String userInput = this.scanner.nextLine();

        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    //TODO: The getInt(int min, int max) method should keep prompting the user
    //      for input until they give an integer within the min and max.
    public int getInt(int min, int max) {
        System.out.printf("Enter an integer from %d to %d: ",min, max);
        int userInput = this.scanner.nextInt();

        if(userInput < min || userInput > max) {
            System.out.printf("INVALID ENTRY!");
            getInt(min,max);
        } else {
            System.out.printf("You've entered: %d!%n", userInput);
            return userInput;
        }
         return userInput;
    }

    //TODO: The getDouble method should do the same thing, but with decimal numbers.
    public double getDouble(double min, double max) {
        System.out.printf("Enter an integer from %.2f to %.2f: ",min, max);
        double userInput = this.scanner.nextDouble();

        if(userInput < min || userInput > max) {
            System.out.printf("INVALID ENTRY!");
            getDouble(min,max);
        } else {
            System.out.printf("You've entered: %.2f!%n", userInput);
            return userInput;
        }
         return userInput;
    }

    //TODO: Create another class named InputTest that has a static main method that uses all the methods from the Input class.
}
