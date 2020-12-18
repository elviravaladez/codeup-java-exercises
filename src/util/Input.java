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


    //yesNo method that returns a boolean
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userInput = this.scanner.next();
        return (userInput.trim().toLowerCase().equals("y") || userInput.trim().toLowerCase().equals("yes"));
    }


    //getInt method
    public int getInt() {
        return this.scanner.nextInt();
    }

    //getInt method that has 3 parameters: int, int, String
    public int getInt(int min, int max,String prompt){
        int userInput;
        do{
            System.out.println(prompt);
            userInput = this.scanner.nextInt();
        }while(userInput < min || userInput > max);

        return userInput;
    }

    //getDouble method
    public double getDouble() {
        return this.scanner.nextDouble();
    }


    //getDouble method that has 3 parameters: double, double, String
    public double getDouble(double min, double max, String prompt) {
        double userInput;

        do {
            System.out.println(prompt);
            userInput = this.scanner.nextDouble();
        } while(userInput < min || userInput > max);

        return userInput;
    }

}
