/* Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174 Section J
 * Date: September 23, 2019
 * Filename: MathQuiz.java
 * Description: Create a program that has two different levels of math
 * problems, tracks the user's progress on the math problems, tells
 * the user if they missed the problem, displays the correct 
 * answer if they do miss the problem and shows total time.
 */

import java.util.Scanner;

public class MathQuiz {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      
      //Declare math variables
      int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,
          num12, correctm, correctd, totalcorrect, answer, change;
      
      //Initialize answer counters
      correctm = 0;
      correctd = 0;
      totalcorrect = 0;
      
      //Declare time variables
      long start = 0;
      long end = 0;
      
      //Makes the word "answer" plural or not based on how many
      //questions the user has answered correctly
      String answerplural;
  
      //Includes opening welcome and explanation
      System.out.println("Welcome to my math quiz!");
      System.out.println("This quiz will give you four multiplication"
                            + " problems,");
      System.out.println("followed by four division problems.");
      System.out.println("An easy quiz will include numbers up to" +
                         " 100.");
      System.out.println("A hard quiz will include numbers up to" +
                         " 1000.");
      System.out.println("-----------------------------------------" +
                         "------------");
      System.out.println("Do you want an easy quiz or a hard quiz?");
      
      //Asks the user if they want to do an easy or hard quiz
      System.out.print("Enter the word hard or easy:");
      String easyhard = in.nextLine();
     
      if (!easyhard.equalsIgnoreCase("easy") && 
          !easyhard.equalsIgnoreCase("hard")) {
         System.out.println("Enter the word hard or easy: ");
         easyhard = in.nextLine();
      }
       
