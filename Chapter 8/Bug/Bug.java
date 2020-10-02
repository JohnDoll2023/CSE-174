public class Bug {
   private int position;
   
   public void up() {
      position += 10;
      if(position >= 100) 
         position -= 100;
   }
   
   public int getPosition () {
      return position;
   }
}