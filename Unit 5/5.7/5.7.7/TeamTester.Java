public class TeamTester
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 8; i++)
        {
            // Create a team
            Team opponent = new Team();
            
            // Ready to play a tournament?
            System.out.println(i + 1 + " teams added");
            System.out.print("Ready for tournament? ");
            System.out.println(Team.tournamentReady());
        }
    }
}
