import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); //the array object is not the output

        Person[] people = new Person[3];

        people[0] = new Person("Ethan");
        people[1] = new Person("Elvira");
        people[2] = new Person("Ryan");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        addPerson(people, new Person("Tom"));
    }

    public static Person[] addPerson(Person[] people, Person person) {
        int newArrLength = people.length + 1;

        Person[] newArr = Arrays.copyOf(people, newArrLength);
        newArr[people.length] = person;

        return newArr;
    }
}