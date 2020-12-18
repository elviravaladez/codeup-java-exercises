package collectionsLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CollectionsLecture {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23, 46, 32, 10, 6));

        //displaying each number in the ArrayList
        for(int num:nums){
            System.out.println(num);
        }

        //Creating HashMap
        HashMap<Character,String> answers = new HashMap<>();

        answers.put('A',"Sally");
        answers.put('B',"Sally");
        answers.put('C',"Jimbo");
        answers.put('D',"Jimbo");
        answers.put('E',"Jim");

        //Checking the value stored in C
        System.out.println(answers.get('C')); //Jimbo

        //Returning ALL keys in a HashMap
        System.out.println(answers.keySet());

        //Storing keySet inside of a variable
        Set<Character> keys = answers.keySet();


        //How can we find all of Jimbo's answers?
            //IDEAS
            // Check value of the key
            // Loop and condition
        for(char key:keys) {
            if(answers.get(key).equals("Jimbo")){
                System.out.println(key); //C D
            }
        }
    }
}
