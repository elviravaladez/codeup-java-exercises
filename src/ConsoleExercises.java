import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //TODO: CONSOLE IO EXERCISES

        //Exercise 1: Copy this code into your main method: double pi = 3.14159;

        //CODE:
        double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.

        //CODE:
        System.out.format("The value of pi is approximately %.2f.%n", pi);


        //Don't change the value of the variable; instead, reference one of the
        // links above and use System.out.format to accomplish this.


        //TODO: EXPLORE THE SCANNER CLASS

        //Exercise 1: Prompt a user to enter an integer and store that value in an int variable using the nextInt method.

        //CODE:
        Scanner userInput = new Scanner(System.in); //Declaring a variable of type Scanner, and assigning to it a new Scanner object. Specifying System.in for the source of the scanner. This refers to info. a user types into the console.
        System.out.print("Enter an integer: "); //Prompt the user to type something

        int userInteger = userInput.nextInt(); //Use .nextInt() to obtain the value the user entered as an int. Store it in the variable userInteger

        System.out.println("You entered the integer " + userInteger + "."); //Print out the value the user entered.

        //NOTES:
        //What happens if you input something that is not an integer?

        //You get an ERROR in red:
            //Exception in thread "main" java.util.InputMismatchException
            //	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            //	at java.base/java.util.Scanner.next(Scanner.java:1594)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            //	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            //	at ConsoleExercises.main(ConsoleExercises.java:31)

    }
}