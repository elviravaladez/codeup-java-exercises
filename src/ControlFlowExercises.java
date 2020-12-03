public class ControlFlowExercises {
    public static void main(String[] args) {
        //TODO: For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

        //TODO: EXERCISE 1: LOOP BASICS
        // a. While
        //      Create an integer variable i with a value of 5.
        //      Create a while loop that runs so long as i is less than or equal to 15
        //      Each loop iteration, output the current value of i, then increment i by one.
        // Your output should look like this:
        // 5 6 7 8 9 10 11 12 13 14 15

        int i = 5;

        while(i <= 15) {
            System.out.println("i is " + i);
            i++;
        }
    }
}
