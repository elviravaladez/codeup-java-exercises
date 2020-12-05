import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // TODO: STRINGS EXERCISE (2/2)

        //TODO: Exercise 2: Create a class named Bob with a main method for the following exercise.
        //      -Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //             -Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //             -He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //             -He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //             -He answers 'Whatever.' to anything else.
        //
        //     -TODO: Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner userInput = new Scanner(System.in);

        boolean wantsToChat = true;

        do {
            System.out.println("Type below to chat with Bob: ");
            String userResponse = userInput.nextLine().trim();

            if(userResponse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                do {
                    String lastChar = userResponse.substring(userResponse.length() - 1);
                    if (lastChar.equals("?")) {
                        System.out.println("Sure.");
                        break;
                    } else if (lastChar.equals("!")) {
                        System.out.println("Whoa, chill out!");
                        break;
                    } else if (userResponse.isEmpty()) {
                        System.out.println("Fine. Be that way!");
                        break;
                    } else {
                        System.out.println("Whatever.");
                        break;
                    }
                } while (!userResponse.isEmpty());
            }

            System.out.print("Do you wish to continue your conversation with Bob? (Y/N): ");
            String userYNReply = userInput.nextLine();

            if(!userYNReply.equalsIgnoreCase("Y")) {
                wantsToChat = false;
            }
        } while(wantsToChat);
    }
}
