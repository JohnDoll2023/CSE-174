/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables
   private int location = 0;
   private boolean value;
   
   /**
      Constructs a ball at position 0 traveling east.
      @param rightWall the position of the wall to the right
   */
   public Ball(int rightWall)
   {
      
   }
   
   /**
      Moves the ball.
   */
   public void move()
   {
      if(location==0)
         value=true;
      if(location == 5)
         value = false;
      if(value) {
         location++;
      }
      else if(!value) {
         location--;
      }
      
   }
   
   /**
      Gets the current position.
      @return the current position
   */
   public int getPosition()
   {
      return location;
   }
}