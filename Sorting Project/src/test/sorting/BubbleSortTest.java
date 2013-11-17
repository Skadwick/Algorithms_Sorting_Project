package test.sorting;
import java.util.*;

public class BubbleSortTest extends SortingTest {
  
  public BubbleSortTest(int s, int n) {
    super(s, n);
  }
  
  public void runTest() {
    
    System.out.println("Running bubble sort " + super.numTests + " times on " + super.size + " elements.");
    
    for(int i = 0; i < super.numTests; ++i) {
      super.generateNewList();
      System.out.println("Starting test #" + (i+1) + "." );
      long startTime = System.nanoTime();
      
      //Algorithm or algorithm call here
      bubbleSort(super.numList);
     
      long endTime = System.nanoTime(); 
      System.out.println("Test #" + (i+1) + " has completed.");
      super.runTime[i] = endTime - startTime;
    }
    
    System.out.println("Test(s) complete!");
    
  }

  
  /*
   * Runs through the list and swaps elements accordingly, until it 
   * reaches the end of the list. It does this until a pass through
   * the list is completed without any swaps being made.
   */
  private void bubbleSort(int[] list) {
	  
	  int len = list.length;
	  
	  boolean swapped;
	  
	  do{
		  swapped = false;
		  for(int i = 1; i < len; ++i) {
			  if( list[i-1] > list[i] ) {
				  int temp = list[i-1];
				  list[i-1] = list[i];
				  list[i] = temp;
				  swapped = true;
			  }
		  }
		  
		  //Each pass, the largest, 2nd largest, 3rd largest, etc... items are put
		  //into their final place.  Update len to reflect this.
		  len -= 1;
	  }while(swapped);
  } 
}


