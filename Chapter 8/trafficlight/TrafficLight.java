/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private int steps;
   private int count;
   
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      steps=0;
   }
   
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      if(initialColor.equals("green"))
         steps=0;
      if(initialColor.equals("yellow"))
         steps=1;
      if(initialColor.equals("red"))
         steps=2;
   }
   
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      steps++;
   }
   
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      if((steps-2)%3==0)
         return "red";
      if((steps-1)%3==0 )
         return "yellow";
      else
         return "green";
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      return (steps+1)/3;
   }
}