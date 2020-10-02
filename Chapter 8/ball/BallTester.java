public class BallTester
{
   public static void main(String[] args)
   {
      Ball ball1 = new Ball(5);
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 0");
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 1");
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 2");
      ball1.move();
      ball1.move();
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 5");
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 4");
      ball1.move();
      ball1.move();
      ball1.move();
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 0");
      ball1.move();
      System.out.println(ball1.getPosition());
      System.out.println("Expected: 1");
   
      Ball ball2 = new Ball(10);
      for (int i = 1; i <= 42; i++) { ball2.move(); }
      System.out.println(ball2.getPosition());
      System.out.println("Expected: 2");
   }
}