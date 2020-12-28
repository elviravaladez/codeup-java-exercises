package oopZoo;

import java.util.ArrayList;
import java.util.Locale;

public class Zoo {

    //Main Method
    public static void main(String[] args) {
//        //Creating Animal Object
//        Animal animal1 = new Animal(12,"Female", 20);
//        animal1.eat();
//        animal1.sleep();


//        //Creating Fish Object
//        Fish seaBass = new Fish(100,"Male",20);
//        seaBass.eat();
//        seaBass.sleep();
//        seaBass.swim();
//        seaBass.move();
//
////        //Creating Bird Object
////        Bird bird1 = new Bird(73, "Female", 5);
////        bird1.eat();
//
//        //Creating Penguin Object
//        Penguin kingPenguin = new Penguin(28, "female",20);
//
//        //Creating Macaw Object
//        Macaw blueMacaw = new Macaw(56, "Female", 3);
//        blueMacaw.eat();
//        blueMacaw.sleep();
//        blueMacaw.fly();
//        blueMacaw.move();

//        //Create an instance of the Human class
//        Human human1 = new Human("Johnny", "Bravo");
//        human1.sayHello();
//
        //Create an instance of the ZooEmployee class
        ZooEmployee employee1 = new ZooEmployee("john", "smith", true);
        ZooEmployee employee2 = new ZooEmployee("jane", "smith", false);
        ZooEmployee employee3 = new ZooEmployee("sam", "smith", true);
//        employee1.sayHello();

        //Declare a ZooEmployee ArrayList of ZooEmployee objects that returns an ArrayList
        //of ZooEmployee objects where each zoo employee's first letter of first and last name are capitalized
        ArrayList<ZooEmployee> zooEmployees = new ArrayList<>();

        zooEmployees.add(employee1);
        zooEmployees.add(employee2);
        zooEmployees.add(employee3);

        ArrayList<ZooEmployee> capitalZooEmployees = capitalizeNames(zooEmployees);

        for(ZooEmployee zooEmployee : capitalZooEmployees) {
            System.out.println(zooEmployee.getFirstName());
            System.out.println(zooEmployee.getLastName());
            zooEmployee.sayHello();
        }

    }

    //(Has to be static so we can use it within the main method)
    //Create a method called capitalizeNames that takes in an ArrayList of ZooEmployee objects and returns an ArrayList
    // of ZooEmployee objects where each zoo employee's first letter of first and last name are capitalized
    public static ArrayList<ZooEmployee> capitalizeNames(ArrayList<ZooEmployee> zooEmployees) {
        //Loop through to access individual objects
        for(ZooEmployee zooEmployee : zooEmployees) {
            String firstName = zooEmployee.getFirstName(); // We are able to use these methods b/c the zooEmployee extends the Human class,
            String lastName = zooEmployee.getLastName();// which includes a getFirstName() and getLastName() method

            //Capitalizing the first letter in first and last name, then setting both within the zooEmployee Object
            zooEmployee.setFirstName(firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
            zooEmployee.setLastName(lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
        }
        return zooEmployees;
    }
}
