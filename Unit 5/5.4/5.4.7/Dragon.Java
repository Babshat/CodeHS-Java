public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String theName, int theLevel){
        this.name = theName;
        this.level = theLevel;
        this.canBreatheFire = level>=70;
    }
    // Put getters here
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public boolean isFireBreather(){
        return this.canBreatheFire;
    }
    // Put other methods here
    public void gainExperience(){
        level += 10;
        canBreatheFire = level >= 70;
    }
    public void attack(){
        if(canBreatheFire){
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        }
        else{
            System.out.println("~ ~ ~");
        }
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
