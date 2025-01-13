public class DragonTester
{
    public static void main(String[] args)
    {
        // Create a Dragon here to test out the Dragon class!
        Dragon red = new Dragon(52,"🔥");
        System.out.println(red);
        System.out.println(red.getAttack());
        System.out.println(red.getLevel());
        System.out.println(red.fight());
    }
}
