public class ActivityTracker
{
    public static void main(String[] args)
    {
        /*
        Constructs a ActivityLog object
        Precondition: Instance variables must be initialized.
        Postcondition: Creates the object
    
        @return ActivityLog objects tht uses hours and miles
        */
        ActivityLog mylog = new ActivityLog();
        
        mylog.addMiles(5);
        mylog.addHours(1);
        /*
        Gets the amount of miles
        Precondition: Miles must already be established
        Postcondition: returns miles
         
        @return Miles
        */
        /*
        Gets the amount of hours
        Precondition: hours must already be established
        Postcondition: returns hours
         
        @return Hours
        */
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        double hoursToday = mylog.getHours();
        
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        double increase = mylog.getHours() - hoursToday;
        
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
