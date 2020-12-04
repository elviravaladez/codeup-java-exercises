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

    //MAIN METHOD
    public static void main(String[] args) {
        addition(10,10);
        subtraction(20, 5);
        multiplication(5, 5);
        division(100, 3);
        modulus(16, 3);
    }
}
