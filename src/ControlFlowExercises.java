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
//            System.out.println("i is " + i);
//            i++;
//        }


        //TODO: b. Do While.
        //      -TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        //CODE:
//        int i = 0;
//
//        do {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
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
//        long i = 2;
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

        //CODE:
        for(int i = 1; i <= 100; i++) {
            if((i % 15) == 0) {
                System.out.println("FizzBuzz");
            } else if((i % 3) == 0) {
                System.out.println("Fizz");
            } else if((i % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
