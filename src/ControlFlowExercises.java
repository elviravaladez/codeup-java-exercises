import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO: For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //TODO: EXERCISE 1: LOOP BASICS
        // a. While
        //      -Create an integer variable i with a value of 5.
        //      -Create a while loop that runs so long as i is less than or equal to 15
        //      -Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:
        // 5 6 7 8 9 10 11 12 13 14 15

//        //CODE:
//        int i = 5;
//
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }



        //TODO: b. Do While.
        //      -TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        //CODE:
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);



        //      -TODO: Alter your loop to count backwards by 5's from 100 to -10.

//        //CODE:
//        int i = 100;
//
//        do {
//            if(i % 5 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        } while(i >= -10);



        //      -TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //          2
        //          4
        //          16
        //          256
        //          65536

//        //CODE:
//        long i = 2L;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);



        // TODO c. For
        //     -TODO: Refactor the previous two exercises to use a for loop instead.

//        //REFACTORED CODE FOR EXERCISE 1A:
//        for(int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }


//        //REFACTORED CODE FOR EXERCISE 1B:
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }



        // TODO: EXERCISE 2: FIZZBUZZ
        //  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //      -Write a program that prints the numbers from 1 to 100.
        //      -For multiples of three: print “Fizz” instead of the number.
        //      -For the multiples of five: print “Buzz”.
        //      -For numbers which are multiples of both three and five: print “FizzBuzz”.

//        //CODE:
//        for(int i = 1; i <= 100; i++) {
//            if((i % 15) == 0) {
//                System.out.println("FizzBuzz");
//            } else if((i % 5) == 0) {
//                System.out.println("Buzz");
//            } else if((i % 3) == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }



        //NOTE: When completing the FizzBuzz challenge, order matters!
            //Start with 15, then 5, then 3
            //If you flip the order 3, 5, 15 you would NOT get the same answer



        // TODO: EXERCISE 3: Display a table of powers.
        //          -Prompt the user to enter an integer.
        //          -Display a table of squares and cubes from 1 to the value entered.
        //          -Ask if the user wants to continue.
        //          -Assume that the user will enter valid data.
        //          -Only continue if the user agrees to.
        //     Example Output:
        //What number would you like to go up to? 5
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125



//        CODE:
        Scanner userInput = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.print("What number would you like to go up to? ");

            int startValue = userInput.nextInt(); //This will capture the int up to the first white space
            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed \n------ | ------- | -----");

            for (int i = 1; i <= startValue; i++) {

                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow(i, 3);

                System.out.printf("%-6d | %-7d | %-6d\n", i, numberSquared, numberCubed);
            }

            System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = userInput.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while(userContinues);




        //TODO: EXERCISE 4: Convert given number grades into letter grades.
        //      -Prompt the user for a numerical grade from 0 to 100.
        //      -Display the corresponding letter grade.
        //      -Prompt the user to continue.
        //      -Assume that the user will enter valid integers for the grades.
        //      -The application should only continue if the user agrees to.
        //      -Grade Ranges:
        //          -A : 100 - 88
        //          -B : 87 - 80
        //          -C : 79 - 67
        //          -D : 66 - 60
        //          -F : 59 - 0


//        //CODE:
//        Scanner userInput = new Scanner(System.in);
//
//        boolean anotherGrade = true;
//
//        do {
//            System.out.print("Enter your numerical Codeup grade from 0 to 100: ");
//
//            char letterGrade = 'A';
//            int grade = userInput.nextInt();
//
//            if(grade >= 88) {
//                letterGrade = 'A';
//            } else if(grade >= 80) {
//                letterGrade = 'B';
//            } else if(grade >= 67) {
//                letterGrade = 'C';
//            } else if(grade >= 60) {
//                letterGrade = 'D';
//            } else {
//                letterGrade = 'F';
//            }
//            System.out.printf("Your letter grade is: %c\n", letterGrade);
//
//            System.out.print("Do you wish to enter a new grade? (y/n) ");
//            String userResponse = userInput.next();
//
//            if(!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//        } while (anotherGrade);


    }
}
