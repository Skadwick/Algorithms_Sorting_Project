package test.sorting;

public class QuickSortTest extends SortingTest {

 public QuickSortTest(int s, int n) {
  super(s, n);
 }
 
public void runTest() {
  
  System.out.println("Running quicksort " + super.numTests + " times on " + super.size + " elements.");
  
  for(int i = 0; i < super.numTests; ++i) {
   super.generateNewList();
   System.out.println("Starting test #" + (i+1) + "." );
   long startTime = System.nanoTime();
   
   //Algorithm or algorithm call here
   // Sort the array.
      quickSort(array, 0, 9);
   
   long endTime = System.nanoTime(); 
   System.out.println("Test #" + (i+1) + " has completed.");
   super.runTime[i] = endTime - startTime;
  }
  
  System.out.println("Test(s) complete!");
  
 }

}
 /**
      The quickSort method uses the QuickSort algorithm to
      sort array, from array[start] through array[end].
      
      @param array The array to sort.
      @param start The starting subscript of the region
                   to sort.
      @param end The ending subscript of the region
                 to sort.
   */
   
  /* public static void quickSort(int array[], int start,
                                int end)
   {
      int pivotPoint;
      
      if (start < end)
      {
         // Get the pivot point.
         pivotPoint = partition(array, start, end);
         
         // Sort the first sub list.
         quickSort(array, start, pivotPoint - 1);
         
         // Sort the second sub list.
         quickSort(array, pivotPoint + 1, end);
      }
   }
*/
   /**
      The partition method selects the value in the middle
      of the array as the pivot. The list is rearranged so
      all the values less than the pivot are on its left
      and all the values greater than pivot are on its
      right.
      
      @param array The array being sorted.
      @param start The starting subscript of the region
                   to sort.
      @param end The ending subscript of the region
                 to sort.
   */
   
 /*  private static int partition(int array[], int start,
                                int end)
   {
      int pivotValue, pivotIndex, mid;

      mid = (start + end) / 2;

      swap(array, start, mid);
      pivotIndex = start;
      pivotValue = array[start];
      for (int scan = start + 1; scan <= end; scan++)
      {
         if (array[scan] < pivotValue)
         {
            pivotIndex++;
            swap(array, pivotIndex, scan);
         }
      }     
      swap(array, start, pivotIndex);
      
      return pivotIndex;
   }
   */
   /**
      The swap method swaps the element at array[a] with
      the element at array[b].
      @param array The array containing the elements.
      @param The first element to swap.
      @param The second element to swap.
   */
   /*
   private static void swap(int[] array, int a, int b)
   {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}
*/

