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
        //  -BONUS: Keep track of how many guesses a user makes. Set an upper limit on the number of guesses.
    public static void highLow() {
        Scanner userInput = new Scanner(System.in);
        int specialNumber = (int) (Math.random() * 100) + 1;
        int guessLimit = 5;

        System.out.printf("WELCOME!%n========%nI'm thinking of a number between 1 and 100. Guess the number in 5 attempts to win!%n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your guess here: ");
            int userGuess = userInput.nextInt();

            if (userGuess >= 1 && userGuess <= 100) {
                if (userGuess == specialNumber) {
                    System.out.println("GOOD GUESS!");
                    System.out.print("Play again? (Y/N): ");
                    String userYNResponse = userInput.next();

                    if (!userYNResponse.equalsIgnoreCase("Y")) {
                        System.out.print("Got it. Goodbye!");
                        break;
                    } else {
                        highLow();
                    }

                } else if (userGuess < specialNumber && i != guessLimit - 1) {
                    System.out.println("HIGHER");

                } else if (userGuess > specialNumber && i != guessLimit - 1) {
                    System.out.println("LOWER");
                }

                if (i == guessLimit - 1) {
                    System.out.printf("SORRY! You have reached your limit of guesses %nThe number was %d%n", specialNumber);
                    System.out.print("Play again? (Y/N): ");
                    String userYNResponse = userInput.next();

                    if (!userYNResponse.equalsIgnoreCase("Y")) {
                        System.out.print("Got it. Goodbye!");
                        break;
                    } else {
                        highLow();
                    }
                }
            } else {
                System.out.printf("INVALID ENTRY! TRY AGAIN.%nEnter your guess here: ");
                userGuess = userInput.nextInt();
            }
        }
    }

    public static void main (String[]args) {
        highLow();
    }
}
