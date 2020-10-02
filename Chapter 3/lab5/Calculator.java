/* Week 5 lab
 * Calculator.java
 * John Doll
 * Instructor: Meisam Amjad
 * Performs a variety of calculations based on user input/
 */

import java.util.Scanner;

public class Calculator {
   public static void main(String [] args) {
      double num1, num2, num3;
      String opCode;
      String opChar;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter an expression: ");
      
      // Get two numbers and the operator:
      num1 = in.nextDouble();
      opChar = in.next();
      num2 = in.nextDouble();
      
      // Convert string into char
      char ch = opChar.charAt(0);
      
      // dealing with different conditions
       switch(ch) {
         case '+':
            num3 = num1 + num2;
            System.out.printf("Addition: %.1f + %.1f = %.1f", num1, 
                              num2, num3);
            break;
          case '-':
             num3 = num1 - num2;
             System.out.printf("Subtraction: %.1f - %.1f = %.1f", num1
                                  ,num2 ,num3);
             break;
          case '*':
             num3 = num1 * num2;
             System.out.printf("Multiplication: %.1f * %.1f = %.1f",
                               num1, num2, num3);
             break;
          case '^':
             num3 = Math.pow(num1, num2);
             System.out.printf("Power: %.1f ^ %.1f = %.1f", num1, num2
                                  , num3);
             break;
          case '/':
             if (num2 == 0) {
             System.out.println("Division: Divide by zero error");
             }
             else {
                num3 = num1 / num2;
                System.out.printf("Division: %.1f / %.1f = %.1f", num1
                                     , num2, num3);
             }
             break;
          case '?': 
             if (num2 < num1) {
             System.out.println("Random number: First number must " +
                                "be smaller than second number");
             }
             else {
                num3 = num1 + Math.random()*(num2 - num1);
                System.out.printf("Random number: %f", num3);
             }
             break;
          default: System.out.println("Invalid operator");
          
       }
   }  
}