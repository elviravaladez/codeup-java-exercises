package oopZoo;

public class Human implements Greeter {
    //Two instance properties of type String called first name and last name
    //properties should not be accessible outside of this class
    private String firstName;
    private String lastName;

    //Constructor
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Method to say hello implemented from Greeter
    public String sayHello() {
        System.out.println("Hello, from " + this.firstName + " " + this.lastName + "!");
        return "Hello, from " + this.firstName + " " + this.lastName + "!";
    }
}
