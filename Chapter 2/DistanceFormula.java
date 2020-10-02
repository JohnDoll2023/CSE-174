public class DistanceFormula
{
   public static void main(String [] args)
   {
      //Declaring variables
      int x1 = 2;
      int x2 = 4;
      int y1 = 5;
      int y2 = 9;
      
      //Writing formula
      double distance = (Math.sqrt(Math.pow(x1 - x2, 2) + 
                                   Math.pow(y1 - y2, 2)));
      System.out.println("Distance: " + distance);
   }
}
      
              
