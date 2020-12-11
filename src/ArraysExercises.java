import java.util.Arrays;

public class ArraysExercises {

    //TODO: ARRAY BASIC
    // Create a class inside of src named ArraysExercises.
    // Create a main method for this class to do your work.

    //Main Method
    public static void main(String[] args) {
        // TODO: What happens when you run the following code? Why is Arrays.toString necessary?
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        System.out.println(numbers); //the memory location is the output

        //TODO: Create an array that holds 3 Person objects.
        // Assign a new instance of the Person class to each
        // element.
        Person[] people = new Person[3];

        people[0] = new Person("Ethan");
        people[1] = new Person("Elvira");
        people[2] = new Person("Ryan");

        // TODO: Iterate through the array and print out
        //  the name of each person in the array.
        for (Person person : people) {
            System.out.println(person.getName());
        }

        addPerson(people, new Person("Tom"));
    }

    //TODO: Create a static method named addPerson.
    // It should accept an array of Person objects,
    // as well as a single person object to add to the
    // passed array. It should return an array whose
    // length is 1 greater than the passed array, with
    // the passed person object at the end of the array.

    //AddPerson Method
    public static Person[] addPerson(Person[] people, Person person) {
        int newArrLength = people.length + 1;

        Person[] newArr = Arrays.copyOf(people, newArrLength);
        newArr[people.length] = person;

        return newArr;
    }
}