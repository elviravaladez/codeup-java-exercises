package oopZoo;

public abstract class Animal {

    //Properties
    protected int age;
    protected String gender;
    protected int weightInLbs;

    //Constructor
    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    //Methods
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    //Abstract Method
    public abstract void move(); //Has no body
}
