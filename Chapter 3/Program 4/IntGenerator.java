/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: September 20, 2019
 * Filename: IntGenerator.java
 * Description: Figures out if a random number is even or odd
 */

public class IntGenerator {
   public static void main(String [] args) {
      
      //Provides range for random integer
      int random = (int) (Math.random() * ((100-50) + 1)) + 50;
      
      //Calculates and displays if the integer is even or odd
      String oddeven = (random%2==1 ? "ODD" : "EVEN");
      System.out.printf("The generated number is %d and it is %s!", 
                        random, oddeven);
   }
}