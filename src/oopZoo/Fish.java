package oopZoo;

public class Fish extends Animal {

    //Constructor that's inheriting age, gender, weightInLbs from super class
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Flipping my fins");
    }

    public void swim() {
        System.out.println("Swimming!");
    }
}
