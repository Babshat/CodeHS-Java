public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    Dragon(int theLevel, String theAttack){
        attack = theAttack;
        level= theLevel;
    }
    
    // Put getters here
    public String getAttack(){
        return attack;
    }
    public int getLevel(){
        return level;
    }
    
    // Put other methods here
    public String fight(){
         String fightString = "";
        for(int i = 0; i < level; i++)
        {
            fightString += attack;
        }
        return fightString;
    }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
