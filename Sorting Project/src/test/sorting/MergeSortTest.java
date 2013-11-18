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
      
      int first = 0;
      int last = super.numList.length-1;
      
      // Mergesort call
      mergesort(super.numList, first, last);
      
      long endTime = System.nanoTime(); 
      System.out.println("Test #" + (i+1) + " has completed.");
      super.runTime[i] = endTime - startTime;
    }
    
    System.out.println("Test(s) complete!"); 
  }
  
  public static void mergesort(int[ ] list, int first, int n)
  {
    int n1; // Size of the first half of the array
    int n2; // Size of the second half of the array
    
    if (n > 1)
    {
      // Compute sizes of the two halves
      n1 = n / 2;
      n2 = n - n1;
      
      mergesort(list, first, n1);      // Sort list[first] through list[first+n1-1]
      mergesort(list, first + n1, n2); // Sort list[first+n1] to the end
      
      // Merge Call
      // Merge the two sorted halves.
      merge(list, first, n1, n2);
    }
  } 
  
// Merge
  private static void merge(int[ ] list, int first, int n1, int n2)
  {
    int[ ] temp = new int[n1+n2]; // Create temp array
    int copied  = 0; // Number of elements copied from list to temp
    int copied1 = 0; // Number copied from the first half of list
    int copied2 = 0; // Number copied from the second half of list
    int i;           // Array index to copy from temp back into list
    
    // Merge elements, copying from two halves of list to the temp array.
    while ((copied1 < n1) && (copied2 < n2))
    {
      if (list[first + copied1] < list[first + n1 + copied2])
        temp[copied++] = list[first + (copied1++)];
      else
        temp[copied++] = list[first + n1 + (copied2++)];
    }
    
    // Copy any remaining entries in the left and right subarrays.
    while (copied1 < n1)
      temp[copied++] = list[first + (copied1++)];
    
    while (copied2 < n2)
      temp[copied++] = list[first + n1 + (copied2++)];
    
    // Copy from temp back to the list array.
    for (i = 0; i < n1+n2; i++)
      list[first + i] = temp[i];
  }  
}


