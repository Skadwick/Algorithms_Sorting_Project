package test.sorting;

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
			
			long endTime = System.nanoTime();	
			System.out.println("Test #" + (i+1) + " has completed.");
			super.runTime[i] = endTime - startTime;
		}
		
		System.out.println("Test(s) complete!");
		
	}

}
