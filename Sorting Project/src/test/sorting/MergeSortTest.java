package test.sorting;

public class MergeSortTest extends SortingTest {

 public MergeSortTest(int s, int n) {
  super(s, n);
 }
 
public void runTest() {
  
  System.out.println("Running mergesort " + super.numTests + " times on " + super.size + " elements.");
  
  for(int i = 0; i < super.numTests; ++i) {
   super.generateNewList();
   System.out.println("Starting test #" + (i+1) + "." );
   long startTime = System.nanoTime();
   
   //Algorithm or algorithm call here
   //merge(data, i, super.s, super.n);
   
   long endTime = System.nanoTime(); 
   System.out.println("Test #" + (i+1) + " has completed.");
   super.runTime[i] = endTime - startTime;
  }
  
  System.out.println("Test(s) complete!"); 
 }
}
// Merge Sort
/*
private static void merge(int[ ] data, int first, int n1, int n2)
   // Precondition: Smallest to Largest
   {
      int[ ] temp = new int[n1+n2]; // Allocate the temporary array
      int copied  = 0; // Number of elements copied from data to temp
      int copied1 = 0; // Number copied from the first half of data
      int copied2 = 0; // Number copied from the second half of data
      int i;           // Array index to copy from temp back into data

      // Merge elements, copying from two halves of data to the temporary array.
      while ((copied1 < n1) && (copied2 < n2))
      {
         if (data[first + copied1] < data[first + n1 + copied2])
            temp[copied++] = data[first + (copied1++)];
         else
            temp[copied++] = data[first + n1 + (copied2++)];
      }

      // Copy any remaining entries in the left and right subarrays.
      while (copied1 < n1)
         temp[copied++] = data[first + (copied1++)];
      while (copied2 < n2)
         temp[copied++] = data[first + n1 + (copied2++)];

      // Copy from temp back to the data array.
      for (i = 0; i < n1+n2; i++)
         data[first + i] = temp[i];
   }  
}
*/
