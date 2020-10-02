public class Strings {
   public static String abbreviate(String str, int length)
   {
      String result = "";
      if (str.length() <= length)
      {
         result = str;
      }
      else if (length >= 3)
      {
         result = str.substring(0, length -3 ) + "...";
      }
      else if (length >= 0)
      {
         result = "...".substring(0, length);
      }
      return result;
   }
}