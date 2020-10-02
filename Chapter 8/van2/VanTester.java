public class VanTester
{
   public static void main(String[] args)
   {
      Van van1 = new Van(8);
      van1.board("Fred");
      van1.board("Ann");
      van1.board("Lee");
      System.out.println(van1.getPassengers());
      System.out.println("Expected: [Fred, Ann, Lee]");
      van1.board("Tim");
      van1.board("Joe");
      van1.board("Pat");
      van1.board("May");
      van1.board("Sue");
      van1.board("Sally");
      System.out.println(van1.getPassengers());
      System.out.println("Expected: [Fred, Ann, Lee, Tim, Joe, Pat, May, Sue]");
      van1.drive(10);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: []");
      System.out.println(van1.getMilesDriven());
      System.out.println("Expected: 10");
      van1.board("Sally");
      System.out.println(van1.getPassengers());
      System.out.println("Expected: [Sally]");
      van1.drive(12);
      System.out.println(van1.getPassengers());
      System.out.println("Expected: []");
      System.out.println(van1.getMilesDriven());
      System.out.println("Expected: 22");
   }
}