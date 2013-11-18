package test.sorting;
import java.util.*;

public class HeapSortTest extends SortingTest {

 public HeapSortTest(int s, int n) {
  super(s, n);
 }
 
public void runTest() {
  
  System.out.println("Running heapsort " + super.numTests + " times on " + super.size + " elements.");
  
  for(int i = 0; i < super.numTests; ++i) {
   super.generateNewList();
   System.out.println("Starting test #" + (i+1) + "." );
   long startTime = System.nanoTime();
   
   //Algorithm or algorithm call here
   // Create a priority queue of integers 
       // and use it to sort the array 
       PriorityQueue<Integer> pQueue =  
            new PriorityQueue<Integer>();        
       for (int x : super.numList) pQueue.add(x); 
       for (int k = 0; k < super.numList.length; k++)  
       super.numList[k] = pQueue.poll();
   
   long endTime = System.nanoTime(); 
   System.out.println("Test #" + (i+1) + " has completed.");
   super.runTime[i] = endTime - startTime;
  }
  
  System.out.println("Test(s) complete!");
  
 }

}
