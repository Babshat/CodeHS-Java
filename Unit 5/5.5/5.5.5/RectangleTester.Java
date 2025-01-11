public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
        Rectangle rect = new Rectangle(10,5);
        Rectangle rect1 = new Rectangle(7,7);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter()); 
    }
}
