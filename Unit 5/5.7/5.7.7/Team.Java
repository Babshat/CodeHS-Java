public class Team {
    // Static Variables
    public static int totalTeams = 0;
    public static final int minTeams = 6;

    // Constructor
    public Team() {
        totalTeams++;
    }

    // Static Methods
    public static boolean tournamentReady() {
        return totalTeams >= minTeams;
    }
}
