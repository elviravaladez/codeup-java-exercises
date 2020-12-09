public class Dish {

    // -- OOP SHORT ASSIGNMENT #1 --
    //Create a class called Dish. This class will represent various restaurant dishes.
    //Include an integer property called “costInCents”
    //Include a string property called “nameOfDish”
    //Include a boolean property called “wouldRecommend”
    //Include a method called “printSummary” with a void return type
    //    this method will use a single printf method to print out the values of each of the instance properties in the following format:
    //      Cost: COST_IN_CENTS_HERE
    //      Name: NAME_OF_DISH_HERE
    //      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
    //Create another class called DishTest
    //Add a main method and inside the method...
    //    1) instantiate a Dish object and assign to a variable called dish1
    //    2) assign creative values for each of the properties
    //    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed


    ////CODE:
//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//
//    //Print Summary Method CODE:
//    public void printSummary() {
//        System.out.printf("Cost: %d¢ %nDish Name: %s %nRecommended: %s%n", costInCents, nameOfDish, wouldRecommend);  //Displays cost in cents
////        System.out.printf("Cost: $%.2f %nDish Name: %s %nRecommended: %s%n", costInCents/100.00, nameOfDish, wouldRecommend); //Displays cost in dollars
//    }




    // --OOP SHORT ASSIGNMENT #3 --
    //  Refactor your Dish and DishTest classes

    //TODO 1) Change all properties in the Dish class to private visibility (printSummary should remain public)
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //TODO  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
    //costInCents getter and setter
    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int newCostInCents) {
        this.costInCents = newCostInCents;
    }

    //nameOfDish getter and setter
    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String newNameOfDish) {
        this.nameOfDish = newNameOfDish;
    }

    //wouldRecommend getter and setter
    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean newWouldRecommend) {
        this.wouldRecommend = newWouldRecommend;
    }

    //TODO  4) Add a constructor method to Dish that will assign all properties
    public Dish(int newCostInCents, String newNameOfDish, boolean newWouldRecommend) {
        costInCents = newCostInCents;
        nameOfDish = newNameOfDish;
        wouldRecommend = newWouldRecommend;
    }

    //Print Summary Method
    public void printSummary() {
        System.out.printf("Cost: %d¢ %nDish Name: %s %nRecommended: %s%n", costInCents, nameOfDish, wouldRecommend);  //Displays cost in cents
//        System.out.printf("Cost: $%.2f %nDish Name: %s %nRecommended: %s%n", costInCents/100.00, nameOfDish, wouldRecommend); //Displays cost in dollars
    }
}