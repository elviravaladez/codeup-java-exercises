import java.util.Scanner;

public class ConsoleIoLecture {
    public static void main(String[] args) {
        /* ***************************************
                    print() and println()
         ****************************************/

// >> this:
//        System.out.println("here");
//        System.out.println("there");

// >> is equivalent to this:
//        System.out.print("here2\n");
//        System.out.print("there2\n");


// >> without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");


// >> to concatenate, just like JS:
//        System.out.println("Hello" + " " + "World");


        /* ***************************************
                    printf()/.format
        ****************************************/

        //TODO TOGETHER: Print a formatted string using the following... printf(formatString, data)
//        System.out.printf("Hello%n");
//        System.out.printf("World");

        //Hello
        //World

        //%n represents a new line character
        //If you don't use %n, the next thing you print will print on the same line

        //Using %n will assure that the next piece of code we print will begin on a new line





        //TODO TOGETHER:
        // (1) Create a string variable
        // (2) print using printf() with placeholder %s
//        String name = "Elvira";
//
//        System.out.printf("Hello %s%n", name); //Hello Elvira



        // TODO: print using printf() with placeholder %S
        //This results in capital letters

        //To Make Your Name Uppercase

//        System.out.printf("Hello %S%n", name); //Hello ELVIRA

        //TODO: Remove the %n from the first printf. What do you notice?
        //There was not a new line all the words printed on the same line




        // >>>> Multiple Variables

        //TODO TOGETHER:
        // (1) Create 2 variables - int and string
        // (2) Print using printf() and placeholders
        // note: d : decimal integer [byte, short, int, long]

//        int three = 3;
//
//        String typeOfPet = "cats";
//
//        System.out.printf("I have %d %s%n", three, typeOfPet); //I have 3 cats
//        System.out.printf("I have %d %s.%n", three, typeOfPet); //I have 3 cats



        //%d is a placeholder for a decimal (integer) number (base 10)

        //TODO:
        // (1) Print using printf(), multiple variables, and placeholders


        //CODE:

//        int four = 4;
//
//        String ornaments = "ornaments";
//
//        System.out.printf("I have %d %s.%n", four, ornaments); // I have 3 ornaments;






        // >>>> Currency


        // %f => float/double formatting
        //We can control the precision of the decimal using .___
        // the ___ represent the amount of decimal points we want to represent

        //TODO TOGETHER:
        // (1) Create int variable currencyPennies
        // (2) Print variable using currency formatting

        //CODE:
        int currencyPennies = 1000;

        System.out.printf("I'll sell you land for $%.2f an acre!%n", currencyPennies/100.00); //%f represent float placeholder
        //Output is: I'll sell you land for $10.00 an acre!"




        /* ***************************************
                        USER INPUT
        ****************************************/
        // The Scanner class allows us to get data input that the user enters into the console.
        // Scanner Docs ==> http://www.cs.utexas.edu/users/ndale/Scanner.html

        //CODE:
        Scanner userInput = new Scanner(System.in);

        //Scanner class comes from java.util
        //Scanner will be red because we haven't imported this class


        //The stuff we are trying to capture is coming from the console (System.in) is referring to our console




        // >>>> .next() method
        // .next() captures each input usually signified by whitespace. The input is returned as a string

        //CODE:

//        System.out.println("Please enter your first, middle, and last name.");
//
//        String firstName = userInput.next(); //This will capture the first word up to the first white space
//
//        String middleName = userInput.next(); //This will capture the second word up to the second white space
//
//        String lastName = userInput.next(); //This will capture the third word up to the third white space


        //Typed in the console: name1 name2 name3

//        System.out.println(firstName); //name1
//        System.out.println(middleName); //name2
//        System.out.println(lastName); //name3




        // >>>> .nextInt() method
        // .nextInt() captures the first valid int value

        //CODE:
//        System.out.println("Please enter your age.");
//        int age = userInput.nextInt();
//
//        //Typed in console: 20
//
//        System.out.println(age); //20




        // >>>> .nextLine() method
        // .nextLine() Returns the rest of the current line

        //CODE:
        System.out.println("Enter your favorite quote");

        //Typed in console: This is a quote
        String quote = userInput.nextLine(); //captures the entire line
        System.out.println(quote); //This is a quote



        /* ****************** NOTE ********************
         *Quirk of using next() then nextLine()...
         *https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
         *
         *That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
         *the call to Scanner.nextLine returns after reading that newline.
         *You will encounter the similar behaviour when you use Scanner.nextLine() after Scanner.next()
         *or any Scanner.nextFoo method (except nextLine itself).
         */

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter your favorite number: ");
//         int num = sc.nextInt();
//         System.out.println(num);
//         System.out.print("Please enter your favorite words: ");
//         String words = sc.nextLine();
//         System.out.println(words);


        //When you're using nextInt() and next() several, one after another
        //you could run into issues. Example above
    }
}