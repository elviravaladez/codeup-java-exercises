import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //TODO: CONSOLE IO EXERCISES

        //TODO: Exercise 1: Copy this code into your main method: double pi = 3.14159;

        //CODE:
        double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.

        //CODE:
        System.out.format("The value of pi is approximately %.2f.%n", pi);


        //Don't change the value of the variable; instead, reference one of the
        // links above and use System.out.format to accomplish this.




        //TODO: EXPLORE THE SCANNER CLASS EXERCISES


        //TODO: Exercise 1: Prompt a user to enter an integer and store that value in an int variable using the nextInt method.

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



        //TODO: Exercise 2: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        //CODE
        System.out.println("Enter your 3 favorite reindeer: ");

        String reindeer1 = userInput.next(); //This will capture the first word up to the first white space

        String reindeer2 = userInput.next(); //This will capture the second word up to the second white space

        String reindeer3 = userInput.next(); //This will capture the third word up to the third white space

        System.out.println(reindeer1);
        System.out.println(reindeer2);
        System.out.println(reindeer3);

        //NOTES:
        //What happens if you enter less than 3 words?
            //When you try to enter the console continues to enter to the next line, until you enter the correct about of words


        //What happens if you enter more than 3 words?
            //The console allows you to enter as many words as you want,
            //but it will only print the first 3 words



        //TODO: Exercise 3: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        //CODE:
        System.out.println("Enter a sentence: ");

        String userSentence = userInput.next();

        System.out.println(userSentence);

        //NOTES:
        //Question: Do you capture all the words?
            //No! Just the first word.
    }
}