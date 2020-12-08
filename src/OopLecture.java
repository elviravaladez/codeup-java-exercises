public class OopLecture {
    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)

            //Creating a new Person object
            Person person1 = new Person();  //Person is the type of the variable rick

            ///Instance variables/properties
            person1.firstName = "Rick";  //assigning the instance variable/property firstName a value
            person1.lastName = "Sanchez"; //assigning the instance variable/property lastName a value

            //person1.age = "30"; //YOU CAN'T ADD A PROPERTY LIKE THIS, IF YOU WANT TO ADD A PROPERTY,
                                //YOU HAVE TO DO THAT IN THE PERSON CLASS

            System.out.println(person1.firstName); //Printing "Rick"
            System.out.println(person1.lastName); //Printing "Sanchez"


            //**** WHAT HAPPENS IF YOU DON'T ASSIGN A VALUE TO ONE OF THE PROPERTIES****

            //If you don't assign a value to one of the properties and you
            //are trying to access it by property, but you didn't assign an explicit value

                // it will output null for ANY REFERENCE TYPES(ex: string)
                // For an int, it will output 0
                // For a char, it will output an empty array (a box character)



//        //If you sout out person1 you will get the location of where the object is located in memory
//            System.out.println(person1); //prints the reference ID


//            //Creating another new Person object
//            Person person2 = new Person();
//            person2.firstName = "Rick";
//            person2.lastName = "Sanchez";
//            System.out.println(person2); // This would sout out a different reference ID than person1, even if the properties are the same
//
//            Person rickImposter = person2; //rickImposter equates to the same reference ID as person2 is you sout it out
//
//            System.out.println(person1 == person2); //prints false b/c they are not the same object



            ////These 2 sout out the SAME location. They are 2 diff. names for the SAME thing
////           CODE:
//            System.out.println(rickImposter);
//            System.out.println(person2);


//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);



        // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");


        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }
}
