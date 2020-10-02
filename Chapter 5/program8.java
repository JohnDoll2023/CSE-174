/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: October 20, 2019
 * Filename: program8.java
 * Description: Program identifies largest and smallest number in a
 * list of numbers and counties the occurences of each digit in one
 * number
 */

import java.util.Scanner;

public class program8 {
   
   //Declaring public variables
   static Scanner in = new Scanner(System.in);
   
   public static void main(String [] args) {
      
      //Menu that runs until a valid option is chosen
      while (true) {
         System.out.println("List of Pattern Checker Problems:");
         System.out.println("1) Largest and Smallest Pairs");
         System.out.println("2) Counting digits");
         System.out.printf("3) Quit\nChoice: ");
         int choice = in.nextInt();
         if (choice == 1) {
            pairs();
         }
         else if (choice == 2) {
            countingDigits();
            }
         else if (choice == 3) {
            System.out.println("*** End");
            break;
         }
         else 
            System.out.printf("Invalid input\n\n");
      }
   }
   
   //Computes option 1 of menu, finds largest and smallest number from
   //user designated amount of inputs
   public static void pairs() {
      System.out.println("Enter the limit");
      int limit = in.nextInt();
      
      //Asks user for input until user chooses a valid input
      while (limit < 2) {
            System.out.println("Invalid input. The limit should be " +
                               "at least 2");
            limit = in.nextInt();
      }
      System.out.println("Enter " + limit + " numbers: ");
      int max1 = Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE;
      int min1 = Integer.MAX_VALUE;
      int min2 = Integer.MAX_VALUE;
      
      //Calculates min and max of inputted values
      int count = 0;
      while (count++ < limit) {
         int num = in.nextInt();
         max1 = num > max1 ? max2 = max1 : max1;
         max1 = num > max1 ? max1 = num : max1;
         max2 = (num > max2 && num < max1) ? max2 = num : max2;
         min1 = num < min1 ? min2 = min1 : min1;
         min1 = num < min1 ? min1 = num : min1;
         min2 = (num < min2 && num > min1) ? min2 = num : min2;
      }
      System.out.printf("*** Largest and Smallest Pairs: (%d, %d),(" +
                        "%d, %d)\n\n", max1, max2, min1, min2);
   }
   
   //Calculates the occurence of digits in a number
   public static void countingDigits() {
      int random = 1000000 + (int)(Math.random()*(1000000));
      System.out.println("The generated random number is: " + random);
      System.out.print("*** Counted Pairs are = ");
      int count = 0;
      String output = "";
      while(count < 10) {
         int num = 0;
         int divisor = 1;
         while(divisor < 10000000) {
            if(random/(divisor) % 10 == count) {
               num++; 
            }
            divisor *= 10;
         }
         if (num > 0 && output.length() < 1) 
            output = output + ("(" + count + "," + num + ")");
         else if (num > 0 && output.length() > 1)
            output = output + (", (" + count + "," + num + ")");
         count++;
      }
      System.out.print(output);
      System.out.println("\n");
   }    
}   