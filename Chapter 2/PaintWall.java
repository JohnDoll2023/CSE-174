import java.util.Scanner;
public class PaintWall
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      
      //Ask user for variables
      System.out.print("What is the wall width: ");
      double width = in.nextDouble();
      System.out.print("What is the wall height: ");
      double height = in.nextDouble();
      System.out.print("How many windows are there: ");
      double windows = in.nextDouble();
      
      //Create formula
      final double WINDOW = 6;
      double paintArea = (width*height) - (WINDOW*windows);
      System.out.println("Area to be painted is: " + paintArea);
   }
}