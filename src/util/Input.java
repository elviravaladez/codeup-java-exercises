package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    //When an instance of this object is created, the scanner property should be set to a new
    //instance of the Scanner class
    public Input() {
        this.scanner = new Scanner(System.in);
    }


    //getString method
    public String getString(){
        return this.scanner.nextLine();
    }


    //getString method with String parameter that will act as the prompt
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }


    //yesNo method that return yesNo method with present prompt String
    public boolean yesNo() {
        return yesNo("Please enter yes or no: ");
    }


    //yesNo method that returns a boolean
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = this.scanner.next();
        return (userInput.trim().toLowerCase().equals("y") ||
                userInput.trim().toLowerCase().equals("yes"));
    }


    //getInt method
    public int getInt() {
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input must be an integer!");
            return getInt();
        }
    }


    //getInt method with 2 parameters: int, int
    public int getInt(int min, int max) {
        return getInt(min, max, "Please enter an integer between " + min + " and " + max + ": ");
    }


    //getInt method that has 3 parameters: int, int, String
    public int getInt(int min, int max,String prompt){
        int userInput;
        do{
            System.out.println(prompt);
            userInput = this.scanner.nextInt();
        } while(userInput < min || userInput > max);

        return userInput;
    }


    //getDouble method
    public double getDouble() {
        System.out.print("Please enter a double: ");
        try {
            return Double.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Input must be a number!");
            return getDouble();
        }
    }


    //getDouble method with 2 parameters: int, int
    public double getDouble(double min, double max) {
        return getDouble(min, max, "Please enter a double between " + min + " and " + max + ": ");
    }


    //getDouble method that has 3 parameters: double, double, String
    public double getDouble(double min, double max, String prompt) {
        double userInput;

        do {
            System.out.println(prompt);
            try {
                userInput = Double.valueOf(getString());
            } catch(Exception e) {
                System.out.println("Input must be a number!");
                return getDouble();
            }
        } while(userInput < min || userInput > max);

        return userInput;
    }

}
