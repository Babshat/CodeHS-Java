public class Chef {
    private String chef;
    private String restaurant;
    private Meal bestMeal;

    public Chef(String chefName, String restaurantName, Meal chefBestMeal) {
        chef = chefName;
        restaurant = restaurantName;
        bestMeal = chefBestMeal;
    }

    public String getName() {
        return this.chef;
    }

    public String getRestaurant() {
        return this.restaurant;
    }

    public String getMealName() {
        return this.bestMeal.getName();
    }

    public int getMealServings() {
        return bestMeal.getNumberOfServings();
    }

    public String getMealCourse() {
        return bestMeal.getCourse();
    }

    public String toString() {
        return "Chef " + chef + " works at " + restaurant + " and is best known for " + bestMeal.getName() + " (" + bestMeal.getCourse() + ")";
    }
}
