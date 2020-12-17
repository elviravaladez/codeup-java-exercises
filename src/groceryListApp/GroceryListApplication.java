package groceryListApp;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroceryListApplication {
    //TODO: GROCERY LIST APP: Create a grocery list command line
    // application. You will use your input class from previous exercises.
        //Consider before coding how the data
        // should be organized. Using ArrayLists
        // and HashMaps will be helpful

    //TODO:A user should be prompted if they would like to create a grocery list.
//    //Creating a new instance of Scanner, that makes new user input available
//    Input userInput = new Input();

    //TODO:If they pick yes, they will be prompted if they would like to enter a new item.

    //TODO: If the users picks yes, they should be given the following three prompts:
    //              -Given an ordered list of grocery categories to choose from, select the category.
    //              -Enter the name of the item.
    //              -Enter how many of the item.

    //TODO: The user will then be given the choice to finalize the list or add an item.

    //TODO: Once the user finalizes the list, they will be presented with a complete
    //   list organized alphabetically and grouped by a category, and including quantity.

    public static void groceryPrompt() {

        //Creating ArrayList of Grocery Categories
        ArrayList<String> groceryCategories = new ArrayList<>(Arrays.asList("Fruits", "Vegetables", "Protein", "Whole Grains", "Nuts and Seeds", "Herbs and Spices"));

        //Creating empty userGroceryList HashMap to include key: grocery item, value: amount of items
        HashMap<String, Integer> userGroceryList = new HashMap<>();

        //Creating displayGroceryList HashMap of User to include:
        // Key: String of Category name
        // Value: "userGroceryList" HashMap with
        //         key: item name
        //         value: number of items
        HashMap<String, HashMap<String, Integer>> FinalGroceryList = new HashMap<>();

        //Creating a new instance of Scanner, that makes new user input available
        Input userInput = new Input();
        boolean userContinues = true;

        //User Prompt
        do {
            System.out.println("Would you like to create a grocery list?[yes/no]");
            String userChoice = userInput.getString();

            //Conditional to see if user wants to create a grocery list
            if(!userChoice.trim().equalsIgnoreCase("yes")) {
                System.out.println("Goodbye!");
                userContinues = false;
            } else {
                System.out.println("Would you like to enter a new item?[yes/no]");
                userChoice = userInput.getString();
            }

            //Conditional to see if user wants to enter a new item
            if(!userChoice.trim().equalsIgnoreCase("yes")) {
                userContinues = false;
            } else {

                //Displaying Categories
                System.out.println("\nGiven an ordered list of grocery categories to choose from, select a category from below:");

                System.out.println("==================================================================================================\n");
                System.out.printf("1. %s  %n2. %s %n3. %s %n4. %s %n5. %s %n6. %s%n",groceryCategories.get(0),groceryCategories.get(1), groceryCategories.get(2), groceryCategories.get(3), groceryCategories.get(4), groceryCategories.get(5));
                System.out.println("\n==================================================================================================");

                //Prompting user to enter valid category name
                System.out.println("Enter valid category name here:");
                userChoice = userInput.getString();

                //Checking to see if category user input is valid
                for (String groceryCategory : groceryCategories) {
                    if (!groceryCategories.contains(userChoice.trim())) {
                        System.out.println("invalid entry , please enter a valid category:");
                        userChoice = userInput.getString();
                    } else {
                        break;
                    }
                }
                //Confirming what the user input as a category
                System.out.printf("You've selected the category: %s%n",userChoice);

                //Prompting user to input grocery item
                System.out.printf("Enter the name of the item you would like to add to the %s category:%n", userChoice);
                String groceryItem = userInput.getString();

                //Prompting user to input amount of the above grocery item
                System.out.println("Enter how many of this item you would like:");
                Integer itemAmount = userInput.getInt();

                //Adding the items and item amounts into the userGroceryList HashMap
                userGroceryList.putIfAbsent(groceryItem,itemAmount);

                //Adding the category the user selected to the FinalGroceryList HashMap in addition to the userGroceryList as the value
                FinalGroceryList.putIfAbsent(userChoice, userGroceryList);

                //Asking user if they want to finalize their list
                System.out.println("Would you like to finalize the list?[yes/no]");
                userChoice = userInput.getString();

                //Conditional to see if user wants to finalize their list
                if(userChoice.trim().equalsIgnoreCase("yes")) {
                    userContinues = false;
                }

                System.out.println("Here is your final list:");
                System.out.printf("%s %s %s%n", FinalGroceryList.keySet(), userGroceryList.keySet(), userGroceryList.values());
            }

        } while(userContinues);
    }

    public static void main(String[] args) {
        groceryPrompt();
    }
}
