import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner scan = new Scanner(System.in);
        Food A = new Food("Pizza", 800);
        Food B = new Food("Fries", 240);
        Food C = new Food("Soda", 100);
        
        System.out.println(A);
        System.out.println("HOw many would you like?");
        int E = scan.nextInt();
        System.out.println(B);
        System.out.println("How many would you like?");
        int F = scan.nextInt();
        System.out.println(C);
        System.out.println("How many would you like?");
        int G = scan.nextInt();
        
        E *= A.getCalories();
        F *= B.getCalories();
        G *= C.getCalories();
        int total = E + F + G;
        
        System.out.println("Your meal will have a total of "+ total +" caloreis");
        
        
    }
}
