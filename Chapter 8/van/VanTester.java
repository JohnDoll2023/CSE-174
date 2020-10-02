public class VanTester
{
   public static void main(String[] args)
   {
      Van van1 = new Van(8);
      van1.board(3);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: 3");
      van1.board(6);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: 8");
      van1.drive(10);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: 0");
      System.out.println(van1.getMilesDriven());
      System.out.println("Expected: 10");
      van1.board(6);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: 6");
      van1.drive(12);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: 0");
      System.out.println(van1.getMilesDriven());
      System.out.println("Expected: 22");
   }
}