public class HelloWorld {
    public static void main(String[] args) {
        //INTRO TO JAVA EXERCISE
//        System.out.println("Hello, World!");



        //SYNTAX, TYPES, AND VARIABLES EXERCISES

        //Exercise 1: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 10;
//        System.out.println(myFavoriteNumber);



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
//        String myString = 3.14159;
//        System.out.println(myString);

        //Here's What Happens:
        //IntelliJ underlines the String in a red squiggly line and
        // says: "Change var 'myString' type to 'double' "

        //An Error That Says: java: 'incompatible types: double cannot be converted to java.lang.String'



        //Exercise 5: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);

        //Here's What Happens:
        //InteilliJ underlines myNumber in System.out.println(myNumber); and
        //says: Initialize variable 'myNumber'

        //An Error That Says: java: variable myNumber might not have been initialized



        //Exercise 6: Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//        System.out.println(myNumber);

        //Here's What Happens:
        //IntelliJ underlines long myNumber = 3.14; in red and gives three prompts
            //1. Cast to 'long'
            //2. Change variable 'myNumber' type to 'double'
            //3. Migrate myNumber type to 'double'

        //An Error That Says: java: incompatible types: possible lossy conversion from double to long



        //Exercise 7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber); //Prints 123


        //Exercise 8: Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        long myNumber = 123;
        System.out.println(myNumber);

        //Assigning an integer value to a long works b/c it is implicitly cast

    }
}
