public class HelloWorld {
    public static void main(String[] args) {
        //INTRO TO JAVA EXERCISE
//        System.out.println("Hello, World!");



        //SYNTAX, TYPES, AND VARIABLES EXERCISES

        //Exercise 1: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        //CODE:
//        int myFavoriteNumber = 10;
//        System.out.println(myFavoriteNumber);



        //Exercise 2: Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        //CODE:
//        String myString = "Hola!";
//        System.out.println(myString);



        //Exercise 3: Change your code to assign a character value to myString. What do you notice?

        //CODE:
//        String myString = 'c';
//        System.out.println(myString);

        //NOTES:
        //I notice that the code does not run. IntelliJ underlines the String in a
        //red squiggly line and says: "Change var 'myString' type to 'char' "

        //Error Says: java: incompatible types: char cannot be converted to java.lang.String



        //Exercise 4: Change your code to assign the value 3.14159 to myString. What happens?

        //CODE:
//        String myString = 3.14159;
//        System.out.println(myString);

        //NOTES:
        //Here's What Happens:
        //IntelliJ underlines the String in a red squiggly line and
        // says: "Change var 'myString' type to 'double' "

        //An Error That Says: java: 'incompatible types: double cannot be converted to java.lang.String'



        //Exercise 5: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        //CODE:
//        long myNumber;
//        System.out.println(myNumber);

        //NOTES:
        //Here's What Happens:
        //InteilliJ underlines myNumber in System.out.println(myNumber); and
        //says: Initialize variable 'myNumber'

        //An Error That Says: java: variable myNumber might not have been initialized



        //Exercise 6: Change your code to assign the value 3.14 to myNumber. What do you notice?

        //CODE:
//        long myNumber = 3.14;
//        System.out.println(myNumber);


        //NOTES:
        //Here's What Happens:
        //IntelliJ underlines long myNumber = 3.14; in red and gives three prompts
            //1. Cast to 'long'
            //2. Change variable 'myNumber' type to 'double'
            //3. Migrate myNumber type to 'double'

        //An Error That Says: java: incompatible types: possible lossy conversion from double to long



        //Exercise 7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        //CODE:
//        long myNumber = 123L;
//        System.out.println(myNumber); //Prints 123


        //Exercise 8: Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        //CODE:
//        long myNumber = 123;
//        System.out.println(myNumber);


        //NOTES:
        //Assigning an integer value to a long works b/c it is implicitly cast



        //Exercise 9: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        //CODE:
//        float myNumber = 3.14;
//        System.out.println(myNumber);


        //NOTES:
        //Here's What Happens:
        //IntelliJ underlines float myNumber = 3.14; and
        // says:
        // Cast to 'float'
        // Change variable 'myNumber' type to 'double'
        //Migrate myNumber type to 'double'

        //An Error That Says: java: incompatible types: possible lossy conversion from double to float

        //Two Ways We Could Fix This:
            //1.Cast to 'float'
            //2. Change variable 'myNumber' type to 'double'



        //Exercise 10: Copy and paste the following code blocks one at a time and execute them

        //CODE:
//        int x = 5;
//        System.out.println(x++); //5
//        System.out.println(x); //6


        //CODE:
        int x = 5;
        System.out.println(++x); //6
        System.out.println(x); //6

        //What is the difference between the above code blocks? Explain why the code outputs what it does.

        //NOTES:
        //Difference:
            //In the first code snippet x is being incremented AFTER it is printed, so you don't see the value
            //as 6 at that point

            //In the second code snippet x is being increments BEFORE it is printed, so you DO see the
            //value as 6



        //Exercise 11: Try to create a variable named class. What happens?

        //CODE:
        String class = "class";
        System.out.println(class);

        //NOTES:
        //There is an error: java: not a statement

        //IntelliJ prompts us to remove expression
        //The space between String class is underlined red.
        //The space and = sign after String class is underlined red.
        //"class"; is underlined red.
        //c in class and ) is underlined red in System.out.println(class);


    }
}
