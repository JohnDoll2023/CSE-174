/*
 * Lab 12
 * Meisam Amjad
 * 
 * A lab in which you analyze the performance of
 * Bubble Sort and Binary Search
 *
 */
import java.util.Random;

public class SortSearchLab {
   public static void main(String[] args) {
      
      // Creates an array of of 5 elements with
      // values ranging from 0 to 49:
      int[] data = randomArray(100000, 1000);
      binarySearch(data,90055);
      
      
      
      
      
      
      //for (int n : data) System.out.print(n + " ");
      //System.out.println();
      
   }
   
   // Sorting methods have a return type of void,
   // typically.  That's because the method has
   // access to the original array and can directly modify
   // it.  In other words, it does not need to create
   // and return a new array.  It just changes the existing array.
   public static void bubbleSort(int[] data) {
      int swap;
      int swaps = 0;
      int length = data.length;
      for(int j = 0; j < data.length -1; j++){
         
         for(int i = 0; i < data.length-1; i++) {
            if(data[i] > data[i+1]){
               swap = data[i];
               data[i]=data[i+1];
               data[i+1]=swap;
               swaps++;
            }
         }
      }
      System.out.println("Passes: " + (length-1));
      System.out.println("Comparisons: " + (length-1)*(length-1));
      System.out.println("Swaps: " + swaps);
      
            
      
      
      
   }
   
    /**
    * Linear search method
    * Worst case scenario takes O(n) big o of n time
    * to find the key
    * @param int key
    * @param int[] array
    * @return int index of key, or -1
    */
   public static int linearSearch(int key, int[] array) {
      for (int i = 0; i < array.length; i++) {
         if (key == array[i]) {
            System.out.printf("Number of values checked" +
                              "in Linear Search: %d\n", (i+1));
            return i;
         }
      }
      
      return -1;
   }
   
   // Returns an array of random int values ranging
   // from 0 to (max-1).  Don't change any of this
   // code.  142857 is a "seed".  It guarantees that the
   // stream of random numbers will be the same
   // each time the method is called.
   public static int[] randomArray(int max, int size) {
      Random rnd = new Random(142857);
      
      int[] result = new int[size];
      
      for (int i = 0; i < size; result[i++] = rnd.nextInt(max));
      
      return result;
   }
   
   public static void binarySearch(int [] array, int search) {
      bubbleSort(array);
      int min = 0;
      int max = array.length-1;
      int count = 0;
      boolean value = false;
      while(max> min) {
         count++;
         int center = (min +max)/2;
         if(array[center] == search) {
            System.out.println( center);
            value =true;
            break; 
         }
         else if (array[center] < search) 
            min = center+1;
         else if(array[center] > search)
            max = center -1;
      }
      System.out.println("Count: " + count);
      if(!value) 
         System.out.println( -1);
   }
}