public class Robot {
   public String name;
   
   public Robot(){

   }
   public Robot(String argName){
      name=argName;
   }
   
   public void sayName(){
     System.out.print(name); 
   }
   
   public String getName(){
      return name;
   }
}