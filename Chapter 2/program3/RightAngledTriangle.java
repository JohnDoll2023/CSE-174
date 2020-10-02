/*
 * Name: John Doll
 * Instructor: Meisam Amjad
 * CSE 174, Section J
 * Date: September 8, 2019
 * Filename: Traingle.java
 * Description: Asks the user for vertice names for a triangle and
 * vertice coordinates then calculates properties of the triangle
 */
import java.util.Scanner; //Read user inputs

public class RightAngledTriangle {
   public static void main(String [] args) {
      
      //Add scanner to read user input
      Scanner in = new Scanner(System.in);
      
      //Ask user for name of triangle
      System.out.printf("Enter three letter name of the triangle: ");
      String triangleVertices = in.nextLine();
      
      //Ask user for first coordinate location and assign variables
      System.out.printf("Enter the coordinates of " + 
                        triangleVertices.charAt(0) + ": ");
      Double a1 = in.nextDouble();
      Double a2 = in.nextDouble();
      
      //Ask user for second coordinate location and assign variables
      System.out.printf("Enter the coordinates of " + 
                        triangleVertices.charAt(1) + ": ");
      Double b1 = in.nextDouble();
      Double b2 = in.nextDouble();
      
      //Calculates location of third coordinate
      Double c1 = null;
      Double c2 = null;
      if(a1.equals(b1)){
         c1 = a1 + 1;
      }
      else if(!a1.equals(b1)){
         c1=a1;
      }
      if(a2.equals(b2)) {
         c2 = b2 + 1;
      }
      else if(!a2.equals(b2)) {
         c2 = b2;
      }

      //Displays title of information
      System.out.printf("##### Right Triangle Calculation for the " 
                           + triangleVertices + " Triangle #####");
      System.out.printf("\n** The coordinates of the triangle are: **"
                       );
      
      //Displays location of all three coordinates
      System.out.printf("\n" +triangleVertices.charAt(0) + " : (%.3f" 
                           + ", %.3f" + ")", a1, a2);
      System.out.printf("\n" +triangleVertices.charAt(1) + " : (%.3f" 
                           + ", %.3f" + ")" , b1, b2);
      System.out.printf("\n" +triangleVertices.charAt(2) + " : (%.3f" 
                           + ", %.3f" + ")" , c1, c2);
      
      //Calculate length of all three sides
      Double sidea = Math.sqrt((Math.pow(b1-c1,2)) + 
                               (Math.pow(b2-c2,2)));
      Double sideb = Math.sqrt((Math.pow(a1-c1,2)) + 
                               (Math.pow(a2-c2,2)));
      Double sidec = Math.sqrt((Math.pow(a1-b1,2)) + 
                               (Math.pow(a2-b2,2)));
           
      //Displays lengths of all sides
      System.out.printf("\n** The Side lengths are **");
      System.out.printf("\nSide " + triangleVertices.charAt(0) + 
                        " = %.3f units", sidea);
      System.out.printf("\nSide " + triangleVertices.charAt(1) +
                        " = %.3f units", sideb);
      System.out.printf("\nSide " + triangleVertices.charAt(2) +
                        " = %.3f units", sidec);
      
      //Calculates degrees of all angles
      Double anglea = null;
      Double angleb = null;
      Double anglec = null;
      if((sidea>sidec) && (sidea>sideb)) {
         anglea = Math.toRadians(90);
         angleb = Math.toDegrees(Math.asin((sideb*(Math.sin(anglea)))
                                              /sidea));
         anglec = Math.toDegrees(Math.asin((sidec*(Math.sin(anglea)))
                                              /sidea));
         anglea = Math.toDegrees(anglea);
      }
      else if((sideb>sidea) && (sideb>sidec)) {
         angleb = Math.toRadians(90);
         anglea = Math.toDegrees(Math.asin((sidea*(Math.sin(angleb)))
                                              /sideb));
         anglec = Math.toDegrees(Math.asin((sidec*(Math.sin(angleb)))
                                              /sideb));
         angleb = Math.toDegrees(angleb);
      }
      else if((sidec>sidea) && (sidec>sideb)) {
         anglec = Math.toRadians(90);
         anglea = Math.toDegrees(Math.asin((sidea*(Math.sin(anglec)))
                                              /sidec));
         angleb = Math.toDegrees(Math.asin((sideb*(Math.sin(anglec)))
                                              /sidec));
         anglec = Math.toDegrees(anglec);
      }
            
      //Displays angle measures
      System.out.printf("\n** The angles are **");
      System.out.printf("\nAngle " + 
                        Character.toUpperCase(triangleVertices.
                                                 charAt(0)) 
                           + " = %.3f degrees", anglea);
      System.out.printf("\nAngle " + 
                        Character.toUpperCase(triangleVertices.
                                                 charAt(1)) 
                           + " = %.3f degrees", angleb);
      System.out.printf("\nAngle " + 
                        Character.toUpperCase(triangleVertices.
                                                 charAt(2)) 
                           + " = %.3f degrees", anglec);
      
      //Calculates area and perimeter
      double areaTriangle = (((sidea*sideb*sidec)/Math.max(
                            sidea, Math.max(sideb, sidec)))/2);
      double perimeterTriangle = sidea + sideb + sidec;
      
      //Displays area and perimeter
      System.out.printf("\n** The area and perimeter **");
      System.out.printf("\nArea = %.3f sq units", areaTriangle);
      System.out.printf("\nPerimeter = %.3f units", 
                        perimeterTriangle);
      
      //Calculates centroid coordinate
      double xcentroidTriangle = (a1+b1+c1)/3;
      double ycentroidTriangle = (a2+b2+c2)/3;
      
      //Display centroid coordinate
      System.out.printf("\n** The centroid coordinate **");
      System.out.printf("\nO : (%.3f, %.3f)\n", xcentroidTriangle, 
                        ycentroidTriangle);
      
   }
}