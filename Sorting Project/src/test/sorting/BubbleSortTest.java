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
      // Bubble Sort ---------------------------------------------------------------
    /* int j;
      
      boolean flag = true; // Set flag to true to begin first pass
      int temp; // Holding variable
      
      while ( flag )
      {
        flag= false; // Set flag to false awaiting a possible swap
        for(j=0; j < super.numTests.length-1; j++)
        {
          if(numTests[j] < numTests[j+1]) // Change to > for ascending sort
          {
            temp = numTests[j]; // Swap elements
            numTests[j] = numTests[j+1];
            numTests[j+1] = temp;
            flag = true; // Shows a swap occurred  
          } 
        } 
      } 
      */
      //-------------------------------------------------------------------------------------
      
      long endTime = System.nanoTime(); 
      System.out.println("Test #" + (i+1) + " has completed.");
      super.runTime[i] = endTime - startTime;
    }
    
    System.out.println("Test(s) complete!");
    
  } 
}