      //Separates easy and hard game
      if(easyhard.equalsIgnoreCase("easy")) {
         
         //Starts timer
         start = System.currentTimeMillis();
         
         //Begins easy multiplication
         System.out.println("\n-MULTIPLICATION---------------------" +
                            "-----------------");
         System.out.println("You have chosen easy");
         
         //Creates random variables for multiplication
         num1 = 1 + (int)(Math.random()*(100 - 1 + 1));
         num2 = 1 + (int)(Math.random()*((Math.floor(100.0 / num1))
                                            - 1 + 1));
         num3 = num1 * num2;
         num4 = 1 + (int)(Math.random()*(100-1+1));
         num5 = 1 + (int)(Math.random()*((Math.floor(100.0 / num4))
                                            - 1 + 1));
         num6 = num4 * num5;
         num7 = 1 + (int)(Math.random()*(100-1+1));
         num8 = 1 + (int)(Math.random()*((Math.floor(100.0 / num7))
                                            - 1 + 1));
         num9 = num7 * num8;
         num10 = 1 + (int)(Math.random()*(100-1+1));
         num11 = 1 + (int)(Math.random()*((Math.floor(100.0 / num10))
                                             - 1 + 1));
         num12 = num10 * num11;
         
         //Question 1 of multiplication
         System.out.printf("%d x %d = ",num1,num2);
         answer = in.nextInt();
         if (answer == num3) {
            correctm = ++correctm;
            
            System.out.printf("Correct! 1 answer correct so far.");
         }
         else {
            System.out.printf("Sorry, %d x %d = %d. 0 answers " + 
                              "correct so far.", num1, num2, num3);
         }
         
         //Question 2 of multiplication
         System.out.printf("\n%d x %d = ", num4, num5);
         answer = in.nextInt();
         if (answer == num6) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.", num4, num5, num6, correctm, 
                              answerplural);
         }
         
         //Question 3 of multiplication
         System.out.printf("\n%d x %d = ", num7, num8);
         answer = in.nextInt();
         if (answer == num9) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.", num7, num8, num9, correctm, 
                              answerplural);
         }
         
         //Question 4 of multiplication
         System.out.printf("\n%d x %d = ", num10, num11);
         answer = in.nextInt();
         if (answer == num12) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.\n", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.\n", num10, num11, num12, 
                              correctm, answerplural);
         }    
         
         //Begin easy division problems
         System.out.println("\n-DIVISION-----------------------------" 
                            + "----------------");
         
         //Creates random variables for division
         num1 = 1 + (int)(Math.random()*(100 - 1 + 1));
         num2 = 1 + (int)(Math.random()*(100 - 1 + 1));
         if (num2 > num1) {
            change = num1;
            num1 = num2;
            num2 = change;
         }
         num1 = num1 - (num1 % num2);
         num3 = num1 / num2;
         num4 = 1 + (int)(Math.random()*(100 - 1 + 1));
         num5 = 1 + (int)(Math.random()*(100 - 1 + 1));
         if (num5 > num4) {
            change = num4;
            num4 = num5;
            num5 = change;
         }
         num4 = num4 - (num4 % num5);
         num6 = num4 / num5;
         num7 = 1 + (int)(Math.random()*(100 - 1 + 1));
         num8 = 1 + (int)(Math.random()*(100 - 1 + 1));
         if (num8 > num7) {
            change = num7;
            num7 = num8;
            num8 = change;
         }
         num7 = num7 - (num7 % num8);
         num9 = num7 / num8;
         num10 = 1 + (int)(Math.random()*(100 - 1 + 1));
         num11 = 1 + (int)(Math.random()*(100 - 1 + 1));
         if (num11 > num10) {
            change = num10;
            num10 = num11;
            num11 = change;
         }
         num10 = num10 - (num10 % num11);
         num12 = num10 / num11;
         
         //Question 1 of division
         System.out.printf("%d \u00F7 %d = ", num1, num2);
         answer = in.nextInt();
         if (answer == num3) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num1, num2, num3,
                              totalcorrect, answerplural);
         }
         
         //Question 2 of division
         System.out.printf("\n%d \u00F7 %d = ", num4, num5);
         answer = in.nextInt();
         if (answer == num6) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num4, num5, num6,
                              totalcorrect, answerplural);
         }
         
         //Question 3 of division
         System.out.printf("\n%d \u00F7 %d = ", num7, num8);
         answer = in.nextInt();
         if (answer == num9) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num7, num8, num9,
                              totalcorrect, answerplural);
         }
         
         //Question 4 of division
         System.out.printf("\n%d \u00F7 %d = ", num10, num11);
         answer = in.nextInt();
         if (answer == num12) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("Correct! %d %s correct so far.\n",
                              totalcorrect, answerplural);
         }
         else {
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far\n", num10, num11, num12,
                              totalcorrect, answerplural);
         }
      }
      else if (easyhard.equalsIgnoreCase("hard")) {
         
         //Start timer
         start = System.currentTimeMillis();
         
         //Begin hard multiplication
         System.out.println("You have chosen hard.");
         System.out.println("\n-MULTIPLICATION---------------------" +
                            "-----------------");
         num1 = 1 + (int)(Math.random()*(1000 - 1  + 1));
         num2 = 1 + (int)(Math.random()*((Math.floor(1000.0 / num1))
                                            - 1 + 1));
         num3 = num1 * num2;
         num4 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num5 = 1 + (int)(Math.random()*((Math.floor(1000.0 / num4))
                                            - 1 + 1));
         num6 = num4 * num5;
         num7 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num8 = 1 + (int)(Math.random()*((Math.floor(1000.0 / num7))
                                            - 1 + 1));
         num9 = num7 * num8;
         num10 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num11 = 1 + (int)(Math.random()*((Math.floor(1000.0 / num10))
                                             - 1 + 1));
         num12 = num10 * num11;
         
         //Question 1 of multiplication
         System.out.printf("%d x %d = ",num1,num2);
         answer = in.nextInt();
         if (answer == num3) {
            correctm = ++correctm;
            
            System.out.printf("Correct! 1 answer correct so far.");
         }
         else {
            System.out.printf("Sorry, %d x %d = %d. 0 answers " + 
                              "correct so far.", num1, num2, num3);
         }
         
         //Question 2 of multiplication
         System.out.printf("\n%d x %d = ", num4, num5);
         answer = in.nextInt();
         if (answer == num6) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.", num4, num5, num6, correctm, 
                              answerplural);
         }
         
         //Question 3 of multiplication
         System.out.printf("\n%d x %d = ", num7, num8);
         answer = in.nextInt();
         if (answer == num9) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.", num7, num8, num9, correctm, 
                              answerplural);
         }
         
         //Question 4 of multiplication
         System.out.printf("\n%d x %d = ", num10, num11);
         answer = in.nextInt();
         if (answer == num12) {
            correctm = ++correctm;
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Correct! %d %s correct so far.\n", 
                              correctm, answerplural);
         }
         else{
            answerplural = ((correctm == 1) ? "answer" : "answers");
            System.out.printf("Sorry, %d x %d = %d. %d %s correct" +
                              " so far.\n", num10, num11, num12, 
                              correctm, answerplural);
         }    
         
         //Begin hard division
         System.out.println("\n-DIVISION-----------------------------" 
                            + "----------------");
         
         //Creates random variables for division
         num1 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num2 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         if (num2 > num1) {
            change = num1;
            num1 = num2;
            num2 = change;
         }
         num1 = num1 - (num1 % num2);
         num3 = num1 / num2;
         num4 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num5 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         if (num5 > num4) {
            change = num4;
            num4 = num5;
            num5 = change;
         }
         num4 = num4 - (num4 % num5);
         num6 = num4 / num5;
         num7 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num8 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         if (num8 > num7) {
            change = num7;
            num7 = num8;
            num8 = change;
         }
         num7 = num7 - (num7 % num8);
         num9 = num7 / num8;
         num10 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         num11 = 1 + (int)(Math.random()*(1000 - 1 + 1));
         if (num11 > num10) {
            change = num10;
            num10 = num11;
            num11 = change;
         }
         num10 = num10 - (num10 % num11);
         num12 = num10 / num11;
         
         //Question 1 of division
         System.out.printf("%d \u00F7 %d = ", num1, num2);
         answer = in.nextInt();
         if (answer == num3) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            totalcorrect = correctd + correctm;
            answerplural = ((totalcorrect == 1) ? "answer" : 
                               "answers");
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num1, num2, num3,
                              totalcorrect, answerplural);
         }
         
         //Question 2 of division
         System.out.printf("\n%d \u00F7 %d = ", num4, num5);
         answer = in.nextInt();
         if (answer == num6) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num4, num5, num6,
                              totalcorrect, answerplural);
         }
         
         //Question 3 of division
         System.out.printf("\n%d \u00F7 %d = ", num7, num8);
         answer = in.nextInt();
         if (answer == num9) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            System.out.printf("Correct! %d %s correct so far.",
                              totalcorrect, answerplural);
         }
         else {
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far", num7, num8, num9,
                              totalcorrect, answerplural);
         }
         
         //Question 4 of division
         System.out.printf("\n%d \u00F7 %d = ", num10, num11);
         answer = in.nextInt();
         if (answer == num12) {
            correctd = ++correctd;
            totalcorrect = correctd + correctm;
            System.out.printf("Correct! %d %s correct so far.\n",
                              totalcorrect, answerplural);
         }
         else {
            System.out.printf("No, %d \u00F7 %d = %d. %d %s correct" +
                              " so far\n", num10, num11, num12,
                              totalcorrect, answerplural);
         }
      }
      
      //End sequence
      System.out.println("\n-RESULTS-------------------------------" +
                         "---------------");
      
      //Time
      end = System.currentTimeMillis();
      int time = (int) (end - start) / 1000;
      System.out.printf("You answered the questions in %d" +
                           " seconds.", time);
      
      //Multiplication stats
      double percent = (correctm / 4.0) * 100;
      System.out.printf("\nMultiplication score: %d out of 4" +
                        " %c%.2f%c%c",
                        correctm, (char)40, percent, (char)37,
                        (char)41);
      
      //Division stats
      percent = (correctd / 4.0) * 100;
      System.out.printf("\nDivision score: %d out of 4 %c%.2f%c%c",
                        correctd, (char)40, percent, (char)37,
                        (char)41);
     
      //Overall stats
      percent = (totalcorrect / 8.0) * 100; 
      System.out.printf("\nOverall score: %d out of 8 %c%.2f%c%c",
                        totalcorrect, (char)40, percent, (char)37,
                        (char)41);
   }
}     