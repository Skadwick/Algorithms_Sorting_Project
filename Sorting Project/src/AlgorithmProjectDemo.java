import java.util.Scanner;

import test.sorting.BubbleSortTest;
import test.sorting.HeapSortTest;
import test.sorting.MergeSortTest;
import test.sorting.QuickSortTest;
import test.sorting.SelectionSortTest;
import test.sorting.SortingTest;

public class AlgorithmProjectDemo {
	
	public static void main(String[] args) {
		
		int iSort, iSize, iNumTst;
		
		long[] runTime;
		
		long avgTime;
		
		SortingTest mainTest = null;
		
		Scanner usrInpt = new Scanner(System.in);		
		
		//Ask user which algorithm to use.
		System.out.print("Which sorting algorithm would you like to test?\n" + 
						"1) Selection sort\n" + 
						"2) Bubble sort\n" + 
						"3) Mergesort\n" + 
						"4) Quicksort\n" + 
						"5) Heapsort\n");
		do {
			iSort = usrInpt.nextInt();
		}while(iSort < 1 || iSort > 5);
		

		//Ask user for an input size.
		System.out.println("How many elements to test the sort on?");
		do {
			iSize = usrInpt.nextInt();
		}while(iSize < 2);


		//Ask user for number of tests.
		System.out.println("How many times do you want to run the test?");
		do {
			iNumTst = usrInpt.nextInt();
		}while(iNumTst < 1);
		
		
		//Initializing the appropriate test type.		
		switch(iSort) {
			case 1: mainTest = new SelectionSortTest(iSize, iNumTst); break;
			case 2: mainTest = new BubbleSortTest(iSize, iNumTst); break;
			case 3: mainTest = new MergeSortTest(iSize, iNumTst); break;
			case 4: mainTest = new QuickSortTest(iSize, iNumTst); break;
			case 5: mainTest = new HeapSortTest(iSize, iNumTst); break;
			default: System.out.println("Algorithm not found."); break;
		}
		
		
		//Run the test.
		mainTest.runTest();
		runTime = mainTest.getRunTime();
		avgTime = mainTest.getAvgRunTime();
      Double avgTimeSec = (double)avgTime/1000000000;
		
		//Print outputs.
		System.out.println("Results: ");
		for(int i = 0; i < runTime.length; ++i) {
			System.out.println("Test #" + (i+1) + ": " + runTime[i] + "ns");
		}
		System.out.println("Average run time: " + avgTimeSec + " seconds (" + avgTime + "ns)");

	}

}