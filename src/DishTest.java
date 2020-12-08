public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 500;
        dish1.nameOfDish = "Pizza";
        dish1.wouldRecommend = true;

        dish1.printSummary();
    }
}
