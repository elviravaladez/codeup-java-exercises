public class Person {
        //TODO: OOP EXERCISES: 1. OBJECT BASICS
        //TODO: 1) Create Person class inside of src that has a private name property that is a string, and the following methods:
        //TODO:The class should have a constructor that accepts a `String` value and sets
        //      the person's name to the passed string.
        //      Create a `main` method on the class that creates a new `Person` object and
        //      tests the above methods.

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

        public static void main(String[] args) {
//                Person p1 = new Person("Tom");
//                p1.sayHello();
                //TODO: OOP EXERCISE: UNDERSTANDING REFERENCES
                //      The following code blocks make use of the Person class from the
                //      previous exercise. For each code block, think about what the code
                //      will output, then copy the code into IntelliJ and run it to see
                //      if it matches your expectations.

//                Person person1 = new Person("John");
//                Person person2 = new Person("John");
//                System.out.println(person1.getName().equals(person2.getName())); //true
//                System.out.println(person1 == person2); //false

//                Person person1 = new Person("John");
//                Person person2 = person1;
//                System.out.println(person1 == person2); //true

//                Person person1 = new Person("John");
//                Person person2 = person1;
//                System.out.println(person1.getName()); //John
//                System.out.println(person2.getName()); //John
//                person2.setName("Jane");
//                System.out.println(person1.getName()); //Jane
//                System.out.println(person2.getName()); //Jane
        }
}
