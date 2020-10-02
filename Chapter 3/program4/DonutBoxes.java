/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: September 20, 2019
 * Filename: DonutBoxes.java
 * Description: Calculates number of donut boxes needed based on user 
 * input
 * Test cases:
 * These work correctly: -12, -1, 0, 0.1, 0.00001, 1, 11, 12, 12.1, 24
 * These do not work: When the decimal is past 11 places, Ex.
 * .000000000001, 12.000000000001
 */

import java.util.Scanner;

public class DonutBoxes {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      
      //Prompts user for number of donuts
      System.out.print("How many donuts?");
      double donuts = in.nextDouble();
      
      //Calculates number of boxes needed
      double boxes = ((donuts <=0) ? 0 : ((donuts+5.99999999999)/12));
      
      //Determines whether "box" should be plural or not
      String boxname = ((.4167 < boxes && boxes <1.5) ? "box" : "boxes");
      
      //Displays how many boxes you will need
      System.out.printf("You will need %.0f %s for the donuts.",
                        boxes, boxname);
   }
}