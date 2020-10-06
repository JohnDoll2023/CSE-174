/* Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: 9/25/19
 * Filename: WednesdayHomework.java
 * Description: runs a quiz
 */

import java.util.Scanner;

public class WednesdayHomework 
{
   public static void main(String [] args) 
   {
      Scanner in = new Scanner(System.in);
      
      //Ask user for name
      System.out.print("Welcome to the quiz, what is your name?:");
      String name = in.nextLine();
      
      //Ask user first question
      System.out.println("true or false: To compare two char values" +
                         " use the equals() method");
      System.out.print("Your answer :");
      String truefalse = in.nextLine();
      double correct = 0.;
      
      //Tell user if they got the question right or wrong
      switch(truefalse){
         case "false": System.out.println("Correct");
         correct = ++correct;
         break;
         default: System.out.println("Incorrect: The correct answer" +
                                     " is false");
      }

      //Ask user second question
      System.out.println("What is the \"computer\".substring(3,5)?");
      System.out.print("Your answer :");
      String computer = in.nextLine();
      
      //Tell user if they got the question right or wrong
      switch(computer) {
         case "pu": System.out.println("Correct");
         correct = ++correct;
         break;
         default: System.out.println("Incorrect: The correct answer" +
                                     " is pu");
         break;
      }
      
      //Ask user third question
      System.out.println("Which types are good for storing numbers" + 
                         " with decimal points?");
      System.out.printf("1. Strings" + "\n2. boolean"+ "\n3. int"+ 
                        "\n4. double"+ "\nYour answwer :");
      int num = in.nextInt();
      
      //Tell user if they got the question right or wrong
      switch(num) {
         case 4: System.out.println("Correct");
         correct = ++correct;
         break;
         default: System.out.println("Incorrect: The correct answer" +
                                     " is 4");
         break;
      }
      
      //Ask user fourth question
      System.out.println("What is the value of pi?");
      System.out.println("Your answer :");
      double pi = in.nextDouble();
      
      //Tell user if they got the question right or wrong
      if(pi==3.14){
         System.out.println("Correct");
         correct = ++correct;
      }
      else {
         System.out.println("Incorrect: The correct answer is 3.14");
      }
      //Ending statement
      double percentage = (correct/4)*100;
      System.out.println("Thanks " + name + " for taking this quiz");
      System.out.printf("You got %.0f out of 4 for a final " +
                        "percentage of %.3f", correct, percentage);
      
   }
}
      