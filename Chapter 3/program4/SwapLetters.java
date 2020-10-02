/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: September 20, 2019
 * Filename: SwapLetters.java
 * Description: Switches positions of letters in a word given by the 
 * user
 */

import java.util.Scanner;

public class SwapLetters {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      
      //Prompt user to enter word
      System.out.println("Enter a word:");
      String word = in.nextLine();
      
      //Gets info from user's word to prompt user for two values which
      //represent a letter from that word
      int wlength = word.length() -1;
      System.out.printf("Enter two values for i and j between (0-%d):"
                           , wlength);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      
      //Rearranges letters in user's word
      String letter1 = word.substring(num1, num1 +1);
      String letter2 = word.substring(num2, num2 +1);
      word = word.substring(0,num1) +letter2 + 
         word.substring(num1+1,num2) + letter1 + 
         word.substring(num2+1);
      System.out.printf("** %s **", word);
   }
}