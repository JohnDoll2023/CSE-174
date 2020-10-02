import java.util.Scanner;

public class IndexerTest {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a word and character to be indexed: ");
      String name = in.next();
      String search = in.next();
      System.out.print(Indexer.firstOccurence(name, search));
   }
}
      
      