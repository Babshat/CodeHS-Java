//creates a class so that the object can be used in multiple files
public class ActivityTracker
{
    public static void main(String[] args)
    {
     //creates a activity log object
        ActivityLog mylog = new ActivityLog();
        
        //The activity log uses two numbers, miles and hours which are being made in this code
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //prints out the total amount of miles the person ran
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        double hoursToday = mylog.getHours();
        
        //updates the amount of hours in the activity log
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        //finds how much the increase was between the hours in the activity log and the hours recorded today
        double increase = mylog.getHours() - hoursToday;
        
        //prints how much the increase of hours was
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
