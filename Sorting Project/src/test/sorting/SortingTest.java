package test.sorting;

import java.util.Random;


public class SortingTest {
	
	
	protected int size;

	protected int numTests;
		
	protected int[] numList;
	
	protected long[] runTime;
	
	protected Random randNum;
	

	public SortingTest(int s, int n) {
		
		size = s;
		numTests = n;
		
		numList = new int[size];
		runTime = new long[numTests];
		randNum = new Random();
	}
	
	
	//This should only be called by classes extending SortingTest
	public void runTest() {
		System.out.println("Running test...");		
	}


	public long[] getRunTime() {
		return runTime;
	}
	
	
	public long getAvgRunTime() {
		long avgRunTime = 0;
		for(long time : runTime) {
			avgRunTime += time;
		}
		avgRunTime /= numTests;
		return avgRunTime;
	}
	
	
	protected void generateNewList() {
		for(int i = 0; i < size; ++i) {
			numList[i] = randNum.nextInt();
		}
	}

	

}
