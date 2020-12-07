import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void rpgGame() {
        Scanner userInput = new Scanner(System.in);
        boolean userContinues = true;

        do {
            int heroHealth = 10;
            int heroAttackPoints = 0;
            int healthPotion = 2;

            int enemyHealth = 10;
            int enemyAttackPoints = 0;
            int enemyPotion = 2;

            System.out.println("WELCOME TO THE CONSOLE ADVENTURE GAME");

            System.out.print("Type \"Y\" to Start Game: ");
            String userAnswer = userInput.next().trim();

            if(!userAnswer.equalsIgnoreCase("Y")) {
                System.out.println("INVALID ENTRY! TRY AGAIN");
                rpgGame();
            }

            System.out.print("What is your name, hero? ");
            String userName1 = userInput.next().trim();
            String userName = userName1.substring(0, 1).toUpperCase() + userName1.substring(1);

            if(!userName.isEmpty()) {
                System.out.printf("Welcome aboard, %s!%n", userName);
                System.out.println("============================================");
                System.out.printf("YOUR STATS:  HEALTH = %-5d ATTACK POINTS = %d%n",heroHealth, heroAttackPoints);
                System.out.println("============================================");
                System.out.printf("ENEMY STATS: HEALTH = %-5d ATTACK POINTS = %d%n",enemyHealth, enemyAttackPoints);
                System.out.println("============================================");
            }
        } while(userContinues);
    }
    public static void main(String[] args) {
        rpgGame();
 }
}
