import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] args) {
        // ==================== Boolean Expressions

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

//        int randomNumber = 6;
//        System.out.println(randomNumber == 6);

//        char randomChar = 'Y';
//        System.out.println(randomChar == 'y');



        // ==================== Logical Operators

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&

        //ORIGINAL CODE:
//                int x = 2;
//                int y = 3;
//
//                if (true && ++x == y) { //Prints Equal
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x); //Prints 3


//        //ALTERED CODE:
//        int x = 2;
//        int y = 3;
//
//        if (false && ++x == y) { //Prints Not equal
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");;
//        }
//        System.out.println(x); //Prints 2



//        //ALTERED CODE:
//        int x = 2;
//        int y = 3;
//
//        if (false & ++x == y) { //Prints Not equal
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");;
//        }
//        System.out.println(x); //Prints 3





        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!


        //This is b/c we use == to compare primitive types! Each String is a different object.

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine(); //object
//                String cat2 = "cat"; //object
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);



        //USE THIS CODE INSTEAD: using the .equals()
        // do use equals()


//    //ORIGINAL CODE:
//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual); //false

        //ALTERED CODE:
//        boolean stringValuesAreEqual = "Test".equals("Test");
//        System.out.printf("The result is: %s", stringValuesAreEqual); //true


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));



        // ==================== Switch Case

        // basically the same as JS :)


            String caseSwitch = "Fred";
            switch (caseSwitch) {
                case "bob":
                    System.out.println("Case 1");
                    break;
                case "fred":
                    System.out.println("Case 2");
                    break;
                default :
                    System.out.println("Default case");
                    break;
            }

            //OUTPUT WOULD BE: Default case
    }
}
