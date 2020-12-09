public class DishTools {
    //    -- SHORT ASSIGNMENT #2 --
    //    Create a class of static members (variables and methods) called DishTools

    //  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    // - shoutDishName() - that takes in a Dish object and prints out the name in all caps
    public static void shoutDishName(Dish dish) {
        System.out.printf("%S!%n", dish.nameOfDish);
    }

    //  - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
    public static void analyzeDishCost(Dish dish) {

        if(dish.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.printf("%s is more expensive than average.%n", dish.nameOfDish);
        }

        System.out.printf("%s is less expensive than average.%n", dish.nameOfDish);
    }

    //  - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
    public static void flipRecommendation(Dish dish) {
        if(dish.wouldRecommend) {
            dish.wouldRecommend = false;
        } else {
            dish.wouldRecommend = true;
        }

    //    Try out the DishTools methods with Dish objects in the DishTest main method
    }

}
