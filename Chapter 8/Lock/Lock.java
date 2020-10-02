/**
   A simulated lock with digit buttons.
*/
public class Lock
{
   private int combination = 1729; 
   private int input;
   private String key = "";
   
   /**
      Simulates a digit button push.
      @param button a digit 0 ... 9
   */
   public void push(int button)
   {
      key = key + (button);
   }
   
   /**
      Simulates a push of the open button.
      @return true if the lock opened
   */
   public boolean open()
   {
      System.out.print(key);
      if(Integer.parseInt(key)==(combination)) {
         key = "";
         return true;
      }
      key = "";
      return false;
   }
}