public class MethodsExercises {
    // TODO: METHODS EXERCISES
    //      Create a class named MethodsExercises.
    //      Inside of your class, write code to create the specified methods.
    //      Test your code by creating a main method
    //      and calling each of the methods you've created.

    // TODO: EXERCISE 1: BASIC ARITHMETIC

    //   TODO: A) Create four separate methods. Each will perform an arithmetic operation:
    //       -Addition
    //       -Subtraction
    //       -Multiplication
    //       -Division
    // TODO: B) Each function needs to take two parameters/arguments so that the operation can be performed.
    // TODO: C) Test your methods and verify the output.


    //ADDITION METHOD
    public static void addition(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
    }

    //SUBTRACTION METHOD
    public static void subtraction(int numOne, int numTwo) {
        System.out.println(numOne - numTwo);
    }

    //MULTIPLICATION METHOD
    public static void multiplication(int numOne, int numTwo) {
        System.out.println(numOne * numTwo);
    }

    //DIVISION METHOD
    public static void division(double numOne, double numTwo) {
        System.out.println(numOne / numTwo);
    }

    // TODO: D) Add a modulus method that finds the modulus of two numbers.
    //Food for thought: What happens if we try to divide by zero? What should happen?

    //NOTE:
    //If you try to divide by zero you get a RED ERROR that reads:
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at MethodsExercises.division(MethodsExercises.java:20)
        //at MethodsExercises.main(MethodsExercises.java:34)


    //MODULUS METHOD
    public static void modulus(int numOne, int numTwo) {
        System.out.println(numOne % numTwo);
    }



    // TODO: EXERCISE 2: Create a method that validates that user input is in a certain range
    //  -The method signature should look like this:
    //          public static int getInteger(int min, int max);
    //  and is used like this:
    //          System.out.print("Enter a number between 1 and 10: ");
    //          int userInput = getInteger(1, 10);
    //  If the input is invalid, prompt the user again. Hint: recursion might be helpful here!







    //TODO: EXERCISE 3: Calculate the factorial of a number.
    //      -Prompt the user to enter an integer from 1 to 10.
    //      -Display the factorial of the number entered by the user.
    //      -Ask if the user wants to continue.
    //      -Use a for loop to calculate the factorial.
    //      -Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //      -Use the long type to store the factorial.
    //      -Continue only if the user agrees to.
    //      -A factorial is a number multiplied by each of the numbers before it.
    //      -Factorials are denoted by the exclamation point (n!). Ex:
    //          1! = 1               = 1
    //          2! = 1 x 2           = 2
    //          3! = 1 x 2 x 3       = 6
    //          4! = 1 x 2 x 3 x 4   = 24






    //TODO: EXERCISE 4: Create an application that simulates dice rolling.
    //      -Ask the user to enter the number of sides for a pair of dice.
    //      -Prompt the user to roll the dice.
    //      -"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //      -Use static methods to implement the method(s) that generate the random numbers.
    //      -Use the .random method of the java.lang.Math class to generate random numbers.






    //MAIN METHOD
    public static void main(String[] args) {
        addition(10,10);
        subtraction(20, 5);
        multiplication(5, 5);
        division(100, 3);
        modulus(16, 3);
    }
}
