import java.util.Scanner;

public class PieSale {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the price of the pie:");
      Double price = in.nextDouble();
      if(price >= 10) {
         price = price - 3.14;
      }
      else if(price<10) {
         price = price - 1;
      }
      System.out.printf("%.2f",price);
   }
}
      
   