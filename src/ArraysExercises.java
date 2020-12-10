import org.w3c.dom.ls.LSOutput;

public class ArraysExercises {

    //TODO: ARRAY BASIC
    // Create a class inside of src named ArraysExercises.
    // Create a main method for this class to do your work.

    // TODO: What happens when you run the following code? Why is Arrays.toString necessary?
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //the location is souted out

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

        //TODO: Create a static method named addPerson.
        // It should accept an array of Person objects,
        // as well as a single person object to add to the
        // passed array. It should return an array whose
        // length is 1 greater than the passed array, with
        // the passed person object at the end of the array.


    }

}