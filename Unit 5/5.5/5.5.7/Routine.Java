public class Routine
{
    public double school;
    public double sleep;
    public double friends;
    public double hobbies;
    
    public Routine(){
        this.school = 0;
        this.sleep = 0;
        this.friends = 0;
        this.hobbies = 0;
    }
    
    public double getSchool(){
        return school;
    }
    
    public double getSleep(){
        return sleep;
    }
    
    public double getFriends(){
        return friends;
    }
    
    public double getHobbies(){
        return hobbies;
    }
    
    public void setSchool(double x){
        school = x;
    }
    
    public void setSleep(double x){
        sleep = x;
    }
    
    public void setFriends(double x){
        friends = x;
    }
    
    public void setHobbies(double x){
        hobbies = x;
    }
    
    public void printTotal(){
        System.out.println("How you Spend Your Week");
        System.out.println("At School: " + school*7);
        System.out.println("Sleeping: " + sleep*7);
        System.out.println("With Friends: " + friends*7);
        System.out.println("Doing fun stuff: " + hobbies*7);
        System.out.println(("You're busy ") + (school*7 + sleep*7 + friends*7 + hobbies*7) + (" hours a week!"));
    }
}
