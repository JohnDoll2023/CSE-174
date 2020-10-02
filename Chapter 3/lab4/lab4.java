/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: September 20, 2019
 * Filename: lab4
 * Description: Convert temperature and determine what state of matter
 */

import java.util.Scanner;

public class lab4 {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      
      //Prompts user for temperature
      System.out.print("Enter Fahrenheit temperature:");
      double ftemp = in.nextDouble();
      
      //Calculates and displays degrees in celsius
      double ctemp = (((ftemp-32)*5)/9);
      System.out.printf("%.3f Fahrenheit = %.3f Celsius", ftemp, ctemp);
      
      //Determines what state of matter water is in
      if (ctemp <= 0) 
         System.out.println("\nWater is a solid");
      else if (ctemp >= 100)
         System.out.println("\nWater is a gas");
      else 
         System.out.println("\nWater is a liquid");
   }
}
         