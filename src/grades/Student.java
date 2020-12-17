package grades;

import java.util.ArrayList;

public class Student {
    //private property for the student's name
    private String name;

    //grades private property set as an ArrayList of integers
    private ArrayList<Integer> grades;

    //Constructor that sets name property and
    // initializes the grades property as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //*****METHODS*****
    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students' grades
    public double getGradeAverage() {
        double sum = 0;
//        double totalGrades = this.grades.size();

        for (int grade : this.grades) {
            sum += grade;
        }

        return sum / this.grades.size();
    }

    //*****MAIN METHOD*****

    public static void main(String[] args) {

        //Student objects & verifying that you can add grades to each object
        Student tom = new Student("Tom");
        tom.addGrade(80);
        tom.addGrade(87);
        tom.addGrade(92);

        Student chuck = new Student("Chuck");
        chuck.addGrade(95);
        chuck.addGrade(90);
        chuck.addGrade(89);

        Student barry = new Student("Barry");
        barry.addGrade(72);
        barry.addGrade(65);
        barry.addGrade(86);

        // Verifying that getGradeAverage method works correctly &
        // returns the average of the student's grades
        tom.getGradeAverage(); //Tom's grade average is 86.33
        chuck.getGradeAverage(); //Chuck's grade average is 91.33
        barry.getGradeAverage(); //Barry's grade average is 74.33
    }
}
