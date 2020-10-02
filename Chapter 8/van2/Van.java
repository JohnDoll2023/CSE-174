import java.util.ArrayList;
   
/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   private ArrayList<String> Van = new ArrayList<String> ();
   private int max=0;
   private int miles = 0;
      
   
   /**
      Constructs a van with a given capacity.
      @param maxPassengers the maximum number of passengers that this
      van can hold
   */
   public Van(int maxPassengers)
   {
      max = maxPassengers;
   }
   
   /**
      Boards a passengers up to the capacity of this van.
      @param name the the name of the passenger attempting
      to board
   */
   public void board(String name)
   {
      if(Van.size()<max)
      Van.add(name);
   }
   
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      miles+=distance;
      Van = new ArrayList<String> ();
   }
   
   /**
      Gets the passengers in this van.
      @return a list of passengers
   */
   public ArrayList<String> getPassengers()
   {
      return Van;
   }
   
   /**
      Gets the number of miles that this van has driven.
      @return the number of miles
   */
   public double getMilesDriven()
   {
      return miles;
   }
}