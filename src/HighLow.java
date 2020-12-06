import java.util.Scanner;

public class HighLow {
        //TODO: EXERCISE 5: Game Development 101
        //  -You are going to build a high-low guessing game. Create a class named HighLow inside of src.
        //  -The specs for the game are:
        //      -Game picks a random number between 1 and 100.
        //      -Prompts user to guess the number.
        //      -All user inputs are validated.
        //      -If user's guess is less than the number, it outputs "HIGHER".
        //      -If user's guess is more than the number, it outputs "LOWER".
        //      -If a user guesses the number, the game should declare "GOOD GUESS!"
        //  -HINTS: Use the random method of the java.lang.Math class to generate a random number.
    public static void highLow() {
        Scanner userInput = new Scanner(System.in);
        boolean userContinues = true;
        System.out.println("I'm thinking of a number between 1 and 100.");

        do {
            int specialNumber = (int) (Math.random() * 100) + 1;
            System.out.print("Enter your guess here: ");
            int userGuess = userInput.nextInt();

            if(userGuess < 1 || userGuess > 100) {
                System.out.println("ERROR! INVALID ENTRY!");
                highLow();
            } else if(userGuess > specialNumber) {
                System.out.println("LOWER");
            } else if(userGuess < specialNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS!");
            }

            System.out.print("Try Again? (Y/N): ");
            String userYNResponse = userInput.next();

            if(!userYNResponse.equalsIgnoreCase("Y")) {
                userContinues = false;
                System.out.println("Goodbye!");
            }
        } while(userContinues);
    }

    public static void main (String[]args) {
        highLow();
    }
}
