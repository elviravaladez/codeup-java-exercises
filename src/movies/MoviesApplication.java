package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input(); //Creating a new instance of Scanner, that makes new user input available

        System.out.println("Hi friend! What would you like to do?");
        System.out.println("======================================");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("======================================");

        int userChoice = userInput.getInt(0, 5, "Enter your choice here: ");

    }

}
