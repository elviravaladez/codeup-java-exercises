public class DishTest {
    public static void main(String[] args) {

        //SHORT ASSIGNMENT #1
        Dish dish = new Dish();
        dish.costInCents = 500;
        dish.nameOfDish = "Pizza";
        dish.wouldRecommend = true;
        dish.printSummary();


        //SHORT ASSIGNMENT #2
        DishTools.shoutDishName(dish);
        DishTools.analyzeDishCost(dish);
        DishTools.flipRecommendation(dish);
        dish.printSummary(); //to check to see if false flipRecommendation is working properly
    }
}
