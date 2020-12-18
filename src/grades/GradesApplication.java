package grades;

import util.Input;

import java.util.HashMap;
import java.util.Set;

public class GradesApplication {

    //*****MAIN METHOD*****
    public static void main(String[] args) {
        prompt();
    }

    //*****OTHER METHODS*****

    //getting students method
    public static HashMap<String, Student> getStudents(){
        //defining a "students" HashMap
        HashMap<String, Student> students = new HashMap<>();

        //Creating 4 Student objects with at least 3 grades for each
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

        return students;
    }


    //getting student info method
    public static String studentInfo(Student student, String key) {
        return String.format("Name: %s - GitHub UserName: %s%nCurrentAverage: %.2f", student.getName(), key, student.getGradeAverage());
    }


    //displaying students method
    public static String displayStudentList(HashMap<String, Student> hashMapOfStudents) {
        //Storing keySet inside of a variable
        Set<String> usernameKeys = hashMapOfStudents.keySet();
        String usernameDisplay = "";

        //Enhanced For Loop to retrieve the username keys appropriately
        for (String username : usernameKeys) {
            usernameDisplay += String.format("| %s | ", username);
        }
        return usernameDisplay.trim();
    }


    //prompting user method
    public static void prompt() {
        //Accessing students via the getStudents method
        HashMap<String, Student> students = getStudents();

        //Welcome Message
        System.out.printf("%nWELCOME%n");
        System.out.println("==========");

        //Creating a new instance of Scanner, that makes new user input available
        Input userInput = new Input();

        //boolean for Do While Loop
        boolean userContinues = true;


        //Do While Loop to prompt the user to input a student name then display information about that student, including their name and their grades
        do {
            System.out.printf("Here are the GitHub usernames of our students:%n");
            System.out.println("==========================================================");

            //Storing keySet inside of a variable
            Set<String> usernameKeys = students.keySet();
            String usernameDisplay = "";

            //Enhanced For Loop to retrieve the username keys appropriately
            for (String username : usernameKeys) {
                usernameDisplay += String.format("| %s | ", username);
            }

            //Displaying usernames
            System.out.println(usernameDisplay);
            System.out.println("==========================================================");

            //Asking user if they'd like to see more information
            System.out.println("What student would you like to see more information on?");
            String userChoice = userInput.getString();

            //conditional to check if the user input a valid student name
            if (students.containsKey(userChoice)) {
                System.out.println(studentInfo(students.get(userChoice), userChoice));
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s.\"%n%n", userChoice);
                System.out.println();
            }
            userContinues = userInput.yesNo("Would you like to see another student?\n");

            if(!userContinues) {
                System.out.println("Goodbye!");
            }

            prompt();

        } while(userContinues);
    }
}