package collectionsLecture;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

        // and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
        // TODO: Add more key-value pairs to usernames
        usernames.put("Sophie", "sophiakurihara");
        usernames.put("Vivian", "viviancan");
        usernames.put("Casey", "caseyfriday");

        System.out.println(usernames);

        // obtaining values from the hash map by key
        // TODO: Get the value stored in key "Ryan"
        System.out.println(usernames.get("Ryan"));

        // TODO: Get the value stored in key "Phillip". What is the result?
        System.out.println(usernames.get("Phillip")); //null

        System.out.println(usernames.getOrDefault("Jason", "gocodeup")); //"gocodeup"
        //USE .getOrDefault to get the value for something, but if it doesn't exist set's a default value for that particular key



        // checking if keys or values are present
        // TODO: Check if key "Justin" exists in the HashMap
        System.out.println(usernames.containsValue("justin")); //false b/c justin in the HashMap starts w/a Capital Letter

        // TODO: Check if the value "fmendozaro"
        System.out.println(usernames.containsValue("fmendozaro"));//true


        //WHENEVER YOU PUT THINGS INTO A HASHMAP, THOSE THINGS ARE PLACED INTO THE HASHMAP RANDOMLY



        usernames.put("Ryan", "hiiamryan");

        System.out.println("New: " + usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde");  //<---BEST PRACTICE HERE'S A HASMAP, BUT MAKE SURE YOU AVOID DUPLICATES OR OVERRIDING
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println("NEW 1: " + usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        // TODO: Remove key "Zach" and the value associated with it
        System.out.println(usernames); // {Ryan=ryanorsinger}

        // TODO: Replace Ryan's username with "torvalds"
        System.out.println(usernames); // {Ryan=torvalds}

        usernames.clear();
        System.out.println(usernames.isEmpty());
    }
}