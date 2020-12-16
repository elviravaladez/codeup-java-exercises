package oopZoo;

public class Zoo {

    //Main Method
    public static void main(String[] args) {
//        //Creating Animal Object
//        Animal animal1 = new Animal(12,"Female", 20);
//        animal1.eat();
//        animal1.sleep();


        //Creating Fish Object
        Fish seaBass = new Fish(100,"Male",20);
        seaBass.eat();
        seaBass.sleep();
        seaBass.swim();
        seaBass.move();

//        //Creating Bird Object
//        Bird bird1 = new Bird(73, "Female", 5);
//        bird1.eat();

        //Creating Penguin Object
        Penguin kingPenguin = new Penguin(28, "female",20);

        //Creating Macaw Object
        Macaw blueMacaw = new Macaw(56, "Female", 3);
        blueMacaw.eat();
        blueMacaw.sleep();
        blueMacaw.fly();
        blueMacaw.move();
    }
}
