/* Name: John Doll
 * Date: September 13, 2019
 * Instructor: Meisam Amjad
 * Filename: Lab3
 * Description: Gets user's name, phone number, and test scores, then
 * averages test scores
 */

import java.util.Scanner;

public class Lab3 {
   public static void main(String [] args) {
      
      //Gets user's name
      System.out.printf("Enter the first and last name: ");
      Scanner in = new Scanner(System.in);
      String firstName = in.next();
      String lastName = in.next();
      
      //Gets user's phone number
      System.out.printf("Enter the phone number in this format (___) ___ - ____ :\n");
      String phone = in.next();
      
      //Gets user's scores
      System.out.printf("Enter 3 scores :\n");
      double score1 = in.nextDouble();
      double score2 = in.nextDouble();
      double score3 = in.nextDouble();
      
      //Calculates average, max, min and median of user's scores
      double average = (score1 + score2 + score3)/3;
      double maximum = (Math.max(score1, Math.max(score2, score3)));
      double minimum = (Math.min(score1, Math.min(score2, score3)));
      double median = (score1 + score2 + score3 - maximum - minimum);
      
      //Displays user's information and scores
      System.out.printf("Name : %s" + " %s\n", firstName, lastName.charAt(0));
      System.out.printf("Phone: %s%s\n", phone.substring(5,8),phone.substring(9,13));
      System.out.printf("Average = %.2f\n", average);
      System.out.printf("Maximum = %.2f\n", maximum);
      System.out.printf("Median = %.2f\n", median);
      System.out.printf("Minimum = %.2f\n", minimum);
   }
}

                        
      