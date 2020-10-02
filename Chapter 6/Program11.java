/* 
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: November 4, 2019
 * Filename: Program11
 * Description: Prints out open or closed lockers
 */

import java.util.Scanner;

public class Program11 {
   
   //Global variables
   static Scanner in = new Scanner(System.in);
   static boolean stage;
   static int lockers, counttrue, countfalse, j;
  
   //Calls on menu method while the user wants to continue
   public static void main(String [] args) {  
      boolean continuing = true;
      while(continuing) {
         menu();
         System.out.print("\nDo you want to continue [y/n]? ");
         String choice = in.next();
         continuing = (choice.equals("n")) ? false : true;
      }
      System.out.println("End");
   }
   
   //Menu method that prompts user for number of lockers and whether
   //or not they want to see the stages, calls other methods
   public static void menu() {
      while(true) {
         System.out.print("Number of lockers: ");
         lockers = in.nextInt();
         if(lockers >= 2)
            break;
         System.out.println("invalid input");
      }
      System.out.print("Show stages [y/n]? ");
      String choice = in.next();
      stage = (choice.equals("n")) ? false : true;
      firstcalculation();
   }
   
   //Creates the array of lockers, then goes through and changes
   //their values based on what iteration it is by calling 
   //another method, then calls the method to print each stage if 
   //that is what the user wanted, then calls on the method to
   //print the open lockers
   public static void firstcalculation() {
      boolean [] locker = new boolean[lockers];  
      for(j = 1; j <= locker.length; j++) {
         calculation(locker);
         if(stage) {
            stages(locker);
            System.out.print("\t\tOpen: " + counttrue + "\tClosed: " +
                       countfalse + "\n");
         }
      }
      open(locker);
   }
   
   //Determines whether or not a locker should be open or closed
   public static void calculation(boolean [] locker) {
      countfalse = 0;
      counttrue = 0; 
      for(int i = 0; i < locker.length; i++) {
         if(locker[i] == true && (i+1) % j == 0) 
            locker[i] = false;
         else if (locker[i] == false && (i+1) % j == 0) 
            locker[i] = true;
      }
   }
   
   //Prints out 0 of locker is open and - if locker is closed, if
   //user asked for the stages to be printed
   public static void stages(boolean [] locker) {
      for(int i = 0; i < locker.length; i++) {
         if(locker[i] == true) {
            System.out.print("0");
            counttrue++;
         }
         else {
         System.out.print("-");
         countfalse++;
         }
      }
   }
   
   //Prints out the list of open lockers
   public static void open(boolean [] locker) {
      System.out.print("Open: ");
      for(int i = 0; i < locker.length; i++) {
         if(locker[i] == true)
            System.out.print(i + 1 + " ");
      }
   }
}