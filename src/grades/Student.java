package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    //private property for the student's name
    private String name;

    //grades private property set as an ArrayList of integers
    private ArrayList<Integer> grades;

    //Constructor that sets name property and
    // initializes the grades property as an empty ArrayList
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    //*****METHODS*****
    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public static double getGradeAverage(String name,ArrayList<Integer>grades) {
        int sum = 0;
        int totalGrades = grades.size();

        if (grades.isEmpty()) {
            return 0.0;
        }

        for (Integer grade : grades) {
            sum += grade;
        }

        System.out.printf("%s's grade average is %.2f%n", name, (double) sum / totalGrades);
        return ((double) sum) / totalGrades;
    }

    //*****MAIN METHOD*****
    public static void main(String[] args) {
        //Tom's grades arraylist
        ArrayList<Integer> tomsGrades = new ArrayList<>();
        tomsGrades.add(80);
        tomsGrades.add(87);
        tomsGrades.add(92);

        //Chuck's grades arraylist
        ArrayList<Integer> chucksGrades = new ArrayList<>();
        chucksGrades.add(95);
        chucksGrades.add(90);
        chucksGrades.add(89);

        //Barry's grades arraylists
        ArrayList<Integer> barrysGrades = new ArrayList<>();
        barrysGrades.add(72);
        barrysGrades.add(65);
        barrysGrades.add(86);

        //Student objects & verifying that you can add grades to each object
        Student tom = new Student("Tom",tomsGrades);
        Student chuck = new Student("Chuck",chucksGrades);
        Student barry = new Student("Barry", barrysGrades);

        // Verifying that getGradeAverage method works correctly &
        // returns the average of the student's grades
        getGradeAverage("Tom",tomsGrades);
        getGradeAverage("Chuck",chucksGrades);
        getGradeAverage("Barry",barrysGrades);
    }
}
