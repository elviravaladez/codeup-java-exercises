package inheritanceLecture;

import java.util.ArrayList;

public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    public ArrayList<Employee> manageEmployee(ArrayList<Employee>employees) {
        System.out.println("Managing employees");
        return employees;
    }

    public static void main(String[] args) {
        Employee bob = new Developer("Bob");
        Employee john = new Developer("John");
        Developer johnDev = new Developer("John inheritanceLecture.Developer");
        Employee jane = new Teacher("Jane");

        Manager bernice = new Manager("Bernice");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(bob);
        employees.add(john);
        employees.add(jane);
//        employees.add(johnDev);//Can't do this b/c johnDev is a inheritanceLecture.Developer, NOT employee

        bernice.manageEmployee(employees); //Managing employees
    }
}
