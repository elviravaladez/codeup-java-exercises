public class DishTest {
    public static void main(String[] args) {
//        //SHORT ASSIGNMENT #1
//        Dish dish = new Dish();
//        dish.costInCents = 500;
//        dish.nameOfDish = "Pizza";
//        dish.wouldRecommend = true;
//        dish.printSummary();


//        //SHORT ASSIGNMENT #2
//        DishTools.shoutDishName(dish);
//        DishTools.analyzeDishCost(dish);
//        DishTools.flipRecommendation(dish);
//        dish.printSummary(); //to check to see if false flipRecommendation is working properly



        //SHORT ASSIGNMENT #3

//        //TODO  3) Refactor code as needed in DishTest to access and modify dish object property values
//        Dish dish = new Dish();
//
//        //USING SETTER METHODS
//        dish.setCostInCents(500);
//        dish.setNameOfDish("Pizza");
//        dish.setWouldRecommend(true);
//        dish.printSummary();


        //TODO  4) Add a constructor method to Dish that will assign all properties
                //SEE dish.java for this exercise

//        //TODO  5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
        Dish dish = new Dish(500, "Pizza", true);
        dish.printSummary();
    }
}
