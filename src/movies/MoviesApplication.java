package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        moviePrompt();
    }

    public static void moviePrompt() {
        Input userInput = new Input(); //Creating a new instance of Scanner, that makes new user input available
        Movie[] movieObj = MoviesArray.findAll();
        boolean userContinues = true;

        System.out.println("=================================================");
        System.out.printf("%40s", "🍿 WELCOME TO THE MOVIE LIST! 🍿");

        do {
            System.out.println("\n=================================================\n");
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("\n=================================================");

            int userChoice = userInput.getInt(0, 5, "\nEnter your choice here: ");

            if(userChoice == 0) {
                break;
            } else {
                for (Movie movie : movieObj) {
                    String movieName = movie.getMovieName();
                    String movieCategory = movie.getCategory();

                    switch(userChoice) {
                        case 1:
                            System.out.printf("%n%s -- %s", movieName, movieCategory);
                            break;
                        case 2:
                            if(movieCategory.equals("animated")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 3:
                            if(movieCategory.equals("drama")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 4:
                            if(movieCategory.equals("horror")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        case 5:
                            if(movieCategory.equals("scifi")) {
                                System.out.printf("%n%s -- %s", movieName, movieCategory);
                            }
                            break;
                        default:
                            userContinues = false;
                            break;
                    }
                }
            }
            System.out.println("\n\n=================================================");
            userContinues = userInput.yesNo("\nDo you wish to continue? (Y/N): ");

        } while(userContinues);

        System.out.println("\n=================================================");
        System.out.println("Exiting Program.....\nGoodbye!");
        System.out.println("=================================================");
    }

}
