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
      
         // Quicksort call
         quickSort(super.numList, 0, super.numList.length-1);
      
         long endTime = System.nanoTime(); 
         System.out.println("Test #" + (i+1) + " has completed.");
         super.runTime[i] = endTime - startTime;
      }

      System.out.println("Test(s) complete!");
   }
 
   // Quicksort Method
   public void quickSort(int array[], int start, int end)
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
   
   /* Partition Method -
      Partition method selects the value in the middle
      of the array as the pivot. The list is rearranged so
      all the values less than the pivot are on its left
      and all the values greater than pivot are on its
      right.
   */
   private int partition(int array[], int start, int end)
   {
      int pivotValue, pivotIndex, mid;
   
      mid = (start + end) / 2;
   
      super.swap(array, start, mid);
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
      super.swap(array, start, pivotIndex);
      
      return pivotIndex;
   }
}
 

