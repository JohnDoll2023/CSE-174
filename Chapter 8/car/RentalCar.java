/**
   A rental car with static methods to count rented and available cars.
*/
public class RentalCar
{
   private boolean rented;
   private static int availablecars;
   private static int rentedcars;
   
   /**
      Constructs a rental car.
   */
   public RentalCar(int x)
   { 
      this.rented = false;
      this.availablecars += 1;
      this.rentedcars += 0;
   }
   
   /**
      Get number of cars available.
      @return count of cars that are available
   */
   public static int numAvailable() 
   {
      return availablecars;
   }
   
   /**
      Get number of cars rented.
      @return count of cars that are rented
   */
   public static int numRented() 
   {
      return rentedcars;
   }
   
   /**
      Try to rent this car.
      @return true if the car was successfully rented, false if it was already
      rented.
   */
   public boolean rentCar() 
   {
      if(!this.rented) {
         availablecars-=1;
         rentedcars+=1;
         this.rented=true;
         return true;
      }
      else
         return false;
   }
   
   /**
      Return rented car.
      @return true if the car was previously rented and is now returned,
      false if it was not previously rented.
   */
   public boolean returnCar()
   {
      if (this.rented) {
         this.rented = false;
         availablecars += 1;
         rentedcars -= 1;
         return true;
      } else {
         return false;
      }
   }
}