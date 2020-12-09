public class Person {
        //TODO: OOP EXERCISES: 1. OBJECT BASICS
        //TODO: 1) Create Person class inside of src that has a private name property that is a string, and the following methods:
        private String name;

        //Methods
        public String getName(){
                //TODO: return the person's name
                return name;
        }

        public void setName(String name){
                //TODO: change the name property to the passed value
                this.name = name;
        }

        public void sayHello(){
                //TODO: print a message to the console using the person's name
                System.out.printf("Hello, %s!", name);
        }

        //Constructor
        public Person(String name) {
                setName(name);
        }

        //TODO:The class should have a constructor that accepts a `String` value and sets
        //      the person's name to the passed string.
        //      Create a `main` method on the class that creates a new `Person` object and
        //      tests the above methods.
        public static void main(String[] args) {
//                Person p1 = new Person();
//                p1.getName();
//                p1.setName("Tom");
//                p1.sayHello();

                Person p1 = new Person("Tom");
                p1.sayHello();
        }
}
