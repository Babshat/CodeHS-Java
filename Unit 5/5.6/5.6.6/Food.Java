public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        public Food(String name, int calories){
            this.name = name;
            this.calories = calories;
        }
        
        //Add getter and setter methods for calories
        public void setName(String name){
            
            this.name = name;
        }
        public String getName(){
            return name;
        }
        
        //Add getter and setter methods for name
        public void setCalories(int calories){
            this.calories = calories;
        }
        
        public int getCalories(){
            return calories;
        }
        
        
        //Add toString method
        public String toString(){
            return name + " have " + calories + " calories.";
        }
    
}
