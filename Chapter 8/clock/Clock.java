/**
   A simulated digital clock.
*/
public class Clock
{
   private int hours;
   private int minutes;
   
   /**
      Advances this clock to the next minute.
   */
   public void pulse()
   {
      minutes+=1;
   }
   
   /**
      Gets the hours of this clock.
      @return the hours (between 0 and 23)
   */
   public int getHours()
   {
      hours=minutes/60;
      if(hours>=24)
         hours -= 24;
         
      return hours;
   }
   
   /**
      Gets the minutes of this clock.
      @return the minutes (between 0 and 59)
   */
   public int getMinutes()
   {
      return minutes%60;
   }
}