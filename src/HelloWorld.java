public class HelloWorld {
    public static void main(String[] args) {
        //INTRO TO JAVA EXERCISE
//        System.out.println("Hello, World!");



        //SYNTAX, TYPES, AND VARIABLES EXERCISES

        //Exercise 1: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 10;
        System.out.println(myFavoriteNumber);



        //Exercise 2: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Hola!";
//        System.out.println(myString);



        //Exercise 3: Change your code to assign a character value to myString. What do you notice?
//        String myString = 'c';
//        System.out.println(myString);

        //I notice that the code does not run. IntelliJ underlines the String in a
        //red squiggly line and says: "Change var 'myString' type to 'char' "

        //Error Says: java: incompatible types: char cannot be converted to java.lang.String



        //Exercise 4: Change your code to assign the value 3.14159 to myString. What happens?
        String myString = 3.14159;
        System.out.println(myString);

        //Here's what happens:
        //IntelliJ underlines the String in a red squiggly line and
        // says: "Change var 'myString' type to 'double' "

        //An Error That Says: java: 'incompatible types: double cannot be converted to java.lang.String'



    }
}
