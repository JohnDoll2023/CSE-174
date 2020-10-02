/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: October 25, 2019
 * Filename: lab9
 * Description: finds the amount of times that there is a number 
 * divisable by 3 or 7 between two random boundaries
 */

import java.util.Scanner;

public class lab9 {
   
   public static void main(String [] args) {
      
      //Declare variables
      Scanner in = new Scanner(System.in);
      int max = 0;
      int step = 0;
      
      for(int i = 1; i <= 5; i++)  {
         //Prompts user for start point
         //System.out.print("Enter a start point: ");
         int start = 1000 + (int)(Math.random()*(20000-1000));
      
         //Prompts user for end point
         //System.out.print("Enter a end point: ");
         int end = 20000 + (int)(Math.random()*(50000-20000));
      
         //Declares variables
         int output = start;
         int count = 0;
         String answer = "";
      
         //Calculates variables within limit of the index
         for(int input = start; input <= end; input++) {
            if(isEven(input)) {
               answer += (output * -1) + " ";
               if(multiple3or7(output))
                  ++count;
            }
            else {
               answer += (output + 1) + " ";
               if(multiple3or7(output + 1))
                  ++count;
            }
            output += 2;
         }
      
         //Displays results
         System.out.println(start + "-" + end + ": " + count + 
                            " multiple of 3 or 7");
         max = Math.max(max, count);
         step = (Math.max(max, count) == count) ? i : step;
      }
      System.out.println("Max is: " + max + " from the step " + step);
   }
   
   //Determines whether number is odd or even
   public static boolean isEven(int input) {
      boolean even = false;
      if (input % 2 == 0)
         even = true;
      return even;
   }
     
   //Determines whether a number is a multiple of 3 or 7
   public static boolean multiple3or7(int output) {
      boolean multiple = false;
      if(output % 3 == 0 || output % 7 == 0)
         multiple = true;
      return multiple;
   }
}