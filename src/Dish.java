public class Dish {
    int costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    //method
    public void printSummary() {
        System.out.printf("Cost: %d¢ %nDish Name: %s %nRecommended: %s%n", costInCents, nameOfDish, wouldRecommend);  //Displays cost in cents
//        System.out.printf("Cost: $%.2f %nDish Name: %s %nRecommended: %s%n", costInCents/100.00, nameOfDish, wouldRecommend); //Displays cost in dollars
    }
}