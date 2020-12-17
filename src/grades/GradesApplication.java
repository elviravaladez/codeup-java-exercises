package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

    //*****MAIN METHOD*****
    public static void main(String[] args) {
        //defining a "students" HashMap
        HashMap<String, Student> students = new HashMap<>();


        //Creating 4 Student objects with at least 3 grades for each, and adding the students to the map
        Student sam = new Student("Sam");
        sam.addGrade(93);
        sam.addGrade(62);
        sam.addGrade(83);

        Student tim = new Student("Tim");
        tim.addGrade(95);
        tim.addGrade(90);
        tim.addGrade(89);

        Student jerry = new Student("Jerry");
        jerry.addGrade(72);
        jerry.addGrade(100);
        jerry.addGrade(98);

        Student sean = new Student("Sean");
        sean.addGrade(84);
        sean.addGrade(92);
        sean.addGrade(76);


        //Adding students to the HashMap
        students.put("sam12", sam);
        students.put("tim34", tim);
        students.put("jerry56", jerry);
        students.put("sean78", sean);

//        //Checking to see what "students" HashMap prints
//        System.out.println(students); //DON'T DO THIS!!! Prints like so {sam12=grades.Student@fd34355f}...etc.

//        //Used this instead to print the ACTUAL values for the keys
//        System.out.println(students.keySet());//[sam12, jerry56, sean78, tim34]


        //Storing keySet inside of a variable
        Set<String> usernameKeys = students.keySet();


        //Creating a new instance of Scanner, that makes new user input available
        Input userInput = new Input();

        //boolean set to true for use in Do While Loop below
        boolean userContinues = true;

        //Welcome Message
        System.out.printf("%nWELCOME%n");
        System.out.println("==========");
        System.out.printf("Here are the GitHub usernames of our students:%n");
        System.out.println("==========================================================");

        //Enhanced For Loop to retrieve and print the username keys appropriately
        for (String username : usernameKeys) {
            System.out.printf("| %s | ",username);
        }

        //Do While Loop to prompt the user to input a student name
        // then display information about that student, including their name and their grades
        do{
            System.out.print("\nWhat student would you like to see more information on?");
            String userChoice = userInput.getString();

            //conditional to check if the user input a valid student name
            if(userChoice.equalsIgnoreCase("sam12")) {
                System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", sam.getName(),"sam12", sam.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("tim34")) {
                System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", tim.getName(),"tim34", tim.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("jerry56")) {
                System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", jerry.getName(),"jerry56", jerry.getGradeAverage());
            } else if(userChoice.equalsIgnoreCase("sean78")) {
                System.out.printf("%nName: %s - GitHub Username: %s%nCurrent Average: %.2f%n", sean.getName(),"sean78", sean.getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s.\"%n", userChoice);
            }
                System.out.print("Would you like to see another student?:");
                userChoice = userInput.getString();

                if (!userChoice.trim().equalsIgnoreCase("y")) {
                    System.out.println("\nGoodbye, and have a wonderful day!\n");
                    userContinues = false;
                }
                userContinues = true;

        } while(userContinues);
    }
}
