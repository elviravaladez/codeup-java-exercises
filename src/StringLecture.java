public class StringLecture {


    //Important String lesson concepts:
    //  Strings are NOT a primitive type. They are a reference type.
    //  Strings are immutable in Java; string manipulations will not alter original.
    //  String values should NOT be compared using ‘==’.

    public static void main(String[] args) {

// ------ .equals(String anotherString) //Returns a boolean

//        String one = "2";
//        String two = "2";
////        System.out.println(one.equals(two)); //true


//        String one = "bob";
//        String two = "steve";
//        System.out.println(one.equals(two)); //false

        //THIS WORKS
//        System.out.println("bob".equals("steve")); //false


        //DO NOT COMPARE REFERENCE TYPES WITH THE '==' IN JAVA




// ------ .equalsIgnoreCase(String anotherString)  //Returns a boolean

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HoWDy")); //true


// ------ .startsWith(String prefix) //Returns a boolean
        //LOOKS AT THE VERY BEGINNING

//        String title = "Dr. Doctor"; //Capital Case
//        boolean isADoctor = title.toLowerCase().startsWith("dr"); //Example of chaining
//        System.out.println(isADoctor); //true


//        //EDGE-CASE:
//        String title1 = "Dracula"; //Capital Case
//        boolean isADoctor1 = title.toLowerCase().startsWith("dr"); //Example of chaining
//        System.out.println(isADoctor); //true


//        //SOLUTION TO EDGE-CASE:
//        String title2 = "Dracula"; //Capital Case
//        boolean isADoctor2 = title.toLowerCase().startsWith("dr."); //Example of chaining
//        System.out.println(isADoctor); //false




// ------ .endsWith(String suffix)  //Returns a boolean
        //LOOKS AT THE VERY END

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup); //true


// ------ .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//
//        System.out.println(firstLetterCapitalized);


// ------ .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));


// ------ .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));


// ------ .length()  //IS A FUNCTION NOT A PROPERTY

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


// ------ .replace(char oldChar, char newChar)

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch); //tiny dogs looking cute
//        System.out.println(search); //tiny cats looking cute


// ------ .substring(int beginIndex[, int endIndex])
//        Brackets mean [] optional parameter

//        String name = "Justin Bob Reich";
//
//        name.substring(0, 3); //Don't include from 3 on

//        //TESTING OUT INDEX.OF METHOD
//        System.out.println(name.indexOf("s")); //2
//        System.out.println(name.indexOf("i")); //4
//        System.out.println(name.indexOf(" ")); //6
//        System.out.println(name.lastIndexOf(" ")); //10
//
//
//
//        System.out.println(name.substring(0, 3)); //Jus
//
//        String firstName = name.substring(0, name.indexOf(" ")); //Zero is where you start, name. .indexOf() finds the first index of the space .indexOf(" ") is equivalent to 6
//
//        System.out.println(firstName); //Justin



        //IF YOU DON'T INCLUDE A SECOND PARAMETER IT WILL INCLUDE THE ENTIRE STRING AFTER 3(including 3)
//        System.out.println(name.substring(3)); //tin Bob Reich


//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);


// ------ .toLowerCase() and .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase()); //HELLO
//        System.out.println(hello.toLowerCase()); //hello
//        System.out.println(hello); //hELlo


// ------ .trim()
        //.trim() also takes out newline characters
        //Only takes away beginning and ending white space
        //NOT THE MIDDLE SPACE

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//
////        System.out.println(trimmedInput); //bob      smith
//
//        System.out.print("|" + input + "|");// |   bob      smith
//
//                                            //    |



// YES YOU CAN CHAIN METHODS, BUT IT DOES NOT ALWAYS WORK THE WAY WE EXPECT IT TO

// ------ chaining string methods

// convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

        String word1 = "cat";
        String pigLatinWord = word1
            .trim()  //"cat"
            .toLowerCase() //"cat"
            .substring(1) //"at"
            .concat(word1.substring(0, 1).toLowerCase()) //"atc"
            .concat("ay"); //"atcay"
        System.out.println(pigLatinWord); //"atcay"



    }

}