/**
   This class models a shuttle van.
*/
public class Van
{
   // instance variables
   private int passengers=0;
   private int miles=0;
   private int max=0;
   
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
      Boards passengers up to the capacity of this van.
      @param boardingPassengers the number of passengers attempting
      to board
   */
   public void board(int boardingPassengers)
   {
      if(passengers<max)
         passengers+=boardingPassengers;
      if(passengers>max)
         passengers=max;
   }
   
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      passengers=0;
      miles+=distance;
   }
   
   /**
      Gets the number of passengers in this van.
      @return the number of passengers
   */
   public int getPassengers()
   {
      return passengers;
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