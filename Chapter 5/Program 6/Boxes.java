/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: October 4, 2019
 * Filename: Boxes.java
 * Description: Displays three 5x5 boxes from user inputted characters
 */

import java.util.Scanner;

public class Boxes {
   public static void main(String [] args) {
      
      Scanner in = new Scanner(System.in);
      
      //Ask user for 3 characters
      System.out.println("Enter the characters to be displayed in " +
                         "the boxes: ");
      
      //Input characters
      String input = in.nextLine();
      
      //Determine if user's input was valid so that program can run,
      //separate characters and run methods
      if (input.length() != 3  || input.indexOf(" ") != -1) 
         System.out.println("Invalid input!");
      
      else {
         char char1 = input.charAt(0);
         char char2 = input.charAt(1);
         char char3 = input.charAt(2);
         draw(char1); draw(char2); draw(char3);
      }
   }

   /**
    * Draws box
    * @param char1 char type that box is made of
    */ 
   public static void draw(char char1) {
      System.out.printf("\n%c %c %c %c %c \n%c       %c\n%c       %c"  
                        + "\n%c       %c\n%c %c %c %c %c\n\n\n", char1,
                        char1, char1, char1, char1, char1, char1, 
                        char1, char1, char1, char1, char1, char1, 
                        char1, char1, char1);
   }    
}
