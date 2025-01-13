public class Meal {
    private String name;
    private String meal;
    private int numServings;

    public Meal(String theName, String mealUnder, int theNumServings) {
        this.name = theName;
        this.meal = mealUnder;
        this.numServings = theNumServings;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.meal;
    }

    public int getNumberOfServings() {
        return this.numServings;
    }

    public String toString() {
        return name + " (" + meal + ")";
    }
}
