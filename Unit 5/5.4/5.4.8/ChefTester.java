public class ChefTester {
    public static void main(String[] args) {
        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealName());

        // Create your own Meal and Chef here:
        Meal kfc = new Meal("Chicken", "Lunch", 8);
        Chef manMan = new Chef("ManMan", "KFC", kfc);
        System.out.println(kfc);
        System.out.println(manMan);
    }
}
