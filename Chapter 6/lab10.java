/* 
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: November 1, 2019
 * Filename: lab10
 * Description: adds up random dice rolls
 */

import java.util.Scanner;

public class lab10 {
   
   public static void main(String [] args) {
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("How many random numbers do you want to " +
                         "generate?");
      int num = in.nextInt();
      System.out.println("What is the number of values for each " +
                         "random draw?");
      int range = in.nextInt();
      
      //Declaring variables and array
      int [] generator = new int[num];
      int i;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      
      //Creating random numbers in range and adding them to their
      //corresponding location in the array
      for(i=0; i < num; i++) {
         int value = (int)(Math.random() * (range));
         generator[value] += 1;
      }
      
      //Printing the count of each value and finding max and min
      for(i=0; i < range; i++) {
         System.out.println(i + " " + generator[i]);
         if(generator[i] > max)
            max = generator[i];
         if(generator[i] < min)
            min = generator[i];
      }
      
      System.out.println("The max difference = " + (max-min));
   }
}