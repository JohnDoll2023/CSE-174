/* 
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: October 30, 2019
 * Filename: Program10
 * Description: Gives user a menu to perform either an alternating sum
 * of user intput values, reversing the user input values, or 
 * displaying 20 random dice rolls
 */

import java.util.Scanner;

//Correct filename
public class Program10 {
   
   static Scanner in = new Scanner(System.in);
   static int [] backwards;
   
   //Menu for users to decide which task to perform
   public static void main(String [] args) {
      System.out.println("PROGRAM#10");
      System.out.println("1- alternatingSum");
      System.out.println("2- reverse");
      System.out.println("3- Run");
      System.out.println("4- Exit");
      boolean test = true;
      
      while(test) {
         System.out.print("Enter a number [1-4]: ");
         int selection = in.nextInt();
         switch(selection) {
            case 1: 
               System.out.printf("\n** alternatingSum **\n");
               System.out.print("The result is: ");
               System.out.println(alternatingSum());
               test = false;
               break;
            case 2:
               System.out.println("** reverse **");
               reverse();
               display(backwards);
               test = false;
               break;
            case 3:
               System.out.println("** run **");
               System.out.println("The sequence of numbers is: ");
               run();
               test = false;
               break;
            case 4:
               test = false;
               break;
            default:
               System.out.println("Invalid input!");
         }
      }
   }
   
   //Gets array values from user for selections 1 and 2
   public static int[] getValue() {
      int [] values;
      
      //Asks a valid array amount and then asks them to enter that 
      //amount of numbers
      while(true) {
         System.out.print("How many integer values: ");
         int size = in.nextInt();
         if(size < 1)
            System.out.println("Invalid input!");
      
         else { 
            System.out.print("Enter the numbers: ");  
            values = new int[size];
            for(int i = 0; i < values.length; i++) 
               values[i] = in.nextInt();
            break;
         }
      }
      return values;
   }
   
   //Computes the alternating sum output
   public static int alternatingSum() {
      int sum = 0;
      int i = 0;
      int [] values = getValue();
      for(i=i; i < values.length; ++i) {
         if(i % 2 == 0)
            sum += values[i];
         else
            sum += -values[i];
      }
      return sum;
   }
   
   //Reverse the order of the inputted numbers
   public static int[] reverse() {
      int i = 0;
      int [] values = getValue();
      backwards = new int[values.length];
      for(i=i; i < values.length; i++)
         backwards[i] = values[values.length-1-i];
      return backwards;
   }
   
   //Returns random dice roll outputs
   public static void run() {
      int [] run = new int[20];
      for(int i = 0; i < run.length; i++) 
            run[i] = 1 + (int)(Math.random()*(7-1));
      boolean inRun = false;
      int i = 0;
      
      //Computes whether or not the adjacent values are part of a
      //series of the same values
      int firstp=0;
      int secondp=0;
      int realfirstp=0;
      int realsecondp=0;
      int maxp = Integer.MIN_VALUE;
      for(i=i; i < run.length; i++) {
         if(inRun) {
            if(run[i] != run[i-1]) {
               secondp = i;
               inRun = false;
               if((secondp-firstp) > maxp) {
                  realfirstp = firstp;
                  realsecondp = secondp;
                  maxp = secondp-firstp;
               }
            }
         }
         if(i != run.length-1 && run[i] == run[i+1] && !inRun) {
               firstp = i;
               inRun = true;
            }
      }
      
      for(i=0; i < run.length; i++) {
         if(realfirstp == i)
            System.out.print("(");
         System.out.print(run[i]);
         if(realfirstp > realsecondp && i == 19)
            System.out.print(")");
         else if((realsecondp - 1) == i)
            System.out.print(")");
         System.out.print(" ");
      }
   }
   
   //Prints out the array from the reverse method
   public static void display(int [] backwards) {
      int i = 0;
      for(i = i; i < backwards.length; i++)
         System.out.print(backwards[i] + " ");
   }
}