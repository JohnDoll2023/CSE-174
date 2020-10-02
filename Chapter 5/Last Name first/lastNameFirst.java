import java.util.Scanner;

public class lastNameFirst {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your first and last name: ");
      String name = in.nextLine();
      System.out.println(lastNameFirst(name));
   }
   public static String lastNameFirst(String name) {
      String first = name.substring(name.lastIndexOf(" "));
      String last = name.substring(0, name.lastIndexOf(" "));
      return first + " " + last;
   }
}