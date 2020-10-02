import java.util.*;

/**
 * John Doll
 * CSE 174 Section J
 * 
 * Shopping Cart Application Template
 * Complete the missing code in the program
 */
public class Lab13ShoppingApp {
   static Scanner in = new Scanner(System.in);
   /* main method */
   public static void main(String[] args) {
      //create cart object with the capacity of 10 orders
      ShoppingCart cart = new ShoppingCart(10);
      
      boolean exit = false;
      
      while(!exit) {
         char op = menu();
         
         switch (op) {
            case 'A': 
               cart.addOrder(readOrderFromKeyboard());
               break;
            case 'B': 
               cart.listOrders();
               break;
            case 'C': 
               cart.listOrders();
               System.out.printf("Total: $%.2f\n", cart.getBill());
               System.out.print("Are you sure (yes/no): ");
               if(in.next().equals("yes")) {
                     System.out.println("Done");
                     exit=true;
               }
               break;
            case 'X': 
               System.out.println("Are you sure (yes/no):");
               if(in.next().equals("yes"))
                     exit=true;
               break;
            default: System.out.println("Wrong Option"); 
         }
      }
   }
   
   /**
    * prints a menu and returns a chosen option.
    * @return char The chosen option from the menu.
    */ 
   public static char menu() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nShopping Cart App");
      System.out.println("\tA. Add an item to the Shopping Cart");
      System.out.println("\tB. List items in the Shopping Cart");
      System.out.println("\tC. Pay the bill");
      System.out.println("\tX. Exit");
      System.out.println();
      System.out.print("Option:"); 
      
      return keyboard.next().toUpperCase().charAt(0);
   }
   
   //Gets info from user about shopping items
   public static Order readOrderFromKeyboard() {
      //Create variables
      int bar_code, units;
      String name;
      double price_unit;
      
      //Asks user about item
      System.out.printf("***Enter the Details:\n");
      System.out.printf("%11s", "Bar Code:");
      bar_code = in.nextInt();
      System.out.printf("%11s", "Name:");
      name = in.next();
      System.out.printf("%11s", "Units:");
      units = in.nextInt();
      System.out.printf("%11s", "Unit Price:");
      price_unit = in.nextDouble();
      
      return new Order(bar_code, name, units, price_unit);
   }
}
