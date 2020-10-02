/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: October 4, 2019
 * Filename: EarthTemp.java
 * Description: Calculates degrees celsius based on user input for
 * depth in kilometers
 */

import java.util.Scanner;

public class EarthTemp {
   public static void main(String [] args) {
      
      Scanner in = new Scanner(System.in);
      
      //Ask user for depth
      System.out.println("Enter the depth in kilometer: ");
      double depth = in.nextDouble();
      
      //Call on other methods
      getCelsiusAtDepth(depth);
      convertCelsiusToFahrenheit(depth);
   }
   /**
    * Celcius temperature at certain depth
    * @param depth double type depth
    */ 
   public static void getCelsiusAtDepth(double depth) {
      System.out.printf("The Celsius temperature at depth %.2f km is" 
                        + " %.2f.\n", depth, ((10 * depth) + 20));
   }
   /**
    * Fahrenheit temperature at certain depth
    * @param depth double type depth
    */
   public static void convertCelsiusToFahrenheit(double depth) {
      System.out.printf("The Fahrenheit temperature at depth %.2f is" 
                        + " %.2f.", depth, ((1.8 * ((10 * depth) +20)) 
                                              + 32));
   }
}
   